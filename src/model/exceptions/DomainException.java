package model.exceptions;

// também pode ser uma Exception, sendo necessário tratar as exceções no código
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}

}
