package ex24;

import ex27.inputValidating;
import ex31.heart;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

public class hearttest {
    @Test
    @DisplayName("65pulse 22 age,95 inten")
        //test casefrom example
    void calc_test1(){
        heart test1 = new heart();

        double test = heart.calc(65,22,95);
        double actual = Math.round(test);
        double expected = 191;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("65pulse 22 age")
        //test casefrom example
    void calc_test2(){
        heart test1 = new heart();

        double test = heart.calc(65,22,90);
        double actual = Math.round(test);
        double expected = 185;

        assertEquals(expected,actual);
    }
}
