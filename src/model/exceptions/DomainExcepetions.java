package model.exceptions;

public class DomainExcepetions extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DomainExcepetions(String msg) {
		super(msg);
	}
}
