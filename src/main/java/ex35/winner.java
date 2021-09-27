package ex35;

import java.util.*;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */
import static java.lang.System.out;

public class winner {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> b = new ArrayList<String>();
        b = arraymaker(b);
        Random r = new Random();
            int i = r.nextInt(b.size()-1);
//            out.println(b.size()-1);
            out.print("The winner is. . . "+b.get(i)+".");

        }

    public static List arraymaker(List<String> b){
        out.print("Enter a name: ");
        String a =in.nextLine();
        while(!a.equals("")){
            b.add(a);
            return arraymaker(b);
        }
        return b;
    }
}
