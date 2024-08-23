package exercicio20bicicleta;

public class testeBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Explorer", 26);

        bicicleta.pedalar();
        bicicleta.frear();
    }
}
