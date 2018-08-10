package com.example.sudeep_takkar.simple_calculator;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void addition() {
        MainActivity ma = new MainActivity();
        ma.val1 = 2 ;
        ma.val2 = 3;
        ma.ACTION = ma.ADDITION;
        ma.Addition(false);
        Assert.assertEquals(ma.val1, 2 + 3, 0.001);
    }

    @Test
    public void subtraction() {
        MainActivity ma = new MainActivity();
        ma.val1 = 5;
        ma.val2 = 3;
        ma.ACTION = ma.SUBTRACTION;
        ma.Subtraction(false);
        Assert.assertEquals(ma.val1, 5 - 3, 0.001);
    }

    @Test
    public void multiplication() {
        MainActivity ma = new MainActivity();
        ma.val1 = 9;
        ma.val2 = 3;
        ma.ACTION = ma.MULTIPLICATION;
        ma.Multiplication(false);
        Assert.assertEquals(ma.val1, 9 * 3, 0.001);
    }

    @Test
    public void division() {
        MainActivity ma = new MainActivity();
        ma.val1 = 27;
        ma.val2 = 3;
        ma.ACTION = ma.DIVISION;
        ma.Division(false);
        Assert.assertEquals(ma.val1, 27 /3, 0.001);
    }

    @Test
    public void division2(){
        MainActivity ma = new MainActivity();
        ma.val1 = 20;
        ma.val2 = 10;
        ma.ACTION = ma.DIVISION;
        ma.Division(false);
        Assert.assertEquals(ma.val1, 20 /10, 0.001);
    }
}