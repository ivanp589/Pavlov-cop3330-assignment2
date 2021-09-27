package ex24;

import ex25.Pass;
import ex26.PaymentCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class PaymentcalcTest {


    @Test
    @DisplayName("months to pay")
    //test casefrom example
    void pass_test1(){
        PaymentCalculator test1 = new PaymentCalculator();

        double test = test1.calculateMonthsUntilPaidOff(5000,12.0,100);
        double actual = Math.ceil(test);
        double expected = 70;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("months to pay false")
        //test needs to fail
    void pass_test2(){
        PaymentCalculator test1 = new PaymentCalculator();

        double test = test1.calculateMonthsUntilPaidOff(5000,12.0,100);
        double actual = Math.ceil(test);
        double expected = 1;

        assertEquals(expected,actual);
    }

}
