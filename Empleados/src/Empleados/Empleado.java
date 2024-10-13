package Empleados;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    // Constructor
    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;  // Se inicia en 0 años
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    // Métodos
    public void incrementarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void imprimir() {
        System.out.println("Empleado: " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Direccion: " + direccion);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Salario: " + salario);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.getNombre());
        } else {
            System.out.println("No tiene supervisor.");
        }
    }
}
