package com.cydeo.pages;

import com.cydeo.utils.Driver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;

    @AndroidFindBy(accessibility = "minus")
    public MobileElement minus;

    @AndroidFindBy(accessibility = "plus")
    public MobileElement plus;

    @AndroidFindBy(accessibility = "divide")
    public MobileElement divide;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equals;

    @AndroidFindBy(accessibility = "clear")
    public MobileElement clear;

    @AndroidFindBy(accessibility = "percent")
    public MobileElement percent;

    @AndroidFindBy(accessibility = "delete")
    public MobileElement delete;

    @AndroidFindBy(accessibility = "point")
    public MobileElement point;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement result;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    public MobileElement zero;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    public MobileElement one;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public MobileElement two;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public MobileElement three;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    public MobileElement four;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public MobileElement five;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    public MobileElement six;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    public MobileElement seven;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    public MobileElement eight;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    public MobileElement nine;

    public void clickSingleDigit(int digit){
        String id = "com.google.android.calculator:id/digit_"+ digit;
        MobileElement number = Driver.getDriver().findElement(By.id(id));
        number.click();
    }
}
