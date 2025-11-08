package com.indrajit.automatiommanager.waitHandler;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SetImplicitWait {


    public void setImplicitWait(WebDriver driver, int time){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }


}
