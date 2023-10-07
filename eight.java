import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        int one;
        int two;
        int three;

        System.out.println("Enter the first:");
        one = Integer.parseInt(s.readLine());

        System.out.println("Enter the second:");
        two = Integer.parseInt(s.readLine());

        System.out.println("Enter the three:");
        three = Integer.parseInt(s.readLine());



        System.out.println(one+two+three);
        System.out.println(one*two*three);
        System.out.println(one+two+three/3);

        if(one > two) {
            if (one > three) {
                System.out.println(one + " > " + two + " and " + three);
            }
        }
             if (two >one) {
                 if (two > three) {
                     System.out.println(two + " > " + one + " and " + three);
                 }
             }
            if (three>one) {
                if (three > two) {
                System.out.println(three + " > " + one + " and " + two);
            }
        }//end if
    }//end main
}//end class