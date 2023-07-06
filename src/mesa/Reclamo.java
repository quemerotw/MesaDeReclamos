package mesa;

public abstract class Reclamo {
	
	private static int numeroContinuo = 0;
	private int numeroUnico;
	private Prioridad nivelUrgencia;
	
	
	public Reclamo() {
		this(Prioridad.baja);
	}
	
	public Reclamo(Prioridad prioridad) {
		this.nivelUrgencia = prioridad;
		this.numeroUnico = numeroContinuo;
		numeroContinuo++;
	}
	
	public int getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(int numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public Prioridad getNivelUrgencia() {
		return nivelUrgencia;
	}
	public void setNivelUrgencia(Prioridad nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}
	
}
