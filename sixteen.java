import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader s =new BufferedReader(new InputStreamReader(System.in));
        double populationEarth = 7.8;
        char a ='B';
        int year;

        System.out.println("Enter a year:");
        year = Integer.parseInt(s.readLine());
        double totalPopulation = (populationEarth *(0.09*year))+populationEarth;

        System.out.println("Earth Population : " + totalPopulation + a);
    }
}