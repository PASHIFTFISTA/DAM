package SegundaEv.POO.RelacionesDeObjetos.Paso3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String nombre="", apellidos="";
		try {
			System.out.print("Introduzca su nombre: ");
			nombre = br.readLine();
			System.out.print("Introduzca sus apellidos: ");
			apellidos = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Date miFecha = new Date ();
		Cliente pedro = new Cliente (nombre, apellidos, "c/Los Ciclos, s/n", "DAM", miFecha);
		Cuenta miCuenta = new Cuenta (18400200L, 0.1F,pedro);
		miCuenta.ingreso(2000F);
		miCuenta.reintegro(500F);
		miCuenta.ingresoInteresMes();
		miCuenta.salvar();	
	}
}
