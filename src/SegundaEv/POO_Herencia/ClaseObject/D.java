package SegundaEv.POO_Herencia.ClaseObject;

public class D extends B {

    protected int atributoD;

    public void MetodoD (){

        System.out.println("Soy D");
    }


    public void disparar() {

        System.out.println("con pistola");
    }
    public void dispararOriginal(){
        super.disparar();

    }


}
