package cucumberTest.stepDefinition;

import cucumberTest.base.BaseTest;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseTest {
  public static long PAGE_LOAD_TIMEOUT = 20;
  public static long IMPLICIT_WAIT = 20;
  private static final DesiredCapabilities capabilities = new DesiredCapabilities();

  @Before
  public void beforeScenario() {
    System.setProperty(
        "webdriver.chrome.driver",
        "D:\\Java-education-for-qa\\Student\\GchDriver\\chrome94\\chromedriver.exe");
    driver = new ChromeDriver();
    capabilities.setJavascriptEnabled(true);
    driver.manage().deleteAllCookies();
    driver.get("https://faculty-qa.cengage.com/");
    driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
  }
}
