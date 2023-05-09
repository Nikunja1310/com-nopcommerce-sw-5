package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityLink;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement priceLink;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsAndConditionLink;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutGuestLink;

    @CacheLookup
    @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
    WebElement registerLink;

    public void changeQuantity(String quantity) {
        CustomListeners.test.log(Status.PASS,"Change Quantity : " + quantity);
        Reporter.log("Change Quantity " + quantity + " in " + quantityLink.toString());
        sendTextToElement(quantityLink, quantity);
    }

    public void updateCart() {
        CustomListeners.test.log(Status.PASS,"Update cart");
        Reporter.log("Update Cart " + updateCartLink.toString());
        clickOnElement(updateCartLink);
    }

    public String getPrice() {
        CustomListeners.test.log(Status.PASS,"Get price");
        Reporter.log("Get price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }

    public void termsAndCondition() {
        CustomListeners.test.log(Status.PASS,"Click on Terms and condition");
        Reporter.log("Click on Terms and condition " + termsAndConditionLink.toString());
        clickOnElement(termsAndConditionLink);
    }

    public void goCheckout() {
        CustomListeners.test.log(Status.PASS,"Click on Checkout");
        Reporter.log("Click on Checkout " + checkoutLink.toString());
        clickOnElement(checkoutLink);
    }

    public void clickCheckoutAsGuest() {
        CustomListeners.test.log(Status.PASS,"Click on checkout as Guest");
        Reporter.log("Click on Checkout as Guest " + checkoutGuestLink.toString());
        clickOnElement(checkoutGuestLink);
    }

    public void clickOnRegister() {
        CustomListeners.test.log(Status.PASS,"Click on Register");
        Reporter.log("Click on Register " + registerLink.toString());
        clickOnElement(registerLink);
    }
}