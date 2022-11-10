package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefs  {

    WebTableOrderPage webTableOrderPage=new WebTableOrderPage();
    BasePage basePage=new BasePage();

    Select select;
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
      webTableOrderPage.login("Test","Tester");
      webTableOrderPage.orderBtn.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        select=new Select(webTableOrderPage.selectProduct);
        select.selectByVisibleText(string);
        /*List<String> product=BrowserUtils.dropdownOptionsAsString(webTableOrderPage.selectProduct);
        for (String each:product){
            if (string.equals(each));
            webTableOrderPage.selectProduct.click();

        }*/

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
       webTableOrderPage.inputQuantity.clear();
       webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));
       BrowserUtils.sleep(10);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
      webTableOrderPage.customerName.sendKeys(name);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.streetName.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.cityName.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
       webTableOrderPage.stateName.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
       webTableOrderPage.zip.sendKeys(zip);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,"american express");

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNum) {
        webTableOrderPage.cardNum.sendKeys(cardNum);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
       webTableOrderPage.cardExp.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
          webTableOrderPage.orderSubmitBtn.click();
          BrowserUtils.sleep(5);
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertEquals(string,webTableOrderPage.firstRowInWebTable.getText());

    }

}
