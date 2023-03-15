package SegundaEv.POO_Herencia.Abstraccion.Figuras_abstract;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {

        return lado*lado;
    }

    @Override
    public String nombre() {
        return "Soy un cuadrado";
    }
}
