package exercicio06computador;

public class testeComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel Core i7", 16, 512);

        computador.ligar();
        computador.desligar();
    }
}