package ex26;

import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.round;
import static java.lang.System.in;
import static java.lang.System.out;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class PaymentCalculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String [] args){
        asker();
    }

    public static void asker(){
        out.print("What is your balance? ");
        int balance = Integer.parseInt(input());

        out.print("What is the APR on the card (as a percent)? ");
        double apr = Double.parseDouble(input());
        int i= transform(apr);
        out.print("What is the monthly payment you can make? ");
        int payment = Integer.parseInt(input());
        double months = calculateMonthsUntilPaidOff(balance,apr,payment);

        out.print("It will take you "+Math.ceil(months)+" months to pay off this card.");
    }
    public static String input(){
        return in.next();
    }

    public static double calculateMonthsUntilPaidOff(int b, double a, int p){
        double i = a/36500;
        double plus = (Math.pow(i+1,30));
           double  n= (log((1 + b/p * (1-plus))) / log(1 + i));
        double n1 = n*(-(double)1/(double)30);
        out.print(plus);
            return n1;
    }
    public static int transform(double apr){
        int i = (int)apr*100/365;
    return i;}
}
