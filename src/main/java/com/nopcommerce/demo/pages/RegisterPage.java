package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender' and @value='F']")
    WebElement femaleRadio;


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'E')]")
    WebElement emailLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    public void selectGender() {
        CustomListeners.test.log(Status.PASS,"Select Female Gender ");
        Reporter.log("Select Radio button " + femaleRadio.toString());
        clickOnElement(femaleRadio);
    }

    public void enterFirstname(String name) {
        CustomListeners.test.log(Status.PASS,"Enter first name " + name + "in first name field ");
        Reporter.log("Enter first name : " + name + firstNameLink.toString());
        sendTextToElement(firstNameLink, name);
    }

    public void enterLastname(String name) {
        CustomListeners.test.log(Status.PASS,"Enter last name " + name + "in last name field ");
        Reporter.log("Enter Last name : " + name + lastNameLink.toString());
        sendTextToElement(lastNameLink, name);
    }

    public void enterEmail(String email) {
        CustomListeners.test.log(Status.PASS,"Enter Email " + email + "in email field ");
        Reporter.log("Enter Email : " + email+ " in email field " + emailLink.toString());
        sendTextToElement(emailLink, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password " + password + "in first name field ");
        Reporter.log("Enter Password : " + password + " in password field  " + passwordLink.toString());
        sendTextToElement(passwordLink, password);
    }

    public void enterConfirmPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password " + password + "in confirm password field ");
        Reporter.log("Enter password : " + password + confirmPasswordLink.toString());
        sendTextToElement(confirmPasswordLink, password);
    }

    public void clickOnRegister() {
        CustomListeners.test.log(Status.PASS,"Click on Register");
        Reporter.log("Click on Register button " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getRegisterMessage() {
        CustomListeners.test.log(Status.PASS,"Get Register message ");
        Reporter.log("Get register message " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }

    public void clickOnContinue() {
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        Reporter.log("Click on Continue " + continueLink.toString());
        clickOnElement(continueLink);
    }

    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS,"Click on Login");
        Reporter.log("Click on Login " + loginLink.toString());
        clickOnElement(loginLink);
    }
}
