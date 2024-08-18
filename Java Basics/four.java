import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        //reading the data from keyboard
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        
        //vars
        int x,y,z,result;

        System.out.println("Enter the integer X:");
        x =Integer.parseInt(input.readLine());

        System.out.println("Enter the Integer Y:");
        y = Integer.parseInt(input.readLine());

        System.out.println("Enter the Integer Z:");
        z = Integer.parseInt(input.readLine());

        result = x*y*z;
        System.out.println("Products is : " + result);
    }
}