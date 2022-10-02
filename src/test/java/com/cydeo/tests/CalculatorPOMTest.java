package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utils.Driver;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void multiplyTest(){

        calculatorPage.clickSingleDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickSingleDigit(8);
        calculatorPage.equals.click();

        System.out.println(calculatorPage.result.getText());

        Driver.closeDriver();
    }
}
