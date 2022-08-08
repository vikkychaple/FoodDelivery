package cloudkitchen.application.exception;

public class UserAlreadyExistException extends RuntimeException {
	public UserAlreadyExistException() {
		super("User Already Exist!");
	}
	public UserAlreadyExistException(String msg) {
		super(msg);
	}
	

}
