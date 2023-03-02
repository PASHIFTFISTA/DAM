package SegundaEv.POO.StaticMethods;

public class ReferenciaStatic {
    private int dato = 0;
    private static int datoStatic=0;

    public void metodo () { this.datoStatic++; }

    public static void metodoStatic() {
        ReferenciaStatic.datoStatic++; // Esto da error al compilar (regla 1) //Usar el nombre de la clase en lugar de "this."
        datoStatic++; // Esta es correcta
    }

    public static void main(String[] args) {

        datoStatic++; // Esto es correcta

        metodoStatic(); // Esto es correcta
    }
}
