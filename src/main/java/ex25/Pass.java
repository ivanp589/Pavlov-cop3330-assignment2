package ex25;


//import java.util.Scanner;

import ex24.Anagram;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
public class Pass {
    //static Scanner in = new Scanner(System.in);
    //String pass = null;

    public static void main( String[] args ) {
        asker();
        String str1 = Anagram.str1();
        int length = str1.length();
        int valide = passwordvalidator(str1);
        {if(str1.length()<8&&digit(str1))
            out.print("Very weak password");
        else if(str1.length()<8)out.print("Weak password ");
        else if(valide ==1&&length>8)out.print("Strong password");
        else if(valide ==2&&length>8)out.print("Very strong");
        }
    }
    public static boolean digit(String str1){
        for(int i= 0;i<str1.length();i++){
            if(str1.charAt(i)>='0'&& str1.charAt(i)<='9')return true;
            else return false;
        }return false;
    }

    public static int passwordvalidator(String str1){
        int S=0;
        int N = 0;
        N = comparToSpecial(str1,"1234567890");
        S= comparToSpecial(str1,"!@#$%^&*");
        return N+S;
    }

    private static int comparToSpecial(String str1,String str2) {   //returns a zero if no special characters are found//
        char[] charar = str1.toCharArray();
        char[] special = str2.toCharArray();
        int Acheck = 0;
        int i=0;
        while(Acheck==0 && i < str1.length()) {
            Acheck = Anagram.checker(charar[i], str2.length(), special, 0);
            i++;
        }
        return Acheck;
    }

    public static void asker() {
        out.print("Please enter your password");
    }
}




