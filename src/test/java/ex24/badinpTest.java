package ex24;

import ex26.PaymentCalculator;
import ex28.addingNumbers;
import ex29.badinput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static ex28.addingNumbers.add;
import static ex29.badinput.checkNum;
import static ex29.badinput.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class badinpTest {
    @Test
    @DisplayName("bad input")
        //test casefrom example
    void badinp_test1(){
        badinput test1 = new badinput();
//
        int test = run("0");
        int actual = test;
        int expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("good input")
        //test casefrom example
    void badinp_test2(){
        badinput test1 = new badinput();
//
        int test = run("4");
        int actual = test;
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("checks for number")
        //test casefrom example
    void badinp_test2checknum1(){
        badinput test1 = new badinput();
//
        int test = checkNum("4");
        int actual = test;
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("false if string is not a number")
        //test casefrom example
    void badinp_test2checknum2(){
        badinput test1 = new badinput();
//
        int test = checkNum("aabc");
        int actual = test;
        int expected = 4;

        assertEquals(expected,actual);
    }
}
