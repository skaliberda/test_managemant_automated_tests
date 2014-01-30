package com.epam.xpmc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id = "login-form-username")
	private WebElement loginField;

	@FindBy(id = "login-form-password")
	private WebElement passwordField;
	
	@FindBy(id = "login-form-submit")
	private WebElement loginButton;
	
	public void open() {
		getDriver().get("http://10.253.129.133:8080/secure/TestManagementAction.jspa");
	}

	public void fillForm(String username, String password) {
		loginField.sendKeys(username);
		passwordField.sendKeys(password);
	}

	public void clickLogInButton() {
		loginButton.click();
	}
}
