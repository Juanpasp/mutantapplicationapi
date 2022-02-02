package com.mutant.project.mutantapplicationapi.delivery.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


public class DnaRest implements Serializable {
	
	private static final long serialVersionUID = 7809559376441998463L;
	
	@NotNull
	private String[] dna;
	
	public DnaRest() {}

	public DnaRest(@NotNull String[] dna) {
		super();
		this.dna = dna;
	}
	
	public String[] getDna() {
		return dna;
	}

	public void setDna(String[] dna) {
		this.dna = dna;
	}
	

}
