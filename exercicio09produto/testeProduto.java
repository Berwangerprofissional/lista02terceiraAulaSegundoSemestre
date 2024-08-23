package exercicio09produto;

public class testeProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", 15.00, 100);

        produto.aumentarEstoque(20);
        produto.diminuirEstoque(10);
    }
}
