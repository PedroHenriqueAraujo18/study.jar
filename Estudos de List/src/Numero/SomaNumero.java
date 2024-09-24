package Numero;

import java.util.ArrayList;
import java.util.List;

/*
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class SomaNumero {
    List<Numero> numeros;
    public SomaNumero() {
        this.numeros = new ArrayList<Numero>();
    }
    public void adicionarNumero(int num) {
        this.numeros.add(new Numero(num));
    }
    public void calcularSoma(){
        int soma = 0;
        for(Numero num : this.numeros){
            soma = soma + num.getNum();
        }
    }
    public void getNumeros() {
        for(Numero num : this.numeros){
            System.out.print(num.getNum());
        }
    }
    public void encontrarMaioreMenorNumero(){
        int maior = this.numeros.getFirst().getNum();
        int menor = this.numeros.getFirst().getNum();
        for(Numero num : this.numeros){
            if(num.getNum() > maior){
                maior = num.getNum();
            }
            if(num.getNum() < menor){
                menor = num.getNum();
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }

}
