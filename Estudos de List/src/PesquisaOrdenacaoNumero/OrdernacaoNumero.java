package PesquisaOrdenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdernacaoNumero {
    List<Numero> numeros;
    public OrdernacaoNumero() {
        numeros = new ArrayList<Numero>();
    }
    public void adicionarNumero(int numero) {
        numeros.add(new Numero(numero));
    }
    public void ordenarAscendente(){
        Collections.sort(numeros, new Comparator<Numero>() {
            public int compare(Numero o1, Numero o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });
    }
    public void ordenarDescendente(){
        Collections.sort(numeros, Collections.reverseOrder(new Comparator<Numero>() {
            public int compare(Numero o1, Numero o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        }));
    }
    public void imprimirNumeros() {
        for (Numero numero : numeros) {
            System.out.println(numero.getNumero());
        }
    }
}
