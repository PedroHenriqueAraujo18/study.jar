import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader S =new BufferedReader(new InputStreamReader(System.in));
        int number;


        System.out.println("Enter a number:");
        number = Integer.parseInt(S.readLine());

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;

        if(number < 10000 || number > 99999){
            System.out.println(" numero digitado Menor que 10000 e maior que 99999");
        }else{

            System.out.println("Primeiro dígito: " + firstDigit);
            System.out.println("Segundo dígito: " + secondDigit);
            System.out.println("Terceiro dígito: " + thirdDigit);
            System.out.println("Quarto dígito: " + fourthDigit);
            System.out.println("Quinto dígito: " + fifthDigit);
        }


    }
}