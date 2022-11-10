package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class EtsyPage {

    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement searchBtn;




}
