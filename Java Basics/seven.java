import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        int number_One;
        int number_Two;


        System.out.println("Enter the first Integer:");
        number_One =Integer.parseInt(s.readLine());

        System.out.println("Enter the second Integer:");
        number_Two = Integer.parseInt(s.readLine());


        System.out.println("The sum of these number's:" + (number_One + number_Two));
        System.out.println("The products of these number's:" +(number_One*number_Two));
        System.out.println("The division of these number's:"+(number_One/number_Two));
    }
}