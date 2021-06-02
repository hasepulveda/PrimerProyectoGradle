package com.theinternet.herokuapp.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://the-internet.herokuapp.com/")

public class HomePage extends PageObject {

    By  formAuthentication = By.xpath("//a[@href=\"/login\"]");

    public void clickFormAuthentication(){
        getDriver().findElement(formAuthentication).click();
    }
}
