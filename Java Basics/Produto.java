/*
Faça um programa que receba o preço de um produto, calcule e mostre 
o novo preço, sabendo-se que este sofreu um desconto de 10%. Por 
exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o 
novo preço R$ 90,00.
*/

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Produto{
	
	public static void main(String[] args)throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		float preco=0.0F;
		float precoDesconto;
		
		do{
		writer.write("Digite o preco do produto:");
		writer.flush();
		preco = Float.parseFloat(reader.readLine());
		
		
		if(preco < 0){
			System.out.println("Preco tem que ser maior que zero \n ");
		}
		
		}while(preco < 0);
			
		precoDesconto = (preco *10)/100;
		System.out.println("Preco sem desconto:" + preco + "\n");
		System.out.println("Preco com desconto: " + (preco - precoDesconto));
		writer.close();
		reader.close();
		
	}
	
	
}
