package SegundaEv.POO_Herencia.Tarea;

public class EmpleadoProduccion extends Asalariado{

    private String turno;


    public EmpleadoProduccion(String nombre, long dni, int dias,String turno) {
        super();
        this.turno=turno;
    }
    public EmpleadoProduccion(String nombre, long dni, int dias) {
        super();
        this.turno="Sin asignar";
    }

    public EmpleadoProduccion (){
        super(null,0,0);
        this.turno="Sin asignar";
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String cambioTurno (){

        if (this.getTurno().equalsIgnoreCase("tarde")) {

            this.setTurno("Noche");
        } else if (this.getTurno().equalsIgnoreCase("Noche")) {
            this.setTurno("Mañana");

        } else {
            this.setTurno("Tarde");
        }

        return getTurno();
    }

}
