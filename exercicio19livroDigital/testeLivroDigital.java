package exercicio19livroDigital;

public class testeLivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Java para Iniciantes", "João Silva", 1.5);

        livro.abrir();
        livro.fechar();
    }
}
