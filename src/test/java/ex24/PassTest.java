package ex24;

import ex25.Pass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class PassTest {
    @Test
    @DisplayName("strongpass")
    void pass_test1(){
        Pass test1 = new Pass();
        String testword1 = "best";
        String testword2 = "best";
        int test = test1.passwordvalidator("df34df^&df");
        int actual = test;
        int expected = 2;

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("medium")
    void pass_test2(){
        Pass test1 = new Pass();
        String testword1 = "best";
        String testword2 = "best";
        int test = test1.passwordvalidator("dddddddd8");
        int actual = test;
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("doesnt have digits checker")
    void pass_test3isdig(){
        Pass test1 = new Pass();
        boolean test = test1.digit("rth");
        boolean actual = test;
        boolean expected = false;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("has digits checker")
    void pass_test3isdigf(){
        Pass test1 = new Pass();
        boolean test = test1.digit("123ads");
        boolean actual = test;
        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("passvalidator test")
    //checks for digits or special characters
    void pass_test4passvalid(){
        Pass test1 = new Pass();
        int test = test1.passwordvalidator("324352#$#");
        int actual = test;
        int expected = 2;//expect it to be at least 2 for a strong pass

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("passvalidator test")
        //checks for digits or special characters
    void pass_test5passvalid(){
        Pass test1 = new Pass();
        int test = test1.passwordvalidator("asdfghjk");
        int actual = test;
        int expected = 0;//expect it to be at least 0 for weak

        assertEquals(expected,actual);
    }


}
