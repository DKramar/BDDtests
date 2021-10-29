package cucumberTest.stepDefinition;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumberTest.methods.LoginPageMethods;
import org.junit.Assert;

public class LoginSteps {
  LoginPageMethods loginPageMethods = new LoginPageMethods();

  @Given("Instructor Center page is displayed")
  public void instructorCenterPageIsDisplayed() {
    Assert.assertEquals(
        "Instructor Center Logo: Link to Home Page",
        loginPageMethods.verifyInstructorMainPageElement());
  }

  @When("User Navigates to SignIn button and click on it")
  public void UserNavigatesToSignInButtonAndClickOnIt() {
    loginPageMethods.clickOnSignInButton();
  }

  @Then("Okta page is displayed")
  public void oktaPageIsDisplayed() {
    Assert.assertEquals(
        "okta-sign-in-header auth-header", loginPageMethods.verifyOKTAPageElement());
  }

  @And("User enters UserName")
  public void userEntersUserName() {
    loginPageMethods.enterUserEmail("fx.test.instructor6@fauxuni.edu");
    loginPageMethods.clickOnNextButton();
  }

  @And("User enters Password")
  public void UserEntersPassword() {
    loginPageMethods.enterPassword("Cengage27");
    loginPageMethods.clickOnSubmitButton();
  }

  @Then("FX dashboard page is displayed")
  public void FXDashboardPageIsDisplayed() {
    Assert.assertEquals("Search for Products", loginPageMethods.verifyDashboardPageElement());
  }
}
