package SegundaEv.POO_Herencia.EjemploClasesHerencia;

public class C extends B{
    protected int atributoC;

    public void MetodoC (){

        System.out.println("Soy C");
    }

    public void disparar (){

        System.out.println("con pistola");
    }

    public void dispararOriginal (){

        super.disparar();
    }

}
