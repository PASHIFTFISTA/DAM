package SegundaEv.Strings.StringBuilder.ClasesYmetodos;

public class StringBuilderDelete {

    public static void main(String[] args) {


        String nombre = "Angel";
        StringBuilder nombreDinamico = new StringBuilder(nombre);
        nombreDinamico.insert(0, "#");
        System.out.println(nombreDinamico);
        nombreDinamico.setCharAt(0, 'c');
        System.out.println(nombreDinamico);

        //Delete

        nombreDinamico.delete(0,1);
        System.out.println(nombreDinamico);
    }
}
