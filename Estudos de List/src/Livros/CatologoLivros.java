package Livros;

import java.util.ArrayList;
import java.util.List;

public class CatologoLivros {
    private List<Livro> livros;
    public CatologoLivros() {
        this.livros = new ArrayList<>();
    }
    public void addLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));

    }
    public List<Livro> PesquisarAutor(String autor) {
        if (livros.isEmpty()) return null;
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);

            }
        }
        return resultado;
    }
    public List<Livro> PesquisarPorAno(int anoInicial, int anoFinal) {
        if (livros.isEmpty()) return null;
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
    public Livro PesquisarTitulo(String titulo) {
        Livro liv = null;
        if (livros.isEmpty()) return null;
        for (Livro livro1 : livros) {
            if (livro1.getTitulo().equalsIgnoreCase(titulo)) {
                liv = livro1;
                break;
            }
        }
        return liv;
    }
}
