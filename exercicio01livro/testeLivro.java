package exercicio01livro;

public class testeLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 328);

        livro.abrirLivro();

        livro.lerPagina();
        livro.lerPagina();

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de Páginas: " + livro.getNumeroDePaginas());
        System.out.println("Página Atual: " + livro.getPaginaAtual());
    }
}