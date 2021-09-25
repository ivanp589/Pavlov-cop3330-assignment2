package ex31;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

import static ex29.badinput.checkNum;
import static java.lang.System.out;

public class heart {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       int pulse =run1();
       int age =  run2();
       table(pulse,age);

    }

    public static void restpulse(){
        out.print("What is your resting pulse ");
    }
    public static void age(){
        out.print("What is your age ");
    }

    public static int run1(){
        restpulse();
        String string= in.next();
        if (checkNum(string)==0){
            return Integer.parseInt(string);
        }else{out.println("Input was not valid. ");
            return run1();}
    }

    public static int run2() {
        age();
        String input = in.next();
        if (checkNum(input) == 0) {
            return Integer.parseInt(input);
        }
        else{
        out.println("Input was not valid. ");
        return run2();
        }
        //return Integer.parseInt(input);

    }
    public static double calc(int pulse, int age, int intensity){
       return (((220-age)-pulse)*((double)intensity/100))+pulse;
    }

    public static void table(int pulse,int age) {

        out.println("Resting Pulse: "+pulse+"\t Age: "+age+"\n");
        out.println("Intensity\t |  Rate");
        out.println("-------------|---------");
        for (int intensity = 55; intensity < 100; intensity += 5) {
            double bpm = calc(pulse, age, intensity);
            out.println(intensity+"%\t\t\t |  "+Math.round(bpm)+" bpm");
        }
    }


}
