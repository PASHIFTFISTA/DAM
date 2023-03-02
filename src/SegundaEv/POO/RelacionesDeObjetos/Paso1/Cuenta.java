package SegundaEv.POO.RelacionesDeObjetos.Paso1;

public class Cuenta {
	private Long numero;
	private Float saldo;
	private Float interesAnual;
	private String titular;

	public Cuenta(Long numero, Float interesAnual, String titular) {
		this.numero = numero;
		this.saldo = 0f;
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

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta(18400200L, 0.1f, "Pedro Camacho");
		c1.ingreso(500F);
		System.out.println("Saldo actual de la cuenta 18400200: " + c1.leerSaldo());
		Cuenta c2 = new Cuenta(18400201L);
		c2.reintegro(1000F);
		System.out.println("Saldo actual de la cuenta 18400201: " + c2.leerSaldo());
		if (c2.enRojos())
			System.out.println("Atenci�n: la cuenta est� en n�meros rojos");
		// Con esta instrucci�n el objeto asociado a la Cuenta 18400200 
		// queda desconectado
		c1 = new Cuenta(18400202L);
		c1.ingreso(500F);
		System.out.println("Saldo actual de la cuenta 18400202: " + c1.leerSaldo());

	}
}
