import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        int radius;
        int diameter;
        int Circumference;
        int Area;

        System.out.println("ENTER the radius:");
        radius =Integer.parseInt(a.readLine());

        Circumference = (int) (2 * 3.14159 *radius);
        diameter = 2*radius;
        Area = (int) 3.14159*(radius*radius);

        System.out.println("Circumference: " + Circumference);
        System.out.println("diameter: " +diameter);
        System.out.println("Area:" + Area);



    }
}