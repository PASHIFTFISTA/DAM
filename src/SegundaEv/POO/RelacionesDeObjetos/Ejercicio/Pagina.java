package SegundaEv.POO.RelacionesDeObjetos.Ejercicio;

public class Pagina {

    private String contenido;
    private int numero;


    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }




    public String toString(){


        return this.contenido;
    }

    public int numerosPagina (){

        return this.numero;
    }
}
