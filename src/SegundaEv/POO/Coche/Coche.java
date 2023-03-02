package SegundaEv.POO.Coche;

public class Coche {//Trabajamos  para una marca pero eso puede cambiar.
    public static String marca="Mercedes";
    String color;
    public Integer deposito;
    private Integer cilindrada;

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }



    public  String getMarca() {
        return marca;
    }

    public  void setMarca(String marca) {
        Coche.marca = marca;
    }



    public Coche(String color, Integer deposito) {
        this.color = color;
        this.deposito = deposito;
    }

    public static void main(String[] args) {

        Coche cochePrimero = new Coche("Azul",30);
        cochePrimero.setMarca("Dacia");
        System.out.println("El primer coche es de la marca "+cochePrimero.getMarca()+" y de color "+cochePrimero.color+" con "+cochePrimero.deposito+" litros de depósito");
        cochePrimero.setCilindrada(140);
        System.out.println();
        System.out.println("Con una cilindrada de "+cochePrimero.getCilindrada());

        System.out.println();
        Coche cocheSegundo = new Coche("Rojo",25);
        cocheSegundo.setMarca("Honda");
        cochePrimero.setCilindrada(170);
        System.out.println("El primer coche es de la marca "+cocheSegundo.getMarca()+" y de color "+cocheSegundo.color+" con "+cocheSegundo.deposito+" litros de depósito");

        System.out.println( "Con una cilindrada de: "+cocheSegundo.getCilindrada());


    }


}
