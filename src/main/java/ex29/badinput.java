package ex29;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

import static ex26.PaymentCalculator.input;
import static java.lang.System.out;

public class badinput {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ask();
        while(run() == 1) {
        out.println("Sorry. That's not a valid input.");
        ask();

        }
    }
    public static void ask(){
        out.print("What is the rate of return? ");
    }

    public static int run(){
        int error=0;
        String a =(input());
        if(checkNum(a)==0){
            int b=Integer.parseInt(a);
            out.println(b);
            if(b!= 0){
                int calc = calc(b);
                out.println("It will take "+calc +" years to double your initial investment.");
            }else error =1;
        }else error = 1;
        return error;
    }

    public static int calc(int a){
        return 72/a;
    }

    public static int checkNum(String a){

            int n = a.length();
            int error = 0;
                for(int i=0;i<n;i++){
                    if(a.charAt(i)>='0'&& a.charAt(i)<='9') {}
                    else error++;       //increments error variable everytime it find a letter
                }return error;          //input is only valid if it returns zero
            //else return -1;    //-1 = zip is not the right amount of numbers

    }
}
