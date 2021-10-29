package cucumberTest.methods;

import cucumberTest.base.BaseTest;
import org.openqa.selenium.By;

public class LoginPageMethods extends BaseTest {

  private final By instructorCenterPageText =
      By.xpath("//*[contains(text(),'Instructor Center Logo: Link to Home Page')]");
  private final By signInButton = By.id("login-home-button");
  private final By octaPageText = By.className("okta-sign-in-header auth-header");
  private final By userEmailField = By.id("idp-discovery-username");
  private final By nextButton = By.id("idp-discovery-submit");
  private final By passwordField = By.id("okta-signin-password");
  private final By signInPasswordButton = By.id("okta-signin-submit");
  private final By dashboardPageText = By.xpath("//*[contains(text(),'Search for Products')]");

  public String verifyInstructorMainPageElement() {
    return findElement(instructorCenterPageText).getText();
  }

  public void clickOnSignInButton() {
    findElement(signInButton).click();
  }

  public String verifyOKTAPageElement() {
    return findElement(octaPageText).getText();
  }

  public void enterUserEmail(String userEmail) {
    findElement(userEmailField).sendKeys(userEmail);
  }

  public void clickOnNextButton() {
    findElement(nextButton).click();
  }

  public void enterPassword(String userPassword) {
    findElement(passwordField).sendKeys(userPassword);
  }

  public void clickOnSubmitButton() {
    findElement(signInPasswordButton).click();
  }

  public String verifyDashboardPageElement() {
    return findElement(dashboardPageText).getText();
  }
}
