package SegundaEv.ColeccionesDeDatos.SetMap.Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Antonio", 7);
        notas.put("Pedro", 9);
        notas.put("Luis", 10);
        notas.put("Marco", 7);
        notas.put("María", 4);
        notas.put("Ana", 10);

        // Obtener la nota de Pedro con get

        System.out.println(notas.get("Pedro"));

        // Preguntar si el alumno María está en lista

        System.out.println(notas.containsKey("María")?"Esta":"No esta");

        // Sacar la nota media de la clase
        int aux=0;

        for (int elto: notas.values()) {
            aux+=elto;
        }

        System.out.println(aux/notas.size());
        // Listado de todos los alumnos -> Alumno: Nota


        for (HashMap.Entry <String, Integer > entry: notas.entrySet()) {
            System.out.println(entry.toString().replace("=",":"));

        }
    }
}
