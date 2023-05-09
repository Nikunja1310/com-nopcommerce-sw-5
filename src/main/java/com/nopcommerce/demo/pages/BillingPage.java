package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BillingPage extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailLink;


    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberLink;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueLink;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingLink;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement shippingLink2;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardLink;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardLink;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardMonthLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement cardYearLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCVVLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement creditCardTextLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[starts-with(text(),'$')]")
    WebElement totalText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1[text()='Thank you']")
    WebElement headText;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement nextStep;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentNextStep;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoNextLink;


    public void enterFirstname(String name) {
        sendTextToElement(firstNameLink, name);
        Reporter.log("Enter First Name " +name + "in First name field " + firstNameLink.toString());
        CustomListeners.test.log(Status.PASS,"First Name : " + name);

    }

    public void enterLastname(String name) {
        sendTextToElement(lastNameLink, name);
        Reporter.log("Entering Last Name " + name + "in Last name field " + lastNameLink.toString());
        CustomListeners.test.log(Status.PASS,"Last Name : " + name);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailLink, email);
        Reporter.log("Entering Email "+email + "in email id field " + emailLink.toString() );
        CustomListeners.test.log(Status.PASS,"Email email ID : " + email);
    }

    public void selectCountry(String country) {
        selectByVisibleTextFromDropDown(countryLink, country);
        Reporter.log("Select Country "+ country + " from dropdown link " + countryLink.toString() );
        CustomListeners.test.log(Status.PASS,"Select Country : " + country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityLink, city);
        Reporter.log("Enter city name : " + city + " in city field " + cityLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter City : " + city);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressLink, address);
        Reporter.log("Enter Address : " + address + " in address field " + addressLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter Address : " + address);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postCodeLink, postcode);
        Reporter.log("Enter postcode : " + postcode + " in postcode field " + postCodeLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter postcode : " + postcode);

    }

    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumberLink, number);
        Reporter.log("Enter Phone number " + number + "in phone number field " + phoneNumberLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter Phone Number : " + number );
    }

    public void clickContinue() {
        clickOnElement(continueLink);
        Reporter.log("Click on Continue button " + continueLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Continue");
    }

    public void selectShipping() {
        clickOnElement(shippingLink);
        Reporter.log("Select Shipping " + shippingLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Shipping ");

    }

    public void clickCreditCard() {
        clickOnElement(creditCardLink);
        Reporter.log("Click on Credit card " + creditCardLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Credit card");
    }

    public void selectPaymentMethod() {
        clickOnElement(paymentMethodLink);
        Reporter.log("Select payment method " + paymentMethodLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Payment method");
    }

    public void selectCard(int index) {
        selectByIndexFromDropDown(cardLink, index);
        Reporter.log("Select Card " + cardLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Card");
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderNameLink, name);
        Reporter.log("Enter card holder name " + name + "in card holder name field " + continueLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter card holder name : " + name);
    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumberLink, number);
        Reporter.log("Enter card number " + number + "in card number field " + cardNumberLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter card number : " + number );

    }

    public void selectExpiryMonth(int month) {
        selectByIndexFromDropDown(cardMonthLink, month);
        Reporter.log("Select Expiry month : " + month+ "from Month dropdown " + cardMonthLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Expiry Month : " + month);
    }

    public void selectExpiryYear(int year) {
        selectByIndexFromDropDown(cardYearLink, year);
        Reporter.log("Select Expiry year : " + year + "from year dropdown " + cardYearLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Expiry year : " + year);
    }

    public void enterCVV(String cvv) {
        sendTextToElement(cardCVVLink, cvv);
        Reporter.log("Enter CVV : " + cvv + " in CVV field " + cardCVVLink.toString());
        CustomListeners.test.log(Status.PASS,"Enter CVV : " + cvv);
    }

    public String getPaymentText() {
        Reporter.log("Getting Payment Text " + getPaymentText().toString());
        CustomListeners.test.log(Status.PASS,"Getting payment Text");
        return getTextFromElement(creditCardTextLink);

    }

    public String getShippingText() {
        Reporter.log("Getting Shipping Text " + getShippingText().toString());
        CustomListeners.test.log(Status.PASS,"Getting Shipping Text");
        return getTextFromElement(shippingMethodText);
    }

    public String getPriceText() {
        Reporter.log("Getting Price Text " + getPriceText().toString());
        CustomListeners.test.log(Status.PASS,"Getting price Text");
        return getTextFromElement(totalText);
    }

    public void clickConfirm() {
        clickOnElement(confirmButton);
        Reporter.log("Click on Confirm button " + confirmButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Confirm button.");
    }

    public String getHeadText() {
        Reporter.log("Getting Head Text " + getHeadText().toString());
        CustomListeners.test.log(Status.PASS,"Getting Head Text");
        return getTextFromElement(headText);

    }

    public String getSuccessText() {
        Reporter.log("Getting Success Text " + getSuccessText().toString());
        CustomListeners.test.log(Status.PASS,"Getting Success Text");
        return getTextFromElement(successText);

    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        Reporter.log("Clicking on continue button " + confirmButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Continue button");
    }

    public void clickOnContinue() {
        Reporter.log("Clicking on continue button for next step " + nextStep.toString());
        CustomListeners.test.log(Status.PASS,"Click on Continue button for next Step");
        clickOnElement(nextStep);
    }

    public void clickPaymentContinue() {
        clickOnElement(paymentNextStep);
        Reporter.log("Clicking on Payment continue button  " + paymentNextStep.toString());
        CustomListeners.test.log(Status.PASS,"Click on Payment next step.");
    }

    public void clickOnPaymentContinue() {
        clickOnElement(paymentInfoNextLink);
        Reporter.log("Clicking on payment info continue  " + paymentInfoNextLink.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on payment info continue");
    }

    public void selectShipping2() {
        Reporter.log("Select Shipping link " + shippingLink2.toString());
        CustomListeners.test.log(Status.PASS,"Select Shipping link");
        clickOnElement(shippingLink2);
    }
}