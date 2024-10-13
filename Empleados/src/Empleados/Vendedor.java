package Empleados;

public class Vendedor extends Empleado {
    private String coche;
    private String[] clientes;

   
    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.clientes = new String[10];
    }

    
    public void altaCliente(String cliente) {
        
    }

    public void bajaCliente(String cliente) {
        
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(10); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + coche);
    }
}
