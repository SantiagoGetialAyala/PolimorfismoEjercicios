package simuladorVehiculos;

public abstract class Vehiculo {
    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0; 
    }

    public void acelerar(int kmh) {
        this.velocidad += kmh;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }
}
