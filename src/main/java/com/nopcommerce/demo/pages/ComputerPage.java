package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Computers")
    public WebElement computerLink;


    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement dropDownLink;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']")
    WebElement listLink;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement RAMLink;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osLink;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement checkboxLink;

    @CacheLookup
    @FindBy(id = "price-value-1")

    WebElement priceLink;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessageLink;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Go to cart'])[1]")
    WebElement goToCartLink;



    public void selectFromDropDown(String value) {
        Reporter.log("Select value from drop down " + value + dropDownLink.toString());
        CustomListeners.test.log(Status.PASS,"Select value from Dropdown");
        selectByVisibleTextFromDropDown(dropDownLink, value);
    }

    public List getList() {
        List<WebElement> list = (List<WebElement>) listLink;
        List<String> orignalList = new ArrayList<>();
        for (WebElement e : list) {
            orignalList.add(e.getText());
        }
        Reporter.log("Get List : " + listLink.toString());
        CustomListeners.test.log(Status.PASS,"Getting list.");
        return orignalList;
    }

    public void addToCart() {
        Reporter.log("Click on Add to cart " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Add to cart");
        clickOnElement(addToCartButton);
    }

    public void selectProcessor(String value) {
        Reporter.log("Select Processor : " + value +  "from dropdown " + processorLink.toString());
        CustomListeners.test.log(Status.PASS,"Select processor");
        selectByValueFromDropDown(processorLink, value);
    }

    public void selectRAM(String value) {
        Reporter.log("Select RAM : " + value +  " from dropdown " + RAMLink.toString());
        CustomListeners.test.log(Status.PASS,"Select RAM from dropdown");
        selectByVisibleTextFromDropDown(RAMLink, value);
    }

    public void selectHddRadio() {
        Reporter.log("Select HDD radio " + hddRadio.toString());
        CustomListeners.test.log(Status.PASS,"Select Hdd Radio");
        clickOnElement(hddRadio);
    }

    public void selectOs() {
        Reporter.log("Select OS " + osLink.toString());
        CustomListeners.test.log(Status.PASS,"Select OS");
        clickOnElement(osLink);
    }

    public void selectCheckBox() {
        Reporter.log("Select Checkbox " + checkboxLink.toString());
        CustomListeners.test.log(Status.PASS,"Select Check box");
        clickOnElement(checkboxLink);
    }

    public String getPrice() {
        Reporter.log("Getting price " + priceLink.toString());
        CustomListeners.test.log(Status.PASS,"Get Price");
        return getTextFromElement(priceLink);
    }

    public String getSuccessMessage() {
        Reporter.log("Get Success message " + successMessageLink.toString());
        CustomListeners.test.log(Status.PASS,"Get Success message");
        return getTextFromElement(successMessageLink);
    }

    public void closeMessage() {
        Reporter.log("Close message " + closeLink.toString());
        CustomListeners.test.log(Status.PASS,"CLose message");
        clickOnElement(closeLink);
    }

    public void clickOnGoToCart() {
        Reporter.log("Click on go to cart " + goToCartLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Go To Cart");
        clickOnElement(goToCartLink);
    }
}