import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Subtrair{
	public static void main(String[] args)throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	int numeroUm;
	int numeroDois;
	int res;
	writer.write("Digite o primeiro numero:\n");
	writer.flush();
	numeroUm =Integer.parseInt(reader.readLine());
	
	
	writer.write("Digite o segundo numero:\n");
	writer.flush();
	numeroDois =Integer.parseInt(reader.readLine());
	
	res = numeroUm-numeroDois;
	
	writer.write("Resultado é : " + res);
	writer.flush();
	
	
	writer.close();
	reader.close();
	
	}
}