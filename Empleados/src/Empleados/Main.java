package Empleados;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan", "Perez", "12345678A", "Calle Falsa 123", "555-1234", 2000);
        Secretario secretario1 = new Secretario("Ana", "Gomez", "98765432B", "Avenida Real 456", "555-5678", 2500, "Despacho 101", "555-1010");
        Vendedor vendedor1 = new Vendedor("Luis", "Martinez", "23456789C", "Calle Luna 789", "555-9876", 3000, "Coche XYZ");
        JefeDeZona jefe1 = new JefeDeZona("Carlos", "Lopez", "34567890D", "Avenida Sol 321", "555-3333", 5000, "Coche ABC");

        
        jefe1.cambiarSecretario(secretario1);
        vendedor1.setSupervisor(jefe1);

        
        secretario1.incrementarSalario(5);
        vendedor1.incrementarSalario(10);
        jefe1.incrementarSalario(20);

        
        empleado1.imprimir();
        System.out.println();
        secretario1.imprimir();
        System.out.println();
        vendedor1.imprimir();
        System.out.println();
        jefe1.imprimir();
    }
}
