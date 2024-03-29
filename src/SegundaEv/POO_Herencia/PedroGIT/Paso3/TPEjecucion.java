package SegundaEv.POO_Herencia.PedroGIT.Paso3;

import java.io.IOException;

public class TPEjecucion extends TareaPeriodica {
	private String cmd;

	public TPEjecucion(String aCmd, int aPeriodoSegs) {
		super(aPeriodoSegs);
		cmd = aCmd;
	}
	public String leerCmd() {
		return cmd;
	}
	// Método redefinido
	public void ejecutarTarea() {
		try {
			Runtime.getRuntime().exec(cmd, null, null);
		}
		catch(IOException e) {
			System.out.println("Imposible ejecutar comando: "+ cmd);
		}
	}

}
