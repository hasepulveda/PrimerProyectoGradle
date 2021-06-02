package com.theinternet.herokuapp.automation.steps;

import com.theinternet.herokuapp.automation.pageobjects.MessagePage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class MessageStep {
    MessagePage messagePage = new MessagePage();

    @Step
    public void messagelogin(){
        Assertions.assertEquals("You logged into a secure area!",messagePage.messageLogin().substring(0,30));
    }

}
