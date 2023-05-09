package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicTest extends BaseTest {
    TopMenu topMenu;
    ComputerPage computerPage;
    ShoppingCartPage shoppingCartPage;
    BillingPage billingPage;
    ElectronicPage electronicPage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {

        topMenu = new TopMenu();
        computerPage = new ComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        billingPage = new BillingPage();
        electronicPage = new ElectronicPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();

    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        computerPage.mouseHoverToElement(electronicPage.electronicLink);
        topMenu.selectMenu("Cell phones");
        Thread.sleep(1000);
        Assert.assertEquals(topMenu.getHeadingText(), "Cell phones", "Navigation is not successful");
    }

    @Test(groups = {"sanity","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        computerPage.mouseHoverToElement(electronicPage.electronicLink);
        topMenu.selectMenu("Cell phones");
        Thread.sleep(1000);
        Assert.assertEquals(topMenu.getHeadingText(), "Cell phones", "Navigation is not successful");
        electronicPage.selectListView();
        Thread.sleep(2000);
        electronicPage.selectPhone();
        Assert.assertEquals(electronicPage.getHeading(), "Nokia Lumia 1020", "navigation not successful");
        Assert.assertEquals(electronicPage.getPrice(), "$349.00", "Price is not correct");
        electronicPage.changeQuantity("2");
        Thread.sleep(1000);
        computerPage.addToCart();
        Thread.sleep(1000);
        Assert.assertEquals(computerPage.getSuccessMessage(), "The product has been added to your shopping cart", "Product is not added successfully");
        computerPage.closeMessage();
        computerPage.mouseHoverToElement(computerPage.shoppingCartLink);
        computerPage.clickOnGoToCart();
        Assert.assertEquals(topMenu.getHeadingText(), "Shopping cart", "Shopping cart not displayed successfully");
        Thread.sleep(2000);
        Assert.assertEquals(electronicPage.getQuantity(), "2", "Quantity is not correct");
        Assert.assertEquals(shoppingCartPage.getPrice(), "$698.00", "Price is not updated");
        shoppingCartPage.termsAndCondition();
        shoppingCartPage.goCheckout();
        Thread.sleep(1000);
        Assert.assertEquals(topMenu.getHeadingText(), "Welcome, Please Sign In!", "Checkout navigation not succeed");
        shoppingCartPage.clickOnRegister();
        Assert.assertEquals(topMenu.getHeadingText(), "Register", "Navigation not successful");
        registerPage.enterFirstname("PrimeNik");
        registerPage.enterLastname("TestNik");
        registerPage.enterEmail("primenik@gmail.com");
        registerPage.enterPassword("Niks@123");
        registerPage.enterConfirmPassword("Niks@123");
        registerPage.clickOnRegister();
        Assert.assertEquals(registerPage.getRegisterMessage(), "Your registration completed", "Registration is not done");
        registerPage.clickOnContinue();
        Assert.assertEquals(topMenu.getHeadingText(), "Shopping cart", "Shopping cart not displayed successfully");
        registerPage.clickOnLoginLink();
        loginPage.enterEmailId("primenik@gmail.com");
        loginPage.enterPassword("Niks@123");
        loginPage.clickOnLoginButton();
        shoppingCartPage.termsAndCondition();
        shoppingCartPage.goCheckout();
        billingPage.selectCountry("United Kingdom");
        billingPage.enterCity("London");
        billingPage.enterAddress("London road");
        billingPage.enterPostcode("301202");
        billingPage.enterPhoneNumber("526541230");
        billingPage.clickContinue();
        billingPage.selectShipping2();
        Thread.sleep(1000);
        billingPage.clickOnContinue();
        billingPage.clickCreditCard();
        Thread.sleep(1000);
        billingPage.clickPaymentContinue();
        billingPage.selectPaymentMethod();
        billingPage.selectCard(0);
        billingPage.enterCardHolderName("Prime Testing");
        billingPage.enterCardNumber("1234567891234");
        billingPage.selectExpiryMonth(1);
        billingPage.selectExpiryYear(2);
        billingPage.enterCVV("742");
        billingPage.clickOnPaymentContinue();
        Assert.assertEquals(billingPage.getPaymentText(), "Payment Method: Credit Card", "Payment method not right");
        Assert.assertEquals(billingPage.getShippingText(), "Shipping Method: 2nd Day Air", "Shipping method not correct");
        Assert.assertEquals(billingPage.getPriceText(), "$698.00", "Price not correct");
        billingPage.clickConfirm();
        Thread.sleep(1000);
        Assert.assertEquals(billingPage.getHeadText(), "Thank you", "Not confirmed");
        Assert.assertEquals(billingPage.getSuccessText(), "Your order has been successfully processed!", "Order Not done Successfully");
        billingPage.clickOnContinueButton();
        Assert.assertEquals(topMenu.getHeadingText(), "Welcome to our store", "Message not displayed");
        loginPage.clickOnLogout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Log out not successful");
    }
}

