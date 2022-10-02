package com.cydeo.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Driver {

    private static AppiumDriver<MobileElement> driver;
    private static URL url;

    private Driver(){
    }

    public static AppiumDriver<MobileElement> getDriver(){
        String platform = ConfigurationReader.getProperty("platform");

        if (Objects.isNull(driver)){
            switch (platform) {
                case "android":
                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
                    caps.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

                    try {
                        url = new URL("http://localhost:4723/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    driver = new AndroidDriver<MobileElement>(url, caps);
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.closeApp();
        }
    }
}
