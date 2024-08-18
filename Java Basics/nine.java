import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader S =new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.println("Enter a Integer:");
        num = Integer.parseInt(S.readLine());

        if(num % 2 ==0){
            System.out.println( num + " is even");
        }else {
            System.out.println(num + " is odd ");
        }

    }
}