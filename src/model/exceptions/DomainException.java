package model.exceptions;

// tamb�m pode ser uma Exception, sendo necess�rio tratar as exce��es no c�digo
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}

}
