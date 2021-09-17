package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * function only tells if anagrams are anagrams in the same case, to solve use
 * the checker function on fully uppercase inputs and fully lower case inputs
 *
 */
public class Anagram {
    static Scanner in = new Scanner(System.in);
    static int check = 0;

    public static void main(String[] args) {
        Anagram ask = new Anagram();
        Anagram.ask();
    }

    private static void ask() {
        out.print("Enter two strings and I'll tell you if they are anagrams: \n");
        out.print("Enter the first string: ");
        String str1 = in.next();
        out.print("Enter the second string: ");
        String str2 = in.next();

        if ((str1.length() == str2.length())) {
            char[] str11 = str1.toCharArray();
            int i=0;
            int l = str1.length();
                while(i<l){
                    check +=Anagram.checker(str11[i], l, str2.toCharArray(), 0);
                    i++;
                }
            if(check == l) {
                out.print(String.format("%d check\n", check));
                out.print(String.format("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.", str1, str2));
            }else out.print("The strings entered are not anagrams");
        }else out.print("The strings entered are not pananagrams");
    }


    private static int checker(char given, int length,char[] str2,int b){
        while(true){
            int ret=0;
            if(b<length && given == str2[b])
                return ret = 1;
            else if(b==length)return ret;
            else {
                return ret+= checker(given,length,str2,b+1);
            }
        }
    }
}

