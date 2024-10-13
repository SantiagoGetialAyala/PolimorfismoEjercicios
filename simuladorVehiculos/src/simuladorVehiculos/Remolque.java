package simuladorVehiculos;

public class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Peso del remolque: " + peso + " kg";
    }
}
