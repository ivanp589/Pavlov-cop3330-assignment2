package ex27;

import java.util.Scanner;

import static ex26.PaymentCalculator.input;
import static java.lang.System.out;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ivan pavlov
 */

public class inputValidating {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        inputValidating asker = new inputValidating();
        inputValidating.asker();


        //out.print( "There were no errors found.");
    }

    private static void asker() {
        int counter = 0;
        out.print("Enter the first name: ");
        String fname = input();
        int fnameErr= validateInput(fname,1);
        //out.print(fnameErr);
        out.print("Enter the last name: ");
        String lname = input();
        int lnameErr = validateInput(lname,1);
        //out.print(lnameErr);
        out.print("Enter the ZIP code: ");
        String zipcode = input();
        int zipErr = validateInput(zipcode,2);
        //out.print(zipErr);
        out.print("Enter the employee ID: ");
        String id = input();
        int idErr = validateInput(id,3);
       // out.print(idErr);
        //calls other function to validate the values
        counter += inputValidating.outputs(fnameErr,1);
        counter += inputValidating.outputs(lnameErr,2);
        counter += inputValidating.outputs(zipErr,3);
        counter += inputValidating.outputs(idErr,4);

        //out.print(counter);

        if(counter == 0)out.print("There were no errors found.");



    }

    private static int validateInput(String tocheck, int checkfor){
        switch(checkfor){

            case 1:
                if(tocheck.length()<2){
                    if(tocheck.length()==0) return -1;  //no input at all
                return 0;      //not enough input
                        }return 1;       //1 = proper value
            case 2:
                int n = tocheck.length();
                int error = 0;
                if(n == 5){
                for(int i=0;i<n;i++){
                    if(tocheck.charAt(i)>='0'&& tocheck.charAt(i)<='9') {
                    }
                    else error++;       //increments error variable everytime it find a letter
                }return error;          //input is only valid if it returns zero
                }else return -1;    //-1 = zip is not the right amount of numbers

            case 3:
                int errorval=0;
                if(tocheck.length()==7) {
                    String str1 = String.valueOf(tocheck.charAt(0)) + String.valueOf(tocheck.charAt(1) + "123");
                    //add value "123" because case 2 needs a length of 5 and to not alter output need additional
                    //to be integers bc integers do not add to the error value in 2
                    if (validateInput(str1, 2) != 2)
                        errorval = 1;   //returns   1 if at least one value is a number or otherwise incorrect
                    else errorval = 0;  //if both values are not numbers

                    if (tocheck.charAt(2) != '-') errorval += 1;

                    String str2 = String.valueOf(tocheck.charAt(3)) + String.valueOf(tocheck.charAt(4) +
                            String.valueOf(tocheck.charAt(5)) + String.valueOf(tocheck.charAt(6)) + "1");
                    //out.println(str2);
                    if (validateInput(str2, 2) != 0) errorval += 1;
                    else errorval += 0;
                    return errorval;
                }return -1;
        }
    return -9; //something might be wrong
    }

    public static int outputs(int error, int type){
        int n =0;
        switch (type){
            case 1:if(type==1){
                if(error == 0){out.println("The first name must be at least 2 characters long.");n++;}
                if(error == -1){out.println("The first name must be filled in.");n++;}
                }

            case 2:if(type==2){
                if(error == 0){out.println("The last name must be at least 2 characters long.");n++;}
                if(error == -1){out.println("The last name must be filled in.");n++;}
                }
            case 3:if(type==3){
                if(error ==1 || error == -1){out.println("The zipcode must be a 5 digit number.");n++;}
                }

            case 4:if(type==4){
                if(error != 0){out.println("The employee ID must be in the format of AA-1234");n++;}                if(error == 0)n+=0;
                }
        }

        return n;
    }
}
