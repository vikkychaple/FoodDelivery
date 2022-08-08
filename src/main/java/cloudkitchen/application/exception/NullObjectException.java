package cloudkitchen.application.exception;
public class NullObjectException extends RuntimeException{
	
	private String msg;
	
	
	public NullObjectException() {
		super("NullObjectException occured");
		this.msg = "NullObjectException occured";
	}
	
	public NullObjectException(String msg) {
		super(msg);
		this.msg = msg;
	}

}
