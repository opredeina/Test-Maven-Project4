import static org.openqa.selenium.By.xpath;

import dev.failsafe.internal.util.Assert;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
  WebDriver driver = new ChromeDriver();

  @Test
  void webtestone() {
    //Открываю
    driver.get("https://demoqa.com/");
    //Перехожу кликом по баннеру
    driver.findElement(By.xpath("//div[@class='home-banner']//a[@href='https://www.toolsqa.com/selenium-training/']")).click();

  }

  @Test
  void webtesttwo() {
    //Открываю
    driver.get("https://www.toolsqa.com/selenium-training/");
    //Клик по кнопке
    driver.findElement(By.xpath("//div[@class='col-12 col-lg-auto order-3 order-lg-1']//a[@class='navbar__tutorial-menu']")).click();

  }

  @Test
  void webtestthree() {
    //Открываю
    driver.get("https://www.toolsqa.com/selenium-training/");
    //Клик по About
    driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[@href='/about']")).click();
    //На весь экран
    driver.manage().window().maximize();

  }

  @Test
  void webtestfour() {
    driver.get("https://www.toolsqa.com/about");
    driver.manage().window().maximize();
    driver.navigate().to("https://demoqa.com/");

    driver.quit();
  }

}
