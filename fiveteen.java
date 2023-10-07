import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader s =new BufferedReader(new InputStreamReader(System.in));

        float imc;
        float weightKG;
        float height;

        System.out.println("Enter the weight:");
        weightKG = Float.parseFloat(s.readLine());

        System.out.println("Enter the height:");
        height = Float.parseFloat(s.readLine());

        imc = weightKG/(height*height);

        if(imc <=18){
            System.out.println("underweight, Less than 18");
        }
        if(imc > 18 && imc <=24){
            System.out.println("Normal,between 18 and 24");
        }
        if(imc > 24 && imc <=29){
            System.out.println("Overweight,between 24 and 29");
        }
        if(imc >= 30){
            System.out.println("Obese,30 or greater");
        }
    }
}