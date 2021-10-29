@AllTest
Feature: Login Action

  @LogIn
  Scenario Outline: Successful Login with Valid Credentials
    Given Instructor Center page is displayed
    When User Navigates to SignIn button and click on it
    Then Okta page is displayed
    And User enters UserName
    And User enters Password
    Then FX dashboard page is displayed

    Examples:


#  Given defines a precondition to the test. For e.g. In the shopping website, assume that the LogIn page link is only
#  present on the Home Page, so the precondition for clicking the LogIn link is that the user is at the Home Page.

#  When keyword defines the test action that will be executed. By test action we mean the user input action.

#  Then keyword defines the Outcome of previous steps.

#  And keyword is used to add conditions to your steps.

#  But keyword is used to add negative type comments.