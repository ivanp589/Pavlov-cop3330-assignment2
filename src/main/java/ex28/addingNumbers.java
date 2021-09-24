package ex28;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

import static ex26.PaymentCalculator.input;
import static java.lang.System.out;

public class addingNumbers {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int b=0;
        for(int i =0; i<5; i++){
            ask();
            int a = Integer.parseInt(input());
            b= add(a,b);
        }
        out.print(b);
    }

    public static void ask(){
        out.print("Enter a number: ");
    }
    public static int add(int a,int b){
        return a+b;
    }
}
