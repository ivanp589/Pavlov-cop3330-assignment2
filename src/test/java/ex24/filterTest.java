package ex24;

import ex38.filter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
public class filterTest {
    @Test
    @DisplayName("filter even")
        //test casefrom example
    void filter_test1(){
        filter test1 = new filter();

        String test = filter.filterEvenNumbers(new String[]{"1", "2", "4", "68", "7"});
        String actual = test;
        String expected = "2 4 68"; //actual and expected match.

        assertEquals(expected,actual);
    }
}
