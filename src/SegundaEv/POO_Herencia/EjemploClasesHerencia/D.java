package SegundaEv.POO_Herencia.EjemploClasesHerencia;

public class D extends B{

    protected int atributoD;

    public D(int atributoA) {
        super(atributoA);
    }

    public void MetodoD (){

        System.out.println("Soy D");
    }

    public void disparar (){

        System.out.println("con Arco");
    }

    public void dispararOriginal (){

        super.disparar();
    }

}
