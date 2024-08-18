/*
Faça um programa que receba o salário base de um funcionário, calcule 
e mostre o salário a receber, sabendo-se que o funcionário tem 
gratificação de 5% sobre o salário base (que será acrescentado ao 
salário) e paga imposto de 7% sobre este salário (o que será 
descontado do salário).
*/

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salario{
	
	public static void main(String[] args)throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double salarioFuncionario;
		
		do{
			writer.write("Digite o salario do funcionario:");
			writer.flush();
			salarioFuncionario = Double.parseDouble(reader.readLine());
			
			if(salarioFuncionario <0){
				System.out.println("Salario deve ser maior que zero");
			}
		}while(salarioFuncionario<0);
		salarioFuncionario = salarioFuncionario * (1 + 0.05) * (1 - 0.07);
		System.out.println("Salario atual do funcionario:" + salarioFuncionario);
	}
}