import static org.openqa.selenium.By.xpath;

import dev.failsafe.internal.util.Assert;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {
  WebDriver driver = new ChromeDriver();

  @AfterEach
  void afterEach() {
    driver.quit();
  }

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
    driver.manage().window().maximize();
    //Клик по кнопке
    driver.findElement(xpath("//div[@class='col-12 col-lg-auto order-3 order-lg-1']//a[@class='navbar__tutorial-menu']")).click();

    String getTitle = driver.getTitle();
    Assertions.assertEquals(getTitle, "Tools QA - Selenium Training");

  }

  @Test
  void webtestthree() {
    //Открываю
    driver.get("https://www.toolsqa.com/selenium-training/");
    driver.manage().window().maximize();
    //Клик по About
    driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[@href='/about']")).click();

    String getTitle = driver.getTitle();
    Assertions.assertEquals(getTitle, "Tools QA | About Us");
  }

  @Test
  void webtestfour() {
    driver.get("https://www.toolsqa.com/about");
    driver.manage().window().maximize();
    driver.navigate().to("https://demoqa.com/");

    String getTitle = driver.getTitle();
    Assertions.assertEquals(getTitle, "DEMOQA");

  }

}
