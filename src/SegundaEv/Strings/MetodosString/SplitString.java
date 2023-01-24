package SegundaEv.Strings.MetodosString;

public class SplitString {
    public static void main(String[] args) {
        String str1 = "Hola amigo mio";
        // La expresión regular indica que es " "
        String [] partes1 = str1.split(" ");
        for (int i = 0; i < partes1.length; i++) {
            System.out.println(partes1[i]);
        }

        String str2 = "Qué * tal / estás";
        // La expresión regular indica que es " * " ó " / "
        String [] partes2 = str2.split(" [*|/] ");//Expresiones regulares, posible facilidad en su uso en el trabajo.
        for (int i = 0; i < partes2.length; i++) {
            System.out.println(partes2[i]);
        }
    }
}
