package mesa;

import java.util.ArrayList;

public class Mesa {
	
	private static Mesa mesa;
	private ColaReclamos colaReclamos;
	private ArrayList<Operador> listaOperadores;
	private ArrayList<ReclamoAtendido> listaReclamosAtendidos;
	
	private Mesa() {
		colaReclamos = new ColaReclamos();
		listaOperadores = new ArrayList<Operador>();
		listaReclamosAtendidos = new ArrayList<ReclamoAtendido>();
	}
	
	public static Mesa getMesa() {
		if (mesa == null) {
			return mesa = new Mesa();
		}
		else
			return mesa;
	}
	
	public void addReclamoAtendido(ReclamoAtendido reclamoAtendido) {
		this.listaReclamosAtendidos.add(reclamoAtendido);
	}
	
	public void addOperador(Operador operador) {
		this.listaOperadores.add(operador);
	}
}
