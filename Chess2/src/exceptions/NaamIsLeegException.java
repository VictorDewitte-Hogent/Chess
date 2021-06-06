package exceptions;

public class NaamIsLeegException extends Exception {

	public NaamIsLeegException() {
		super("Je moet een gepaste naam ingeven");
	}

	public NaamIsLeegException(String message) {
		super(message);
		
	}

	

}
