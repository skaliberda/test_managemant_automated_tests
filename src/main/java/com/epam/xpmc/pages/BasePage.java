package com.epam.xpmc.pages;

import org.openqa.selenium.WebDriver;

import com.epam.xpmc.core.Driver;

public class BasePage {

  public WebDriver getDriver() {
    return Driver.getInstance();
  }
}
