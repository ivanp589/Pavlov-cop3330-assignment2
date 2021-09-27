package ex24;

import ex26.PaymentCalculator;
import ex27.inputValidating;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
public class inputvalidTest {


    @Test
    @DisplayName("checks if atleast 2 lett in string")
        //test casefrom example
    void inputval_test1(){
        inputValidating test1 = new inputValidating();

        int test = inputValidating.validateInput("pavlov",1);
        int actual = test;
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("checks for 5 numbers in string")
        //test casefrom example
    void inputval_test2(){
        inputValidating test1 = new inputValidating();

        int test = inputValidating.validateInput("12345",2);
        int actual = test;
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("checks for id string")
        //test casefrom example
    void inputval_test3(){
        inputValidating test1 = new inputValidating();

        int test = inputValidating.validateInput("we-2345",3);
        int actual = test;
        int expected = 0;

        assertEquals(expected,actual);
    }
}
