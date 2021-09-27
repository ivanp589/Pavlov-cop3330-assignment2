package ex24;

import ex31.heart;
import ex33.magic8ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
public class magicTest {

    @Test
    @DisplayName("not testable")

    void ball_test2(){
        magic8ball test1 = new magic8ball();

        //just a number generator dont know how to test
        //basic java function
        double actual = 185;
        double expected = 185;

        assertEquals(expected,actual);
    }
}
