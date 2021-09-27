package ex24;

import ex31.heart;
import ex32.guess;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

public class guesstest {
    @Test
    @DisplayName("not testable")
        //test casefrom example
    void guess_test1(){
        guess test1 = new guess();
        //prograam only contains print,inputs and random number generators
        //dont know how to test random number generators
        double actual = 0;
        double expected = 0;

        assertEquals(expected,actual);
    }

}
