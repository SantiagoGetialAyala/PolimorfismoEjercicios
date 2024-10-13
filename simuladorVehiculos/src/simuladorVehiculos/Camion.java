package simuladorVehiculos;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int kmh) {
        if (remolque != null && velocidad + kmh > 100) {
            System.out.println("El camión con remolque no puede acelerar a más de 100 km/h");
        } else {
            super.acelerar(kmh);
        }
    }

    @Override
    public String toString() {
        String info = super.toString();
        if (remolque != null) {
            info += ", Remolque: " + remolque.toString();
        }
        return info;
    }
}
