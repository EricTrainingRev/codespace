package com.revature;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatorTests {

    private static Calculator calculator;

    @BeforeClass
    public static void setup(){
        calculator = new Calculator();
    }
    
    @Test
    public void addPositive(){
        Assert.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtractPositive(){
        Assert.assertEquals(3, calculator.subtract(6, 3));
    }

}
