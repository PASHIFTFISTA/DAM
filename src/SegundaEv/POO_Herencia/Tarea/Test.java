package SegundaEv.POO_Herencia.Tarea;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public ArrayList<EmpleadoDistribucion> empleadosD = new ArrayList<>();
    public ArrayList<EmpleadoProduccion> empleadosP=new ArrayList<>();

    EmpleadoProduccion empleadoP1 = new EmpleadoProduccion();
    EmpleadoDistribucion empleadoD1 = new EmpleadoDistribucion();


    public void addEP (String nombre, long dni, int dias, String zonaTurno){

        empleadosP.add(new EmpleadoProduccion(nombre,dni,dias,zonaTurno));
    }
    public void addED (String nombre, long dni, int dias, String zonaTurno){

        empleadosD.add(new EmpleadoDistribucion(nombre,dni,dias,zonaTurno));
    }

    public static void main(String[] args) {

        Test selector = new Test();

        Scanner in = new Scanner(System.in);

        boolean seguir = true;
        boolean flag = true;
        String eleccion;
        int numero = 0;

        while (seguir) {


            System.out.print("¿Desea añadir empleados? (S/N): ");
            eleccion = in.nextLine();
            System.out.println();

            if (eleccion.equalsIgnoreCase("s")) {

                System.out.print("¿El empleado que va a añadir es de Producción o Distribución?: ");
                eleccion = in.nextLine();

                if (eleccion.equalsIgnoreCase("producción") || eleccion.equalsIgnoreCase("produccion")) {


                    System.out.print("Introduzca el nombre del nuevo empleado: ");
                    eleccion = in.nextLine();
                    selector.empleadoP1.setNombre(eleccion);

                    System.out.println();

                    System.out.print("Introduzca el dni del empleado: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();
                            selector.empleadoP1.setDni(Long.parseLong(eleccion));
                            flag = false;
                        } catch (NumberFormatException a) {
                            System.out.print("Formato incorrecto, por favor, introduzca un número de dni sin letra: ");
                        }
                    }

                    flag = true;
                    System.out.println();

                    System.out.print("Introduzca el turno del nuevo empleado: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();

                            if (eleccion.equalsIgnoreCase("tarde") || eleccion.equalsIgnoreCase("noche")
                                    || eleccion.equalsIgnoreCase("mañana")) {

                                selector.empleadoP1.setTurno(eleccion);
                                flag = false;
                            } else {
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException i) {
                            System.out.print("Turno no valido, introduzca un turno disponible: ");
                        }
                    }
                    flag = true;

                    System.out.println();
                    System.out.print("Introduzca el día de vacaciones del nuevo empleado [Por defecto 30]: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();
                            selector.empleadoP1.setDiasVacaciones(Integer.parseInt(eleccion));
                            flag = false;
                        } catch (NumberFormatException n) {

                            System.out.print("Formato incorrecto, introduzca un número entero: ");
                        }
                    }
                    flag = true;

                    selector.addEP(selector.empleadoP1.getNombre(),selector.empleadoP1.getDni(),selector.empleadoP1.getDiasVacaciones(),selector.empleadoP1.getTurno());

                    //System.out.println(selector.empleadoP1.toString());

                } else {

                    System.out.print("Introduzca el nombre del nuevo empleado: ");
                    eleccion = in.nextLine();
                    selector.empleadoD1.setNombre(eleccion);

                    System.out.println();
                    System.out.print("Introduzca el dni del empleado: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();
                            selector.empleadoD1.setDni(Long.parseLong(eleccion));
                            flag = false;
                        } catch (NumberFormatException a) {
                            System.out.print("Formato incorrecto, por favor, introduzca un número de dni sin letra: ");
                        }
                    }

                    flag = true;
                    System.out.println();

                    System.out.print("Introduzca el turno del nuevo empleado: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();

                            if (eleccion.equalsIgnoreCase("tarde") || eleccion.equalsIgnoreCase("noche")
                                    || eleccion.equalsIgnoreCase("mañana")) {

                                selector.empleadoD1.setZona(eleccion);
                                flag = false;
                            } else {
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException i) {
                            System.out.print("Turno no valido, introduzca un turno disponible: ");
                        }
                    }
                    flag = true;

                    System.out.println();
                    System.out.print("Introduzca el día de vacaciones del nuevo empleado [Por defecto 30]: ");

                    while (flag) {

                        try {
                            eleccion = in.nextLine();
                            selector.empleadoD1.setDiasVacaciones(Integer.parseInt(eleccion));
                            flag = false;
                        } catch (NumberFormatException n) {

                            System.out.print("Formato incorrecto, introduzca un número entero: ");
                        }
                    }
                    flag = true;

                    selector.addED(selector.empleadoD1.getNombre(),selector.empleadoD1.getDni(),selector.empleadoD1.getDiasVacaciones(),selector.empleadoD1.getZona());
                }

            } else {
                seguir = false;

            }
        }

        System.out.println(selector.empleadoP1.getNombre()+" se va de vacaciones y quiere saber cuantos días le quedarán..");
        System.out.println();
        System.out.print("Cuantos días se va?: ");

        while (flag){
            try {
                numero = in.nextInt();
                System.out.println();
                flag=false;
            } catch (InputMismatchException m){

                System.out.println("Introduzca un número válido!");
            }
        }
        System.out.println("A "+ selector.empleadoP1.getNombre()+" le quedan "+selector.empleadoD1.diasRestantes(numero)+" días de vacaciones");


        System.out.println();
        System.out.println(selector.empleadoP1.getNombre()+" se ha cambiado de turno ");
        System.out.println("Ahora su turno es el de "+selector.empleadoP1.cambioTurno());


        /* He intentado hacer esto para realizar consultas de mis empleados en los dos arraylist declarados, pero no consigo acceder a ellos, es como si no los guardara nunca.
        System.out.println("Ahora puede consultar los datos de los empleados por su dni");
        System.out.println();
        System.out.print("Introduzca el dni del empleado que desea consultar: ");

        while (flag) {
            try {
                eleccion = in.nextLine();
                numero = Long.parseLong(eleccion);
                flag=false;
            } catch (NumberFormatException n) {
                System.out.print("Error de formato, vuelva a intentarlo: ");
            }
        }
        flag=true;

        System.out.print("¿En que departamento desea buscar? ¿Producción o Distribución?: ");
        eleccion = in.nextLine();

        if (eleccion.equalsIgnoreCase("producción")||eleccion.equalsIgnoreCase("produccion")) {
            for (EmpleadoProduccion empleado : selector.empleadosP) {
                if (Math.abs(empleado.getDni()) == Math.abs(numero)) {
                    System.out.println("Nombre: " + empleado.getNombre());
                    System.out.println("DNI: " + empleado.getDni());
                    System.out.println("Días de vacaciones: " + empleado.getDiasVacaciones());
                    System.out.println("Turno: " + empleado.getTurno());
                    flag = false;
                    break;
                }
            }
        } else if (eleccion.equalsIgnoreCase("distribución")||eleccion.equalsIgnoreCase("distribucion")) {
            for (EmpleadoDistribucion empleado : selector.empleadosD) {
                if (Math.abs(empleado.getDni()) == Math.abs(numero)) {
                    System.out.println("Nombre: " + empleado.getNombre());
                    System.out.println("DNI: " + empleado.getDni());
                    System.out.println("Días de vacaciones: " + empleado.getDiasVacaciones());
                    System.out.println("Zona: " + empleado.getZona());
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("No se ha encontrado ningún empleado con ese DNI en el departamento indicado.");
        }

*/
    }

}
