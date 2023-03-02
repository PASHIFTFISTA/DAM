package SegundaEv.POO.RelacionesDeObjetos.Paso4;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date miFecha = new Date ();
		Cliente pedro = new Cliente ("Pedro", "Camacho", "c/Los Ciclos, s/n", "DAM", miFecha);
		Cuenta miCuenta1 = new Cuenta (18400200L, 0.1F,pedro);
		Cuenta miCuenta2 = new Cuenta (18400201L, 0.1F,pedro);
		miCuenta1.ingreso(2000F);
		miCuenta1.reintegro(1000F);
		miCuenta1.ingreso(1000F);
		miCuenta2.reintegro(500F);
		miCuenta1.ingresoInteresMes();
		miCuenta2.ingresoInteresMes();
		
		Banco miBanco = new Banco ();
		miBanco.addCuenta(miCuenta1);
		miBanco.addCuenta(miCuenta2);
		miBanco.mostrarCuentas();
	}
}
