
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader scanf_s = new BufferedReader(new InputStreamReader(System.in));

        //VARIABLES
        int firstNumber;
        int secondNumber;

        System.out.println("Enter a first Integer:");
        firstNumber = Integer.parseInt(scanf_s.readLine());

        System.out.println("Enter a second Integer:");
        secondNumber = Integer.parseInt(scanf_s.readLine());

        if(firstNumber == secondNumber){
            System.out.println("They are equals");
        }

        if(firstNumber < secondNumber){
            System.out.println(firstNumber + " is smaller than " + secondNumber );
        } else if (secondNumber<firstNumber ) {
            System.out.println(secondNumber + " is smaller than " +firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + "Is larger than " +secondNumber);
        }else if(secondNumber > firstNumber){
            System.out.println(secondNumber + "Is larger than "+firstNumber);

        }

    }
}