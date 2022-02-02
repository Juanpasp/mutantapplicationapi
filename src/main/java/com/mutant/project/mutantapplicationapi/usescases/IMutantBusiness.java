package com.mutant.project.mutantapplicationapi.usescases;

import java.util.List;

import com.mutant.project.mutantapplicationapi.exceptions.MutantException;

public interface IMutantBusiness {
	
	boolean isMutant(List<String> adnList) throws MutantException;

}
