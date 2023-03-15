package SegundaEv.POO_Herencia.Tarea;

public class EmpleadoDistribucion extends Asalariado{

    private String zona;

    public EmpleadoDistribucion(String nombre, long dni, int dias, String zona) {
        super();
        this.zona=zona;
    }

    public EmpleadoDistribucion(String nombre, long dni, int dias) {
        super();
        this.zona="Sin asignar";
    }
    public EmpleadoDistribucion() {
        super();
        this.zona = "Sin asignar";
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String cambioZona (){

        if (this.getZona().equalsIgnoreCase("tarde")) {

            this.setZona("Noche");
        } else if (this.getZona().equalsIgnoreCase("Noche")) {
            this.setZona("Mañana");

        } else {
            this.setZona("Tarde");
        }

        return getZona();
    }



}
