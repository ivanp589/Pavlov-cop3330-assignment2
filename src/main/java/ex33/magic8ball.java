package ex33;

import java.util.Random;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 *  store 0-3 in a list create a new method
 */

import static java.lang.System.out;

public class magic8ball {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        asker();
        user();
        int b = numbergen();
        if(b==1)out.println("Yes");
        if(b==2)out.println("No");
        if(b==3)out.println("Maybe");
        else if(b==0) out.println("Ask again later");
    }

    public static int numbergen(){
        Random a = new Random();
         return a.nextInt(3);
    }

    public static void user(){
        in.next();
    }

    public static void asker(){
        out.print("What's your question?\n> ");
    }
}
