import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        //reader of keyboard data
        BufferedReader scanf_s = new BufferedReader( new InputStreamReader(System.in));

        //variables
        int numberOne;
        int numberTwo;


        //reading the Integers
        System.out.print("Enter the first Integer : ");
        numberOne = Integer.parseInt(scanf_s.readLine());

        System.out.print("Enter the second Integer:");
        numberTwo = Integer.parseInt(scanf_s.readLine());

        //comparable the integers
        if(numberOne == numberTwo){
            System.out.println(numberOne + " == "  + numberTwo);
        }
        if(numberOne != numberTwo){
            System.out.println(numberOne + " != " + numberTwo);
        }
        if(numberOne < numberTwo){
            System.out.println(numberOne + " < "  + numberTwo);
        }
        if(numberOne > numberTwo){
            System.out.println(numberOne + " > " + numberTwo);
        }
        if(numberOne >= numberTwo){
            System.out.println(numberOne + " >= "  + numberTwo);
        }
        if(numberOne <= numberTwo){
            System.out.println(numberOne + " <= " + numberTwo);
        }
    }
}