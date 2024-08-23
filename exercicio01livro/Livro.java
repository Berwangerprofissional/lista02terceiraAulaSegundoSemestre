package exercicio01livro;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0; // Inicia na página 0
    }

    public void abrirLivro() {
        if (paginaAtual == 0) {
            paginaAtual = 1;
            System.out.println("O livro \"" + titulo + "\" foi aberto na página " + paginaAtual + ".");
        } else {
            System.out.println("O livro já está aberto na página " + paginaAtual + ".");
        }
    }

    public void lerPagina() {
        if (paginaAtual > 0 && paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Você leu a página " + paginaAtual + " do livro \"" + titulo + "\".");
        } else if (paginaAtual == numeroDePaginas) {
            System.out.println("Você já está na última página do livro \"" + titulo + "\".");
        } else {
            System.out.println("Abra o livro primeiro antes de começar a ler.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }
}