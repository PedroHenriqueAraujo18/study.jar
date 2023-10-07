import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {

        BufferedReader S= new BufferedReader(new InputStreamReader(System.in));

        int b;
        int a;
        int result;
        System.out.println("Enter a Integer : ");
        a= Integer.parseInt(S.readLine());

        System.out.println("Enter a Integer : ");
        b= Integer.parseInt(S.readLine());

        result = a%b;
        if(a%b == 0){
            System.out.println(" The numbers entered are multiples and their result is " + result);
        }
    }
}