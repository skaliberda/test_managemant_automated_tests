package com.epam.xpmc.steps;

import org.openqa.selenium.support.PageFactory;

import com.epam.xpmc.core.Driver;
import com.epam.xpmc.pages.TestManagemantPage;
import com.epam.xpmc.pages.LoginPage;

public class User {

  private LoginPage loginPage = PageFactory.initElements(Driver.getInstance(), LoginPage.class);

  public LoginPage atLoginPage() {
    if (loginPage == null) {
     loginPage = PageFactory.initElements(Driver.getInstance(), LoginPage.class);
    }
    return loginPage;
  }

  public TestManagemantPage atHomePage() {
    return PageFactory.initElements(Driver.getInstance(), TestManagemantPage.class);
  }

  public void login() {
    atLoginPage().open();
    atLoginPage().fillForm("admin", "admin");
    atLoginPage().clickLogInButton();
  }

}
