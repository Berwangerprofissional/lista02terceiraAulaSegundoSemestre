package exercicio05cachorro;
public class testeDog {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Labrador", 3);

        cachorro.latir();
        cachorro.correr();
    }
}