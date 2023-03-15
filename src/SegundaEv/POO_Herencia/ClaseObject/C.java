package SegundaEv.POO_Herencia.ClaseObject;

public class C extends B {
    protected int atributoC;

    public void MetodoC (){

        System.out.println("Soy C");
    }

    public void disparar() {

        System.out.println("Con arco");
    }

    public void dispararOriginal(){
        super.disparar();

    }


    public void metodoReferenciado (){

        super.methodA();
    }
}
