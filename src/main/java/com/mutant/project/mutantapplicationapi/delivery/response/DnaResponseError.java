package com.mutant.project.mutantapplicationapi.delivery.response;

import java.io.Serializable;

public class DnaResponseError implements Serializable {

	private static final long serialVersionUID = 7302319210373510173L;
	
	private String status;
	private String code;
	private String message;
	
	public DnaResponseError() {}
	
	public DnaResponseError(String status, String code, String message) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
