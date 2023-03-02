package SegundaEv.POO.RelacionesDeObjetos.Paso4;

public class Cuenta {
	private Long numero;
	private Float saldo;
	private Float interesAnual;
	private Cliente titular;

	public Cuenta(Long numero, Float interesAnual, Cliente titular) {
		this.numero = numero;
		this.saldo = 0F;
		this.interesAnual = interesAnual;
		this.titular = titular;
	}

	public Cuenta(Long numero) {
		this(numero, 0.1f, null);
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
	public Cliente leerTitular (){
		return titular;
	}

	public void salvar() {
		String imprime = "Cuenta [numero=" + numero + ", saldo=" + saldo + ", interesAnual=" + interesAnual
				+ ", titular=" + titular.nombreCompleto() + ", domicilio=" + titular.direccionCompleta() + "]";
		System.out.println(imprime);
	}
}