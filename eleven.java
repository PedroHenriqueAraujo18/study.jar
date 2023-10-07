import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        int d;
        int e;


        System.out.println("Enter a integer:");
        a =Integer.parseInt(s.readLine());

        System.out.println("Enter a integer:");
        b =Integer.parseInt(s.readLine());

        System.out.println("Enter a integer:");
        c=Integer.parseInt(s.readLine());

        System.out.println("Enter a integer:");
        d=Integer.parseInt(s.readLine());

        System.out.println("Enter a integer:");
        e=Integer.parseInt(s.readLine());
        int maior;

       if(a>b){
           if(a>c){
               if(a>d)
                   if(a>e){
                       System.out.println(a);
                       maior = a;
                       System.out.println("Maior numero " + maior);

                   }
           }
       }
        if(b>a){
            if(b>c){
                if(b>d)
                    if(b>e){
                        System.out.println(b);
                        maior = b;
                        System.out.println("Maior numero " + maior);
                    }
            }
        }
        if(c>a){
            if(c>b){
                if(c>d)
                    if(c>e){
                        System.out.println(c);
                        maior = c;
                        System.out.println("Maior numero " + maior);
                    }
            }
        }

        if(d>a){
            if(d>b){
                if(d>c)
                    if(d>e){
                        System.out.println(d);
                        maior = d;
                        System.out.println("Maior numero " + maior);
                    }
            }
        }

        if(e>a){
            if(e>b){
                if(e>c)
                    if(e>d){
                        System.out.println(e);
                        maior = e;
                        System.out.println("Maior numero " + maior);
                    }
            }
        }

    }
}