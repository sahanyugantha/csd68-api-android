package com.sahan.csd68appone;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    private int num1 = 25;
    private int num2 = 35;
    private int expected = 60;

    @Test
    public void testCalculator(){

        SampleForTest sampleForTest = new SampleForTest();
        int actual = sampleForTest.add(num1,num2);


        Assert.assertEquals(expected,actual);


    }


}
