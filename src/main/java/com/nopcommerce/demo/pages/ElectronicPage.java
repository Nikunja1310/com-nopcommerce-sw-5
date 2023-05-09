package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Electronics")
    public WebElement electronicLink;

    @CacheLookup
            @FindBy(xpath = "//a[@title='List']")
    WebElement listViewLink;

    @CacheLookup
            @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement phoneLink;

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement headText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceText;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityLink;

    @CacheLookup
            @FindBy(xpath = "(//input[@value])[2]")
    WebElement getQuantity;

    public void selectListView(){
        Reporter.log("Select List View "+ listViewLink.toString());
        CustomListeners.test.log(Status.PASS,"Select List view");
        clickOnElement(listViewLink);
    }

    public void selectPhone(){

        Reporter.log("Select phone " + phoneLink.toString());
        CustomListeners.test.log(Status.PASS,"Select phone");
        clickOnElement(phoneLink);
    }

    public String getHeading(){

        Reporter.log("Getting Heading :  " + headText.toString());
        CustomListeners.test.log(Status.PASS,"Getting Heading");
        return getTextFromElement(headText);
    }

    public String getPrice(){

        Reporter.log("Getting Price " + getPrice().toString());
        CustomListeners.test.log(Status.PASS,"Getting price");
        return getTextFromElement(priceText);
    }

    public void changeQuantity(String quantity){
        Reporter.log("Change Quantity : " + quantity +  "from Quantity field " + quantityLink.toString());
        CustomListeners.test.log(Status.PASS,"Change Quantity : " + quantity );
        sendTextToElement(quantityLink,quantity);
    }
    public String getQuantity(){

        Reporter.log("Getting Quantity " + getQuantity.toString());
        CustomListeners.test.log(Status.PASS,"Getting Quantity");
        return (getQuantity).getAttribute("value");
    }
}