package com.gatepass.exceptionhandler;

public class DuplicateException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2801887314093142784L;

	public DuplicateException(String message)
	{
		super(message);
	}
}
