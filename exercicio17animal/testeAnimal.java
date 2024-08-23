package exercicio17animal;

public class testeAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 5, 180.0);

        animal.alimentar(5.0);
        animal.dormir();
    }
}
