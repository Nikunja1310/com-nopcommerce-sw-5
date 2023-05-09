package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Nikunja A Senjalia
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS, "Click on login button");
        Reporter.log("Clicking on Login" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        CustomListeners.test.log(Status.PASS, "Click on Register");
        Reporter.log("Click on register Link");
        clickOnElement(registerLink);
    }

}
