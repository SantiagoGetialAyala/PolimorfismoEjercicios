package Figuras;

public class Rectangulo extends FiguraGeometrica {
    private int valor2;

    public Rectangulo(int lado1, int lado2) {
        super(lado1);
        this.valor2 = lado2;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double getArea() {
        return valor1 * valor2;  
    }

    @Override
    public double getPerimetro() {
        return 2 * (valor1 + valor2);  
    }
}
