package exercicio16loja;
public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja \"" + nome + "\" está aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja \"" + nome + "\" está fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAberta() {
        return aberta;
    }
}