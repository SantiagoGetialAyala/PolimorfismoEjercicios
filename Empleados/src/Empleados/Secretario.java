package Empleados;

public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    // Constructor
    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    // Getters y Setters
    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(5); // Incrementa el salario un 5% anual
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Numero de Fax: " + numeroFax);
    }
}
