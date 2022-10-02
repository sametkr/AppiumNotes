package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorOperationsTest {
    AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(url, caps);
    }

    // 4 + 5 = 9
    @Test
    public void addTest(){
        MobileElement four = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_4"));
        four.click();
        MobileElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        plus.click();
        MobileElement five  = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_5"));
        five.click();
        MobileElement equals  = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();


        MobileElement result  = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
        String actualResult = result.getText();
        System.out.println(actualResult);

        int expResult = 9;

        Assertions.assertEquals(expResult, Integer.parseInt(actualResult));
    }

    // 15 / 5 = 3
    @Test
    public void divideTest(){
        MobileElement one = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_1"));
        one.click();
        MobileElement five  = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_5"));
        five.click();
        MobileElement divide = driver.findElement(MobileBy.AccessibilityId("divide"));
        divide.click();

        five.click();

        MobileElement equals  = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

        MobileElement result  = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
        String actualResult = result.getText();
        System.out.println(actualResult);

        int expResult = 3;

        Assertions.assertEquals(expResult, Integer.parseInt(actualResult));
    }

    @AfterEach
    public void cleanUp(){
       driver.closeApp();
    }
}
