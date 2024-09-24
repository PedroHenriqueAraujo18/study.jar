package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> lista;

    public ListaTarefa() {
        lista = new ArrayList<Tarefa>();
    }
    public void adicionaTarefa(String descricao) {
        lista.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for (Tarefa tarefa : lista) {
        if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaRemover.add(tarefa);
            }
        }
        lista.removeAll(tarefaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return lista.size();
    }
    public void obterDescricaoTarefas() {
       System.out.print(lista);
    }
}
