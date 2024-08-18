import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Divisao{
	public static void main(String[] args)throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numeroUm;
		int numeroDois;
		int res;
	do{	
		writer.write("Digite o primeiro numero:");
		writer.flush();
		numeroUm = Integer.parseInt(reader.readLine());
	
		writer.write("Digite o segundo numero:");
		writer.flush();
		numeroDois = Integer.parseInt(reader.readLine());
		
		
		if(numeroDois<=0){
		System.out.println("Numero tem que ser maior que zero!");
		}
		
	}while(numeroDois<=0);
		
		res = numeroUm/numeroDois;
		System.out.println("Resposta : " + res);	
		
		
	reader.close();
    writer.close();
	
	}
	
	
}