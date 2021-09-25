package ex30;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

import static java.lang.System.*;

public class multiplicationTable {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        multiplicationTable spaceCheck = new multiplicationTable();

        int [][] array =table();
    }

    public static int[][] table(){
        int i;
        int[][] array=new int[12][12];
        for(i=1; i<=12;i++){
            for( int j = 1; j<=12;j++){
                int i1 = i - 1;
                int j1 = j - 1;
                array[i1][j1] = i * j;
                out.print(String.format("%4s ",array[i1][j1]));
            }
            out.print("\n");
        }
        return array;
    }
}
