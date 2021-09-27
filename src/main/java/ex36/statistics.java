package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static ex29.badinput.checkNum;
import static java.lang.System.out;


public class statistics {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> b = new ArrayList<>();
        b= arraymaker(b);
        double avg = average(b);
        int min = min(b);
        int max = max(b);
        double std = std(b,avg);

        finalprint(avg,min,max,std);
    }

    public static void finalprint(double avg,int min,int max,double std){
        out.println(String.format("The average is %.1f",avg));
        out.println(String.format("The average is %d",min));
        out.println(String.format("The average is %d",max));
        out.println(String.format("The average is %.2f",std));
    }

    public static double std(List<Integer> b,double avg){
        double min = b.get(0);
        double top =0;
        double std=0;
        int size = b.size();
        for(int i=0;i<size;i++){
            top += Math.pow((b.get(i)-avg),2);
        }
        std = Math.sqrt(top/size);

        return std;
    }

    public static int max(List<Integer> b){
        int max = b.get(0);
        int size = b.size();
        for(int i=0;i<size;i++){
            if(max<b.get(i)){
                max = b.get(i);
            }
        }
        return max;
    }

    public static int min(List<Integer> b){
        int min = b.get(0);
        int size = b.size();
        for(int i=0;i<size;i++){
            if(min>b.get(i)){
                min = b.get(i);
            }
        }
        return min;
    }

    public static double average(List<Integer> b){
        double avg= 0;
        int size = b.size();
        for(int i=0;i<size;i++){
            avg += (double)b.get(i);
        }
        avg/=size;
        return avg;
    }


    public static void prin(){
        out.print("Enter a number: ");
    }

    public static List arraymaker(List<Integer> b){
        prin();
        String str =input();
        if (str.equals("done")|str.equals("Done")){}
        else{
            if (checkNum(str) == 0& !str.equals("")) {
            b.add(Integer.parseInt(str));
                return arraymaker(b);}
            return arraymaker(b);}
        return b;
    }

    public static String input() {
        return in.nextLine();
    }
}
