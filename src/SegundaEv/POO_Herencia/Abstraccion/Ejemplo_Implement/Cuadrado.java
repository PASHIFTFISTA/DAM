package SegundaEv.POO_Herencia.Abstraccion.Ejemplo_Implement;

public class Cuadrado implements Figura {

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
