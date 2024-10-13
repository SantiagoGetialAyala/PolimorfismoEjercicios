package Figuras;

public class Cubo extends Cuadrado {

    public Cubo(int lado) {
        super(lado);
    }

    @Override
    public double getArea() {
        return 6 * super.getArea(); 	
    }
}
		