package com.mutant.project.mutantapplicationapi.delivery.response;

import java.io.Serializable;

public class DnaResponseSuccess implements Serializable {
	
	private static final long serialVersionUID = 7302319210373510173L;
	
	private String status;
	private Boolean isMutant;
	
	public DnaResponseSuccess( ) {}
	
	public DnaResponseSuccess(String status, Boolean isMutant) {
		super();
		this.status = status;
		this.isMutant = isMutant;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsMutant() {
		return isMutant;
	}

	public void setIsMutant(Boolean isMutant) {
		this.isMutant = isMutant;
	}

	
	

}
