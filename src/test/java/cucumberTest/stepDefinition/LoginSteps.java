package cucumberTest.stepDefinition;

import cucumberTest.base.BaseTest;
import cucumberTest.methods.LoginPageMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends LoginPageMethods {
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

  @And("User enters {string} and {string}")
  public void userEnters(String userName, String password) {
    loginPageMethods.enterUserEmail(userName);
    loginPageMethods.clickOnNextButton();
    loginPageMethods.enterPassword(password);
    loginPageMethods.clickOnSubmitButton();
  }

  @Then("FX dashboard page is displayed")
  public void FXDashboardPageIsDisplayed() {
    Assert.assertEquals("Search for Products", loginPageMethods.verifyDashboardPageElement());
  }
}
