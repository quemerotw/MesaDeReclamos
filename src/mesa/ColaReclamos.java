package mesa;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColaReclamos {
	private Queue<Reclamo> colaReclamos;
	private ArrayList<Escuchador> suscriptores = new ArrayList<Escuchador>();
	
	
	public ColaReclamos () {
		ComparadorReclamo comparador = new ComparadorReclamo();
		colaReclamos = new PriorityQueue<Reclamo>(comparador);
	}
	
	public void agregarReclamo(Reclamo paciente) {
		this.colaReclamos.add(paciente);
	}
	
	public void atenderReclamo(Operador operario) throws SinReclamosException {
		if (!this.colaReclamos.isEmpty()) {
			Reclamo reclamo = this.colaReclamos.poll();
			ReclamoAtendido reclamoAtendido = new ReclamoAtendido(reclamo,operario);
			for(Escuchador e : suscriptores) {
				e.notificarResuelto(reclamoAtendido);
			}
			Mesa mesa = Mesa.getMesa();
			mesa.addReclamoAtendido(reclamoAtendido);
		}
		else {
			throw new SinReclamosException("No se registran reclamos pendientes");
		}
			
	}
}

