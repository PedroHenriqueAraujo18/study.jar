package PesquisaOrdenacaoPessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa"(uma classe tb) como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
 */
public class OrdenacaoPessoas {
    List<Pessoa> pessoas;
    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade,float altura){
        pessoas.add(new Pessoa(nome,idade,altura));
    }
    public void OrdenarPorIdade(){
        Collections.sort(pessoas);
    }
    public void OrdenarPorAltura() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
        });
    }
    public void imprimirPessoas() {
        for (int i = 0; i <pessoas.size(); i++) {
            System.out.println(pessoas);
        }
    }
}
