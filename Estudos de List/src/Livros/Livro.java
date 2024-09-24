package Livros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livros.Livro{" +
                "Titulo=" + titulo +
                ", Autor=" + autor +
                ", Ano=" + anoPublicacao + '}';
    }
}
