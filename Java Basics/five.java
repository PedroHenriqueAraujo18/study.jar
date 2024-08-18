import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader scanf_s = new BufferedReader(new InputStreamReader(System.in));
        int number;

        System.out.println("Enter a Integer Number:");
        number = Integer.parseInt(scanf_s.readLine());
        if(number >= 1 && number <= 4){
            System.out.println("Number  = "  + number);
        }else{
            System.out.println("Out of range");
        }

    }
}