
public class SocSecException extends Exception {

	public SocSecException(String msg) {
		super("Invalid social security number" + msg);
		
	}	
	public SocSecException() {
		super("Invalid social security number");
}
}