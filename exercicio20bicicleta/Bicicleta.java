package exercicio20bicicleta;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;
    private boolean emMovimento;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
        this.emMovimento = false;
    }

    public void pedalar() {
        if (!emMovimento) {
            emMovimento = true;
            System.out.println("A bicicleta " + marca + " " + modelo + " está em movimento.");
        } else {
            System.out.println("A bicicleta já está em movimento.");
        }
    }

    public void frear() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("A bicicleta " + marca + " " + modelo + " parou.");
        } else {
            System.out.println("A bicicleta já está parada.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }
}