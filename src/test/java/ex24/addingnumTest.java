package ex24;

import ex27.inputValidating;
import ex28.addingNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static ex28.addingNumbers.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class addingnumTest {



    @Test
    @DisplayName("adds to 1?")
        //test casefrom example
    void addnum_test1(){
        addingNumbers test1 = new addingNumbers();

        int test = add(0,1);
        int actual = test;
        int expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("doesnt add anything")
        //test casefrom example
    void addnum_test2(){
        addingNumbers test1 = new addingNumbers();

        int test = add(0,0);
        int actual = test;
        int expected = 0;

        assertEquals(expected,actual);
    }
}
