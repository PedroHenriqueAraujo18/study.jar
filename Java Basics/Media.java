import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Media{
	public static void main(String[] args)throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		/*
		O Compilador requiriu a inicialização destas variavéis.
		*/
		float notaUm=0;
		float notaDois=0;
		float notaTres=0;
		
		float mediaAritmetica;
		
		do{
		writer.write("Digite a primeira nota:");
		writer.flush();
		notaUm = Float.parseFloat(reader.readLine());
		
		writer.write("Digite a segunda nota:");
		writer.flush();
		notaUm = Float.parseFloat(reader.readLine());
		
		
		
		writer.write("Digite a terceira nota:");
		writer.flush();
		notaUm = Float.parseFloat(reader.readLine());
		
		if(notaUm >=0 && notaDois >=0 && notaTres>=0){
			mediaAritmetica = (notaUm + notaDois + notaTres)/3;
			System.out.println("Média:" + mediaAritmetica);
		}else{
			System.out.println("Notas tem que ser maior ou igual a zero");
		}
	
		}while(notaUm <0 && notaDois <0 && notaTres<0);
	writer.close();
	reader.close();
	
}
}