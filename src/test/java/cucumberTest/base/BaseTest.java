package cucumberTest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
  public static WebDriver driver = new ChromeDriver();

  public static WebElement findElement(By ByElement) {
    // TODO: у тебя переменная driver нигде не инициализируется - она всегда null, поэтому будет падать с NullPointerException
    //  Посмотри, как правильно ее  инициализировать или пробрасывать, или, мб, стоит заэкстендить какой-то класс
    WebElement element = driver.findElement(ByElement);
    return element;
  }
}
