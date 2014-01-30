package com.epam.xpmc.behavior.login;

import com.epam.xpmc.behavior.BaseBehavior;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBehavior extends BaseBehavior {

  private LoginAssert loginAssert = new LoginAssert();

  @Given("^User wants to login$")
  public void user_wants_to_login() {
    user.atLoginPage().open();
  }

  @When("^User login to the system with username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void user_login_to_the_system_with_username_and_password(String username,
                                                                   String password) {
    user.atLoginPage().fillForm(username, password);
    user.atLoginPage().clickLogInButton();
  }

  @Then("^User should see Test Management plugin page$")
  public void user_should_see_Test_Management_plugin_page() {
      loginAssert.checkThatTestManagemantPageOpened();
  }

//  @Then("^Administrator should see login page$")
//  public void administratorShouldSeeLoginPage() {
//      loginAssert.checkThatPageOpened();
//  }
}
