package ex24;

import java.util.Scanner;

import static java.lang.System.out;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/*
 * function only tells if anagrams are anagrams in the same case, to solve use
 * the checker function on fully uppercase inputs and fully lower case inputs
 /**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class anagramTest {
    @Test
    @DisplayName("equality test")
    void isanagram_test1(){
        Anagram test1 = new Anagram();
        String testword1 = "best";
        String testword2 = "best";
        int test = test1.comp(testword1,testword2);
        int actual = test;
        int expected = Anagram.check;

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("inequality test,test needs to fail")
    void isanagram_test2(){
        Anagram.check=0;
        Anagram test1 = new Anagram();
        String testword1 = "mart";
        String testword2 = "best";
        int test = test1.comp(testword1,testword2);
        int actual = test;
        int expected = Anagram.check;

        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("boolean checker")
    void isanagram_test3(){
        Anagram.check=0;
        Anagram test1 = new Anagram();
        String testword1 = "beoe";
        String testword2 = "best";
        boolean test = test1.checkt(1,1);
        boolean actual = test;
        boolean expected = true;

        assertEquals(expected,actual);

    }


}