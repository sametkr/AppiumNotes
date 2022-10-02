package com.cydeo.tests;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.List;

public class HepsiburadaTest extends HepsiburadaTestBase{



    @Test
    public void test1() {


        MobileElement searchBox = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        searchBox.click();
        searchBox = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        searchBox.click();
        searchBox = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        searchBox.sendKeys("sehpa");




    }
}
