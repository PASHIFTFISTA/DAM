package SegundaEv.POO_Herencia.Tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empleo;
        System.out.print("Indica si es empleado de produccion o empleado de distribucion: ");
        empleo = sc.nextLine();
        int dias_gastados;
        if (empleo.equalsIgnoreCase("produccion")) {
            EmpleadoProduccion Empleado = new EmpleadoProduccion();
            System.out.print("Introduce el nombre del empleado de produccion: ");
            Empleado.setNombre(sc.nextLine());
            System.out.print("Elige turno entre mañana, tarde y noche: ");
            try {
                String turno = sc.next();
                if (turno.equalsIgnoreCase("mañana") || turno.equalsIgnoreCase("tarde")
                        || turno.equalsIgnoreCase("noche")) {
                    Empleado.setTurno(turno);
                } else {
                    throw new InputMismatchException("El turno introducido no es válido");
                }
                System.out.print("Introduce el dni sin letra: ");
                try {
                    Empleado.setDni(sc.nextLong());
                    System.out.print("Introduce los dias de vacaciones gastados: ");
                    dias_gastados = sc.nextInt();
                    Empleado.setDiasVacaciones(dias_gastados);
                    System.out.println(Empleado.toString());
                } catch (InputMismatchException e) {
                    System.out.println("Ejecuta el programa de nuevo e introduce el DNI bien, y sin letra");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, ejecuta el programa de nuevo e introduce un turno valido");
            }
        } else if (empleo.equalsIgnoreCase("distribucion")) {
            EmpleadoDistribucion Empleado = new EmpleadoDistribucion();
            System.out.print("Introduce el nombre del empleado de distribucion: ");
            Empleado.setNombre(sc.nextLine());
            System.out.print("Introduce la zona de trabajo entre Madrid, Ponferrada o Astorga: ");

            try {
                String zona = sc.next();
                if (zona.equalsIgnoreCase("Madrid") || zona.equalsIgnoreCase("Ponferrada")
                        || zona.equalsIgnoreCase("Astorga")) {
                    Empleado.setZona(zona);
                } else {
                    throw new InputMismatchException("La zona no pertenece a ninguna localizacion de la empresa");
                }
                System.out.println("Introduce el dni sin letra: ");
                try {
                    Empleado.setDni(sc.nextLong());
                    System.out.print("Introduce los dias de vacaciones gastados: ");
                    dias_gastados = sc.nextInt();
                    Empleado.setDiasVacaciones(dias_gastados);
                    System.out.print(Empleado.toString());
                } catch (InputMismatchException e) {
                    System.out.println(
                            "DNI no valido, por favor jecuta el programa de nuevo e introduce el DNI bien, y sin letra");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, ejecuta de nuevo el programa e introduce una zona valida");
            }
        } else {
            System.out.println("Ejecuta el programa de nuevo e introduce bien el tipo de empleado");
        }
    }
}