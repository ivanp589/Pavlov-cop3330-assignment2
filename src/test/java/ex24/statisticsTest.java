package ex24;

import ex35.winner;
import ex36.statistics;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import java.awt.*;
import java.util.Collections;

//import static org.junit.Assert.assertEquals;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class statisticsTest {
    @Test
    @DisplayName("average test")
        //test casefrom example
    void stats_test1(){
        statistics test1 = new statistics();


        double test = statistics.average(singletonList(1));
        double actual = test;
        double expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("min test")
        //test casefrom example
    void stats_test2(){
        statistics test1 = new statistics();


        double test = statistics.min(singletonList(3));
        double actual = test;
        double expected = 3;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("max test")
        //test casefrom example
    void stats_test3(){
        statistics test1 = new statistics();


        double test = statistics.max(singletonList(10));
        double actual = test;
        double expected = 10;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("std test")
        //test casefrom example
    void stats_test4(){
        statistics test1 = new statistics();


        double test = statistics.std(singletonList(10),10);
        double actual = test;
        double expected = 0;

        assertEquals(expected,actual);
    }

}
