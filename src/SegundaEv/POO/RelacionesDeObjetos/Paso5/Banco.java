package SegundaEv.POO.RelacionesDeObjetos.Paso5;

import java.util.ArrayList;

public class Banco {
	private ArrayList <Cuenta> todasCuentas;
	
	public Banco (){
		todasCuentas = new ArrayList <Cuenta> ();
	}
	public void addCuenta (Cuenta c) {
		todasCuentas.add(c);
	}
	public void mostrarCuentas (){
		for (Cuenta cuenta : todasCuentas) {
			cuenta.salvar();
		}
	}
	
	
}
