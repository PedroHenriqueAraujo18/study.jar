import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)

    {

    /*
        Exemplo sem generics
     */
        List dados = new ArrayList();
        dados.add(10);
        dados.add("Dad");
        for(Object d : dados){
            System.out.println("Sem generics:" + d);
        }

        HashMap de = new HashMap();
        de.put("Dad", "Dad 1");
        de.put("Dad", 1);
        for(Object d : de.entrySet()){
            System.out.println(d);
        }


        System.out.println("====================================================");
        /*
        Exemplo com generics
         */

        HashMap<String,Integer> de2 = new HashMap<>();
        de2.put("Dad", 2);
        de2.put("Dad", 3);

        for(Map.Entry<String,Integer> e : de2.entrySet()){
            String chave = e.getKey();
            int valor = e.getValue();
            System.out.println(chave +","+ valor);
        }


        List<String> DADOS = new ArrayList<>();//vc tipa o tipo da estrutura de dados
        DADOS.add("Dado");
        DADOS.add("Dado 2");
        for(String dado : DADOS){
            System.out.println("Com generics:" + dado);
        }












    }
}