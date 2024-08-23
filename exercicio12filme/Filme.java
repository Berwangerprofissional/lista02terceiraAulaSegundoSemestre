package exercicio12filme;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private boolean emExibicao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.emExibicao = false;
    }

    public void iniciar() {
        if (!emExibicao) {
            emExibicao = true;
            System.out.println("O filme \"" + titulo + "\" está em exibição.");
        } else {
            System.out.println("O filme já está em exibição.");
        }
    }

    public void parar() {
        if (emExibicao) {
            emExibicao = false;
            System.out.println("O filme \"" + titulo + "\" foi interrompido.");
        } else {
            System.out.println("O filme já está parado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isEmExibicao() {
        return emExibicao;
    }
}
