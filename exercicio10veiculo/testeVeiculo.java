package exercicio10veiculo;

public class testeVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");

        veiculo.abastecer();
        veiculo.lavar();
    }
}