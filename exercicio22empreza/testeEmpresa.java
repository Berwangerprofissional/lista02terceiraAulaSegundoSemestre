package exercicio22empreza;

public class testeEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90", 50);

        empresa.contratar();
        empresa.demitir();
    }
}
