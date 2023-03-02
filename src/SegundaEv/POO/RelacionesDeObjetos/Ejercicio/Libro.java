package SegundaEv.POO.RelacionesDeObjetos.Ejercicio;

import java.util.ArrayList;

public class Libro {

    private String titulo;
    private long ISBN;
    private String autor;
    private int añoPublicacion;

    private ArrayList <Pagina>pagina;
    private int numeroPaginas;

    public Libro(String titulo, long ISBN, String autor, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.pagina = new ArrayList<>();
        this.numeroPaginas=numeroPaginas;
    }


    public void añadirPagina (String contenido, int numpag){


        pagina.add(new Pagina(contenido,numpag));

    }

    public void mostrarLibro(){

        System.out.println("Descripción del llibro: ");

        System.out.println("Autor: "+this.autor);
        System.out.println("Titulo: "+this.titulo);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Numero de paginas: "+this.numeroPaginas);

        System.out.println("Contenido:");


        for (Pagina aux : pagina) {

            System.out.println("Página "+aux.numerosPagina()+": "+aux.toString());
        }



    }

}
