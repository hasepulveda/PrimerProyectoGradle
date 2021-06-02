package com.theinternet.herokuapp.automation;

import com.theinternet.herokuapp.automation.steps.HomeStep;
import com.theinternet.herokuapp.automation.steps.LoginStep;
import com.theinternet.herokuapp.automation.steps.MessageStep;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;

public class TestAuthentication {
    @Steps
    HomeStep homeStep = new HomeStep();
    @Steps
    LoginStep loginStep = new LoginStep();
    @Steps
    MessageStep messageStep = new MessageStep();

    @Test
    public void authenticationInHeroKuapp() throws InterruptedException {
        homeStep.openBrowser();
        homeStep.clickFormAuthentication();
        loginStep.login();
        Thread.sleep(3000);
        messageStep.messagelogin();
    }

}
