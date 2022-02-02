package com.mutant.project.mutantapplicationapi.exceptions;

public abstract class MutantException extends Exception {

	private static final long serialVersionUID = -7482635401716007171L;
	
	private final String code;
	
	public MutantException(final String codeErrorBusiness, final String message) {
		super(message);
		this.code = codeErrorBusiness;
	}
	
	public String getCode() {
		return code;
	}
	
		
	

}
