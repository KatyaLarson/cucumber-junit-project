package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTitleVerification_StepDefinitions {

    EtsyPage etsyPage;
    @Given("user is on etsy home page")
    public void userIsOnEtsyHomePage() {
        Driver.getDriver().get("https://www.etsy.com ");
        etsyPage=new EtsyPage();

    }
    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Then("user types Wooden spoon in search bar")
    public void userTypesWoodenSpoonInSearchBar() {
        etsyPage.searchBar.sendKeys("Wooden spoon");
        etsyPage.searchBtn.click();
    }

    @And("user sees Wooden spoon in the title")
    public void userSeesWoodenSpoonInTheTitle() {
        String expectedTitle="Wooden spoon";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    @Then("user types {string} in search bar")
    public void userTypesInSearchBar(String str) {
        etsyPage.searchBar.sendKeys(str);
        etsyPage.searchBtn.click();
    }

    @And("user sees {string} in the title")
    public void userSeesInTheTitle(String str) {

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(str));
    }
}
