package SegundaEv.POO_Herencia.Abstraccion.Figuras_abstract;

public class Triangulo extends Figura{
    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public String nombre() {
        return "Soy un triángulo";
    }
}
