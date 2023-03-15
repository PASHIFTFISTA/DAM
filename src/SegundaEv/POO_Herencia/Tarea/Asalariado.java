package SegundaEv.POO_Herencia.Tarea;


public class Asalariado {

    private String nombre;
    private long dni;
    private int diasVacaciones;



    public Asalariado(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }

    public Asalariado() {
     this ("S/N",0,30);
    }
    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public int diasRestantes (int numero){

        setDiasVacaciones(getDiasVacaciones()-numero);

        return diasVacaciones;
    }


}
