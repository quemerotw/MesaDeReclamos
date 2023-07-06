package mesa;

public class SinReclamosException extends Exception {
	private String msg;
	
	public SinReclamosException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
}
