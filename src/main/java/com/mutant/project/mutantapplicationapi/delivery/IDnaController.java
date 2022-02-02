package com.mutant.project.mutantapplicationapi.delivery;

import org.springframework.http.ResponseEntity;

import com.mutant.project.mutantapplicationapi.delivery.request.DnaRest;
import com.mutant.project.mutantapplicationapi.exceptions.MutantException;

public interface IDnaController {
	
	<T> ResponseEntity<T> validateDna(DnaRest dnaRest) throws MutantException;

}
