package exercicio19livroDigital;
public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro digital \"" + titulo + "\" está aberto.");
        } else {
            System.out.println("O livro digital já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro digital \"" + titulo + "\" foi fechado.");
        } else {
            System.out.println("O livro digital já está fechado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public boolean isAberto() {
        return aberto;
    }
}