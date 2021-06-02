package com.theinternet.herokuapp.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {

    By messagelogin = By.id("flash");

    public String messageLogin (){
        return getDriver().findElement(messagelogin).getText();
    }

}
