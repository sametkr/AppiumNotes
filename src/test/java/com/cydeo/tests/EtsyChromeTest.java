package com.cydeo.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest extends WebTestBase {

    @Test
    public void etsySearch(){
        driver.get("https://www.etsy.com");

        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("wooden spoon", Keys.ENTER);
    }

    // 1 22 22

}
