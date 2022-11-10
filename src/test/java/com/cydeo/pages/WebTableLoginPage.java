package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    /**
     * This method will accept username and password and login to app
     * @param username
     * @param password
     */
    public void login(String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

}
