package Figuras;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());

        FiguraGeometrica cuadrado = new Cuadrado(4);
        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());

        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo (aproximado): " + triangulo.getPerimetro());

        Cubo cubo = new Cubo(3);
        System.out.println("Área del cubo: " + cubo.getArea());
    }
}
