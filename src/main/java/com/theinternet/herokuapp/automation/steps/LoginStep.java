package com.theinternet.herokuapp.automation.steps;

import com.theinternet.herokuapp.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    LoginPage loginStep = new LoginPage();

    @Step
    public void  login(){
        loginStep.setUsername();
        loginStep.setPassword();
        loginStep.clickLoginButton();
    }

}
