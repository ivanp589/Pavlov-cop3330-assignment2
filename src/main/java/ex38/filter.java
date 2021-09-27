package ex38;

import java.util.Scanner;

import static java.lang.System.out;

public class filter {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        asklist();
        String str1 = userinp();

        String[] a = str1.split("\\s");
        String b = filterEvenNumbers(a);
        printstatement(b);
    }

    private static void printstatement(String b) {
        int i=0;
        int length = b.length();
        out.print("The even numbers are ");
        while(i<length){
            out.print(b.charAt(i));
            i++;
        }
    }

    private static String filterEvenNumbers(String[] a) {
        int length = a.length;
        String b = new String();
        for(int i=0;i<length;i++){
            int inp = Integer.parseInt(String.valueOf(a[i]));
            if(inp%2==0){
                b= b.concat(String.format("%d ",inp));
            }
        }
        return b;
    }


    private static String userinp() {
        return in.nextLine();
    }

    private static void asklist() {
        out.print("Enter a list of number, seperated by spaces: ");}
}
