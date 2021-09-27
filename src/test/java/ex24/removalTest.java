package ex24;

import ex31.heart;
import ex34.removal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static ex34.removal.list;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class removalTest {
    @Test
    @DisplayName("find Chris Jones")
        //test casefrom example
    void finder_test1(){
        removal test1 = new removal();

        int test = removal.finder(list(),"Chris Jones",list().length-1,0);
        int actual = test;
        int expected = 2;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("cant find")
        //test casefrom example
    void finder_test2(){
        removal test1 = new removal();

        int test = removal.finder(list(),"abd",list().length-1,0);
        int actual = test;
        int expected = -1;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("removal test")
        //look the same to me probably wrong bc its stored in different places
    void removal_test2(){
        removal test1 = new removal();

        String[] test = removal.removal(list(),2,list().length-1);
        String[] actual = test;
        String[] expected = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};

        assertEquals(expected,actual);
    }
}
