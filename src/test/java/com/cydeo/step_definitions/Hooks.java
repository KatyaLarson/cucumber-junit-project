package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before");
    }

    /*@Before (value="@login", order=2)
    public void setupForLogin(){
        //if you want any code to run before any specific feature
        //you can use value="@tagname to determan this
    }

    @Before(value ="@db",order=3)
    public void setupDatabaseScenario(){

    }*/



    @After
    public void teardownScenario(Scenario scenario){
        // we will implement taking screenshots in this method
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closedDriver();

    }
}
