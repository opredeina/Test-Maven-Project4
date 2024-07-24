import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data{

  private final By inputFirstName = By.xpath("//input[@id='firstName']");
  private final By inputLastName = By.xpath("//input[@id='lastName']");
  private final By inputEmail = By.xpath("//input[@id='userEmail']");
  private final By inputMobile = By.xpath("//input[@id='userNumber']");
  private final By textareaСurrentAddress = By.xpath("//textarea[@id='currentAddress']");
  private final By btnJoin = By.xpath("//button[@type='submit']");


  @Test
  void registration(){

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();

    driver.get(getDate.getUrl);
    driver.manage().window().maximize();
    driver.findElement(inputFirstName).sendKeys(getDate.fistName);
    driver.findElement(inputLastName).sendKeys(getDate.lastName);
    driver.findElement(inputEmail).sendKeys(getDate.email);
    driver.findElement(inputMobile).sendKeys(getDate.mobile);
    driver.findElement(textareaСurrentAddress).sendKeys(getDate.currentAddress);
    driver.findElement(btnJoin).click();
  }
}


