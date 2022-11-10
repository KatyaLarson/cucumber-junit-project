package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudContacts {

    public TryCloudContacts(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@href='/index.php/apps/contacts/']")
    public WebElement contactButton;


}
