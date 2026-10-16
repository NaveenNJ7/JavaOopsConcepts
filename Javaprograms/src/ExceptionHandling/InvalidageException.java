package ExceptionHandling;

public class InvalidageException extends RuntimeException {

	private String message;
	
	InvalidageException(String message)
	{
		this.message = message;
	}
	
	public String getMessage() {
		
		return message;
	}
	
}
