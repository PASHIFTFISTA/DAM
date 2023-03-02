package SegundaEv.POO.Excepciones;

public class MiExcepcion extends Exception {

    public MiExcepcion() { // Constructor por defecto
        super();
    }

    public MiExcepcion(String s) { // Constructor con mensaje
        super(s);
    }


    public static void main(String[] args) {

        try {
            throw new MiExcepcion();

        } catch (MiExcepcion a) {
            System.out.println("Error generado");

        } catch (Exception e) {
            System.out.println("Capturado");
        }

    }
}