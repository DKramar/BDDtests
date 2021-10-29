package cucumberTest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseTest {
  public static WebDriver driver;

  public static WebElement findElement(By ByElement) {
    return driver.findElement(ByElement);
  }
}
