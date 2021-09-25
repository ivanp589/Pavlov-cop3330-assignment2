package ex32;

import java.util.Random;
import java.util.Scanner;

import static ex29.badinput.checkNum;
import static java.lang.System.out;

public class guess {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String res = "y";
        while(res.equals("y")|res.equals("Y")) {
            int diff = difficulty();
            int num = number(diff);
            prin();
            int user = guess(num);
            int count = hint(user, num, 1);
            out.println("You got it in " + count + " guesses!\n");
            out.print("Do you wish to play again (Y/N)? ");
            res = in.next();
        }
    }

    public static int hint(int user,int num,int counter){
        if(user<num){
            out.print("Too low. Guess again: ");
            return hint(guess(num),num,counter+1);
        }
        else if(user>num){
            out.print("Too high. Guess again: ");
            return hint(guess(num),num,counter+1);
        }
        return counter;
    }

    public static int guess(int num){
        String str = in.next();
        if (checkNum(str)==0){
            return Integer.parseInt(str);
        }else{out.println("Input was not valid. What's your guess? ");
            return guess(num);}
    }

    public static int number(int difficulty) {
        Random a = new Random();
        int b=0;
        switch (difficulty) {
            case 1:
                b= a.nextInt(10);
                break;
            case 2:
                b=a.nextInt(100);
                break;
            case 3:
                b=a.nextInt(1000);
                break;
        }
        return b;
    }
    public static int difficulty(){
        out.print("Enter the difficulty level (1, 2, or 3): ");
        String string= in.next();
        if (checkNum(string)==0){
            return Integer.parseInt(string);
        }else{out.println("Input was not valid. ");
            return difficulty();}
    }
    public static void prin(){
        out.print("I have my number. What's your guess? ");
    }
}
