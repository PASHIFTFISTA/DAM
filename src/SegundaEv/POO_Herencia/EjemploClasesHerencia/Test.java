package SegundaEv.POO_Herencia.EjemploClasesHerencia;

public class Test {

    public static void main(String[] args) {

        A miA = new A();
        B miB = new B();
        C miC = new C();
        D miD = new D();

        miA.MetodoA();
        miB.MetodoB();
        miC.MetodoC();
        miD.MetodoD();
        miD.MetodoA();

        Object objeto = new A();




    }
}
