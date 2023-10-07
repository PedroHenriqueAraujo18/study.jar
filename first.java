import java.io.*;
public class Main {
        public static void main(String[] args)throws Exception{
                BufferedReader scanf_s = new BufferedReader( new InputStreamReader(System.in));

                //vars
                int numberOne;
                int numberTwo;
                int sum;
                
                //read a integer
                System.out.println("Enter a integer:");
                numberOne = Integer.parseInt(scanf_s.readLine());

                //read a integer
                System.out.println("Enter a second Integer");
                numberTwo = Integer.parseInt(scanf_s.readLine());

                //sum the integer's
                sum = numberOne + numberTwo;

                //print result
                System.out.printf("Sum is %d%n", sum);
        }
}