package SegundaEv.Strings.StringBuilder.TareaStrings;

public class numbers {

    static String separarMiles(String str){

        StringBuilder aux = new StringBuilder(str);

        aux.reverse();

        for (int i = str.length(); i > 0; i--){

            if(i %3 == 0){
                aux.insert(i,".");
            }
        }
        aux.reverse();

        str = aux.toString();

        return str;
    }



}
