package ex34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class removal {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    String[] a= list();
    int empl = a.length-1;
    printList(a,empl);
    out.print("\n");
    String inp = ask();
    out.print("\n");
    int position = finder(a,inp,empl,0);
    a= removal(a,position,empl);
    printList(a,a.length-1);
    }

    public static String[] removal(String[] a,int position,int empl){
        String[] b=new String[empl];
            System.arraycopy(a,0,b,0,position);
            System.arraycopy(a,position+1,b,position,empl-position);
        return b;
    }


    public static void printList(String[] a,int length){
        int i=0;
        int n =length+1;
        out.println(String.format("There are " +n+" employees:",n));

        while(i<=length){
            out.println(a[i]);
            i++;
        }
    }

    public static String ask(){
        out.print("Enter an employee name to remove: ");
        return String.format(in.next()+" "+in.next());
    }

    public static String[] list(){
        String[] array = {"John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};
//        ArrayList a =arraycopy();

        return array;
    }

    public static int finder(String[] a,String inp,int length,int pos){
        if(pos <= length){
            if(a[pos].equals(inp)){
                return pos;}
            else return finder(a,inp,length,pos+1);
            }
        else return -1;     //error value if doesnt find the name
    }
}
