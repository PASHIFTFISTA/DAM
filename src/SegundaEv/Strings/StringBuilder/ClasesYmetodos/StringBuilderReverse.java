package SegundaEv.Strings.StringBuilder.ClasesYmetodos;

public class StringBuilderReverse {
    public static void main(String[] args) {

        String nombre = "Angel";
        StringBuilder nombreDinamico = new StringBuilder(nombre);
        nombreDinamico.insert(0, "#");
        System.out.println(nombreDinamico);
        nombreDinamico.setCharAt(0, 'c');
        System.out.println(nombreDinamico);

        //Reverse

        nombreDinamico.reverse();
        System.out.println(nombreDinamico);

        System.out.println("!Hola Mundo¡");
    }
}
