import jdk.nashorn.internal.runtime.ECMAException;

import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception
    {
        System.out.print("This is a Java program\n");
        //reading data
        BufferedReader scanf_S = new BufferedReader(new InputStreamReader(System.in));


        //variables
        int c,ThisIsAVariable,q76354,number;
        int value;

        //read an attribute
        System.out.println("Enter a number:");
        value = Integer.parseInt(scanf_S.readLine());



        System.out.println("Enter a another number:");
        number = Integer.parseInt(scanf_S.readLine());


        if (number != 7) {
           System.out.println("the variable number is not equal 7");
        }


    }

}