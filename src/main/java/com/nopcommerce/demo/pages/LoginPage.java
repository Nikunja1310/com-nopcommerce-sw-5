package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS,"Getting Welcome Text");
        Reporter.log("Getting Welcome Text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
CustomListeners.test.log(Status.PASS,"Enter Email Field : " + email);
Reporter.log("Enter email " + email + " in email field " + email.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password Field : " + password);
        Reporter.log("Enter Password " + password + " in Password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click on Login button ");
        Reporter.log("Click on Login button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS,"Get Error message ");
        Reporter.log("Get Error message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogout() {
        CustomListeners.test.log(Status.PASS,"Click on Login button ");
        Reporter.log("Click on Login button " + logOutLink.toString());
        clickOnElement(logOutLink);
    }
}