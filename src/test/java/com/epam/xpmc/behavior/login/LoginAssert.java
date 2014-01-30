package com.epam.xpmc.behavior.login;

import com.epam.xpmc.pages.LoginPage;

public class LoginAssert extends LoginPage {

    public void checkThatPageOpened() {
//        assertTrue(getDriver().findElement(By.id("login-form-submit")).isDisplayed());
    }

    public void checkThatTestManagemantPageOpened() {
//        assertTrue(getDriver().findElement(By.linkText("Sign Out")).isDisplayed());
    }
}
