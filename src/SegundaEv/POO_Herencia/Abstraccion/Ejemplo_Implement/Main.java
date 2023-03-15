package SegundaEv.POO_Herencia.Abstraccion.Ejemplo_Implement;

public  class Main {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.00,5.00);

        System.out.println(t.nombre());

        System.out.println(t.area());


        System.out.println();
        Cuadrado c = new Cuadrado(4.00);

        System.out.println(c.nombre());
        System.out.println(c.area());

    }


}
