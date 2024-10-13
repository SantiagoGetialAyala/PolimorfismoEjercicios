package Empleados;

public class JefeDeZona extends Empleado {
    private String coche;
    private Secretario secretario;
    private Vendedor[] vendedores;

    // Constructor
    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.vendedores = new Vendedor[5]; 
    }

  
    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void altaVendedor(Vendedor vendedor) {
        
    }

    public void bajaVendedor(Vendedor vendedor) {
       
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(20); // 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + coche);
        if (secretario != null) {
            System.out.println("Secretario: " + secretario.getNombre());
        }
        
    }
}
