package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends WebTableLoginPage {

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//a[contains(@href,'/create-order')]/button")
    public WebElement orderBtn;
@FindBy(name = "product")
    public WebElement selectProduct;

@FindBy(xpath = "//input[@name='quantity']")
public WebElement inputQuantity;

@FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;

@FindBy(xpath = "//input[@name='street']")
public WebElement streetName;

@FindBy(xpath = "//input[@name='city']")
public WebElement cityName;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateName;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(name= "card")
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNum;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement orderSubmitBtn;

   @FindBy(xpath ="//tbody/tr[1]/td[1]")
    public WebElement firstRowInWebTable;

}
