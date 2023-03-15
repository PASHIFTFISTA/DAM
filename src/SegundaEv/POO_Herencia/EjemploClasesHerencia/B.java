package SegundaEv.POO_Herencia.EjemploClasesHerencia;


public class B  extends A{

    protected int atributoB;

    public B(int atributoA) {
        super(atributoA);
    }

    public void MetodoB (){

        System.out.println("Soy B");
    }

    public void disparar (){

        System.out.println("Puummm");
    }


}
