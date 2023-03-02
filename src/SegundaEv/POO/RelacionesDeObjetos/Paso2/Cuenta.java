package SegundaEv.POO.RelacionesDeObjetos.Paso2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cuenta {
	private Long numero;
	private Float saldo;
	private Float interesAnual;
	private String titular;

	public Cuenta(Long numero, Float interesAnual, String titular) {
		this.numero = numero;
		this.saldo = 0F;
		this.interesAnual = interesAnual;
		this.titular = titular;
	}

	public Cuenta(Long numero) {
		this(numero, 0.1f, "");
	}

	public void ingreso(Float cantidad) {
		saldo += cantidad;
	}

	public void reintegro(Float cantidad) {
		saldo -= cantidad;
	}

	public void ingresoInteresMes() {
		ingreso(interesAnual * saldo / 1200);
	}

	public boolean enRojos() {
		return saldo < 0;
	}

	public Float leerSaldo() {
		return saldo;
	}

	public void salvar() {
		String imprime = "Cuenta [numero=" + numero + ", saldo=" + saldo + ", interesAnual=" + interesAnual
				+ ", titular=" + titular + "]";
		System.out.println(imprime);
	}

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		long nc;
		float mi;
		Cuenta c;
		try {
			System.out.println("Introduzca n�m. de la cuenta: ");
			nc = Long.parseLong(br.readLine());
			System.out.println("Introduzca importe a retirar: ");
			mi = Float.parseFloat(br.readLine());
		} catch (Exception e) {
			System.out.println("Error al leer datos");
			return;
		}
		try {
			c = new Cuenta(nc);
		} catch (Exception e) {
			System.out.println("Imposible recuperar cuenta");
			return;
		}
		if (c.leerSaldo() < mi)
			System.out.println("Saldo insuficiente");
		else
			c.reintegro(mi);
		c.salvar();
	}
}
