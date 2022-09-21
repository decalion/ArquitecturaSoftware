package com.icaballero.hexagonal.domain;

public class DomainException extends RuntimeException  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7029478961199827803L;

	public DomainException(final String message) {
	        super(message);
	    }

}
