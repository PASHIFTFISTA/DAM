package SegundaEv.POO_Herencia.PedroGIT.Paso1;

public class AppGestorTareas {
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 2);
		while (!tp.necesitaEjecucion()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
			System.out.println("Esperando ejecución de tarea periódica...");
		tp.ejecutarTarea();
		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		System.out.println("Aviso: " + tpa.leerMsg());
	}
}
