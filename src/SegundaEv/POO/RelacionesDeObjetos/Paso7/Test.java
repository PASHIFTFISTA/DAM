package SegundaEv.POO.RelacionesDeObjetos.Paso7;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date miFecha = new Date ();
		Cliente pedro = new Cliente ("Pedro", "Camacho", "c/Los Ciclos, s/n", "DAM", miFecha);
		Cuenta miCuenta1 = new Cuenta (18400200L, 0.1F,pedro);
		Cuenta miCuenta2 = new Cuenta (18400201L, 0.1F,pedro);
		miCuenta1.ingreso(2000F);
		miCuenta2.ingreso (1000F);
		miCuenta1.transferirDesde(miCuenta2, 500F);
		
		Banco miBanco = new Banco ();
		miBanco.addCuenta(miCuenta1);
		miBanco.addCuenta(miCuenta2);
		miBanco.mostrarCuentas();
	}
}
