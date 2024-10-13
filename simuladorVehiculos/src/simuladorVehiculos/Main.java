package simuladorVehiculos;

public class Main {
    public static void main(String[] args) {
      
        Coche coche = new Coche("ABC123", 4);
        coche.acelerar(50);
        System.out.println(coche);

       
        Camion camion = new Camion("XYZ789");
        camion.acelerar(80);
        System.out.println(camion);

      
        Remolque remolque = new Remolque(1500);
        camion.ponRemolque(remolque);
        camion.acelerar(30); 
        System.out.println(camion);

     
        camion.quitaRemolque();
        camion.acelerar(30);
        System.out.println(camion);
    }
}
