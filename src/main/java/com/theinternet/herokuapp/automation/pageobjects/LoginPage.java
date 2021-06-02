package com.theinternet.herokuapp.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {

    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button");

    public void setUsername(){
        getDriver().findElement(username).sendKeys("tomsmith");
    }
    public void setPassword(){
        getDriver().findElement(password).sendKeys("SuperSecretPassword!");
    }
    public void clickLoginButton(){
        getDriver().findElement(loginButton).click();
    }
}
