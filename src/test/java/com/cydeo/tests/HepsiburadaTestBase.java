package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class HepsiburadaTestBase {

    protected AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\sam\\IdeaProjects\\AppiumAutomation\\hepsiburada-5-5-2.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(url, caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterEach
    //public void tearDown(){
    //    driver.quit();
    //}
}
