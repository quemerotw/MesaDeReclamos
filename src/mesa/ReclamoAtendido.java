package mesa;

public class ReclamoAtendido {
		
	private Reclamo reclamo;
	private Operador operador;
	
	public ReclamoAtendido(Reclamo poll, Operador operador) {
		this.reclamo = poll;
		this.operador = operador;
	}

	public Reclamo getReclamo() {
		return reclamo;
	}

	public Operador getOperador() {
		return operador;
	}
}
