package exercicio12filme;

public class testeFIlme {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", "Christopher Nolan", 148);

        filme.iniciar();
        filme.parar();
    }
}
