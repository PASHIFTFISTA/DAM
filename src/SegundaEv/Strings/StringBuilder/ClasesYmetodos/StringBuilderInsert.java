package SegundaEv.Strings.StringBuilder.ClasesYmetodos;

public class StringBuilderInsert {

    public static void main(String[] args) {
        String nombre = "Angel";
        StringBuilder nombreDinamico = new StringBuilder(nombre);
        nombreDinamico.insert(0, "#");
        System.out.println(nombreDinamico);
        nombreDinamico.setCharAt(0, 'c');
        System.out.println(nombreDinamico);
    }

}
