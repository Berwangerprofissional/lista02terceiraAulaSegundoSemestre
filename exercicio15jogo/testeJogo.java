package exercicio15jogo;

public class testeJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Legend of Zelda", "Aventura", 299.99);

        jogo.iniciar();
        jogo.pausar();
    }
}
