package SegundaEv.POO.RelacionesDeObjetos.Paso7;

import java.util.Date;
import java.util.LinkedList;

public class Cuenta {
	private Long numero;
	private Float saldo;
	private Float interesAnual;
	private Cliente titular;
	private LinkedList <Movimiento> movimientos;

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
	
	public Cuenta(Long numero, Float interesAnual, Cliente titular) {
		this.numero = numero;
		this.saldo = 0F;
		this.interesAnual = interesAnual;
		this.titular = titular;
		this.movimientos=new LinkedList<Movimiento>();
	}

	public Cuenta(Long numero) {
		this(numero, 0.1f, null);
	}

	public void ingreso(Float cantidad) {
		movimientos.add(new Movimiento(new Date(),'I',cantidad,saldo += cantidad));
	}

	public void reintegro(Float cantidad) {
		movimientos.add(new Movimiento(new Date(),'R',cantidad,saldo -= cantidad));
	}

	public void ingresoInteresMes() {
		this.ingreso(interesAnual * saldo / 1200);
	}

	public boolean enRojos() {
		return saldo < 0;
	}

	public Float leerSaldo() {
		return saldo;
	}
	public Cliente leerTitular (){
		return titular;
	}
	public void transferirHasta(Cuenta c, Float cantidad){
		reintegro (cantidad);
		c.ingreso(cantidad);
	}
	public void transferirDesde (Cuenta c, Float cantidad){
		c.transferirHasta(this, cantidad);
	}
	
	public void salvar() {
		String imprime = "Cuenta [numero=" + numero + ", saldo=" + saldo + ", interesAnual=" + interesAnual
				+ ", titular=" + titular.nombreCompleto() + ", domicilio=" + titular.direccionCompleta() + "]";
		System.out.println(imprime);
		for (Movimiento movimiento : movimientos) {
			System.out.println("--> " + movimiento);
		}
	}
}