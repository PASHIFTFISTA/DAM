package SegundaEv.POO.RelacionesDeObjetos.Paso5;

import java.util.Date;

public class Movimiento {
	private Date fecha;
	private char tipo;
	private Float importe;
	private Float saldo;
	
	public Movimiento(Date fecha, char tipo, Float importe, Float saldo) {
		this.fecha = fecha;
		this.tipo = tipo;
		this.importe = importe;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Movimiento [fecha=" + fecha + ", tipo=" + tipo + ", importe=" + importe + ", saldo=" + saldo + "]";
	}
}