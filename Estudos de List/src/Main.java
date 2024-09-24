
import PesquisaOrdenacaoNumero.OrdernacaoNumero;
import PesquisaOrdenacaoPessoa.OrdenacaoPessoas;


public class Main {
    public static void main(String[] args)
    {
        OrdernacaoNumero numeros = new OrdernacaoNumero();

        // Adicionar números
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(3);

        // Ordenar em ordem ascendente
        System.out.println("Ordenado em ordem ascendente:");
        numeros.ordenarAscendente();
        numeros.imprimirNumeros();

        // Ordenar em ordem descendente
        System.out.println("\nOrdenado em ordem descendente:");
        numeros.ordenarDescendente();
        numeros.imprimirNumeros();
    }
}