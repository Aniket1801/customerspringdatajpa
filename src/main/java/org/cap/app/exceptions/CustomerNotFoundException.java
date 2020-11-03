package org.cap.app.exceptions;

public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException(){}
	
	public CustomerNotFoundException(String msg)
	{
		super(msg);
	}

}
