package com.indrajit.automatiommanager.dropdownHandler;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownWithSelectClass {


    public void setDropdownValueForSelectClass(String dropdownValue, WebElement element){
        Select selectValue = new Select(element);
        List<WebElement> values = selectValue.getOptions();

        for(WebElement value : values){
            if(value.getText().equalsIgnoreCase(dropdownValue)) {
                value.click();
                return;
            }
        }
        throw new RuntimeException("Selected Dropdown Value not available in the list.");


    }
}
