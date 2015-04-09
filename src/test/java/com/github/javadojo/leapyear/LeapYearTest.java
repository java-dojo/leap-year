package com.github.javadojo.leapyear;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeapYearTest {

    private final LeapYear objectToTest = new LeapYear();

    @Test(enabled = false)
    public void test2016() {
        Assert.assertTrue(objectToTest.isLeap(2016),
            "Expected the year 2016 to be a leap year.");
    }

    @Test(enabled = false)
    public void test2015() {
        Assert.assertFalse(objectToTest.isLeap(2015),
            "Expected the year 2015 not to be a leap year.");
    }

    @Test(enabled = false)
    public void test2017() {
        Assert.assertFalse(objectToTest.isLeap(2017),
            "Expected the year 2017 not to be a leap year.");
    }

    @Test(enabled = false)
    public void test2000() {
        Assert.assertTrue(objectToTest.isLeap(2000),
            "Expected the year 2000 to be a leap year.");
    }

    @Test(enabled = false)
    public void test2100() {
        Assert.assertFalse(objectToTest.isLeap(2100),
            "Expected the year 2100 not to be a leap year.");
    }

}
