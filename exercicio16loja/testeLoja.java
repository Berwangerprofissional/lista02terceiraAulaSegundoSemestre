package exercicio16loja;

public class testeLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja do Bairro", "Rua das Flores, 123", "1234-5678");

        loja.abrir();
        loja.fechar();
    }
}
