package ex37;

import java.lang.reflect.Array;
import java.util.*;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static java.lang.System.out;

public class passGen {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int length =asklength();
        int special = askspecial();
        int nums = asknum();
        List pass = gen(length,special,nums);
        List pass1 = randomize(pass);

        finalprint(pass1);

    }

    private static void finalprint(List pass) {
        int size = pass.size();
        for(int i =0;i<size;i++){
            out.print(pass.get(i));
        }
    }

    public static List randomize(List pass){
        int l =pass.size();
        for(int i = 0; i<l; i++){
            char temp;
            //choose a random string value store it in temp remove it and add to end
            int r = rand(l);
            temp = (char) pass.get(r);
            pass.remove(r);
            pass.addAll(Collections.singleton(temp));
        }
        return pass;
    }

    public static char chooseSpec(){
        int b = rand(8);
        char[] r = new char[]{'!', '@', '#', '$', '%', '^', '&', '*'};
        return r[b];
    }

    public static char chooseLett(){
        char c = (char)(rand(26)+'a');
        return c;
    }

    public static int rand(int b){
        Random r = new Random();
        return r.nextInt(b);
    }

    public static char choice(int type){
        switch(type) {
            case 1:
                return chooseLett();

            case 2:
                return chooseSpec();

            case 3:
                return (char)(rand(10)+'0');
        }
        return '9';
    }

    public static List carray(int min,int type){
        List arr = new ArrayList();
        for(int i =0; i<min;i++){
            arr.add(choice(type));
        }
        return arr;
    }


//create an array of integers,specials, and letters
    //then choose from each array in random order

    public static List gen(int l,int s,int n){
        String password = new String();
        int a = s+n;

        List charr;List char1;List char2;
        charr = carray(a,1);
        char1 = carray(s,2);
        char2 = carray(n,3);
        List char0 = new ArrayList();

        char0.addAll(charr);
                char0.addAll(char1);
                    char0.addAll(char2);
        int totalleft = l- char0.size();
        if(char0.size()<l){
            char0.addAll(carray(totalleft,1));
        }
        return char0;
    }

    public static int asklength(){
        out.print("What's the minimum length? ");
        return input();
    }
    public static int askspecial(){
        out.print("How many special characters? ");
        return input();
    }
    public static int asknum(){
        out.print("How many numbers? ");
        return input();
    }
    public static int input(){
        return in.nextInt();
    }

}
