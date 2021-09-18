package ex24;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * function only tells if anagrams are anagrams in the same case, to solve use
 * the checker function on fully uppercase inputs and fully lower case inputs
 /**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class Anagram {
    static Scanner in = new Scanner(System.in);
    static int check = 0;
    //Anagram Pass = new Anagram();
    public static void main(String[] args) {
        Anagram ask = new Anagram();
        inputask();
        askstr1();
        String str1= str1();
        askstr2();
        String str2= str2();
        int length = Anagram.comp(str1,str2);
        prin(check,length,str1,str2);
    }

    private static void inputask(){
         out.print("Enter two strings and I'll tell you if they are anagrams: \n");
    }

    public  static void askstr1(){
        out.print("Enter the first string: ");
    }
    public static String str1(){
        return in.next();
    }

    private static void askstr2(){
        out.print("Enter the second string: ");
    }
    public static String str2(){
        return in.next();
    }

    public static int comp(String str1,String str2) {

        int l = 0;
        if ((str1.length() == str2.length())) {
            char[] str11 = str1.toCharArray();
            int i = 0;
            l = str1.length();
            while (i < l) {
                check += Anagram.checker(str11[i], l, str2.toCharArray(), 0);
                i++;
            }
        } else out.print("The strings entered are not pananagrams");
        return l;
    }
    public static boolean checkt(int check,int l){
        if(check == l) {return true;
        }else return false;
    }

    private static void prin(int check, int l, String str1, String str2){
        if(checkt(check,l)){
            //out.print(String.format("%d check\n", check));
            out.print(String.format("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.", str1, str2));
        }
        else out.print("The strings entered are not anagrams");
    }


    public static int checker(char given, int length,char[] str2,int b){
        //while(true){
            int ret=0;
            if(b<length && given == str2[b])
                return ret = 1;
            else if(b==length)return ret;
            else {
                if(ret == 0) {
                    ret = checker(given, length, str2, b + 1);
                } return ret; }
        }
    }


