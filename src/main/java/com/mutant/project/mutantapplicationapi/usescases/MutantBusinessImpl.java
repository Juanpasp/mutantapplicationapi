package com.mutant.project.mutantapplicationapi.usescases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mutant.project.mutantapplicationapi.exceptions.MutantException;
import com.mutant.project.mutantapplicationapi.utils.Constants;

public class MutantBusinessImpl implements IMutantBusiness {
	
		
	private DetailMutantBusinessImpl detailCodeMutant;
	
	public MutantBusinessImpl(DetailMutantBusinessImpl detailCodeMutant) {
		this.detailCodeMutant = detailCodeMutant;
	}
	
	/***
	 * Metodo publica donde se hace llamado al metodo privado en el que se realiza el procesamiento
	 * inicial de la estructura de datos del DNA
	 * @throws MutantException 
	 */
	@SuppressWarnings("serial")
	@Override
	public boolean isMutant(List<String> adnList) throws MutantException {

		if (adnList.isEmpty()) {
			throw new MutantException(Constants.CODE_ERROR_BUSINESS, Constants.MESSAGE_ERROR_BUSINESS) {
			};
		}
		return validateStructureDataAdnComplete(adnList);
			
	}

	/***
	 * Metodo en que se realiza los llamados a cada uno de los metodos donde se valida si se encuentra coincidencia
	 * de caracteres de manera oblicua, horizontal o vertical y va acumulando la cantidad de cadenas coincidentes
	 * en el DNA
	 * @param adnList
	 * @return
	 */
	private boolean validateStructureDataAdnComplete(List<String> adnList) {
		
		Long countOcurrencesValid = adnList.stream().filter(itemToEvaluate -> 
		this.detailCodeMutant.validateRegisterCoincidentOfHorizontal(itemToEvaluate))
				.count();
		if (countOcurrencesValid > Constants.COUNT_OCURRENCES_VALID) {
			return true;
		}
		
		String lastValue = "";
		Map<Integer, Integer> listLastPositionEvaluateLeftOblique = new HashMap<>();
		Map<Integer, Integer> listLastPositionEvaluateRightOblique = new HashMap<>();
		Map<Integer, Integer> listLastPositionEvaluateVertical = new HashMap<>();
			
		for (String itemToEvaluate : adnList) {
			listLastPositionEvaluateLeftOblique = 
					this.detailCodeMutant.validateRegisterCoincidentOfLeftOblique(lastValue, itemToEvaluate, 
							listLastPositionEvaluateLeftOblique);
			if (listLastPositionEvaluateLeftOblique.values().stream().anyMatch(
					item -> item.equals(Constants.COUNT_CHARACTERS_CONSECUTIVES_VALID))) {
				countOcurrencesValid += 1;
			}
			listLastPositionEvaluateRightOblique = 
					this.detailCodeMutant.validateRegisterCoincidentOfRightOblique(lastValue, itemToEvaluate, 
							listLastPositionEvaluateRightOblique);
			if (listLastPositionEvaluateRightOblique.values().stream().anyMatch(
					item -> item.equals(Constants.COUNT_CHARACTERS_CONSECUTIVES_VALID))) {
				countOcurrencesValid += 1;
			}
			listLastPositionEvaluateVertical = 
					this.detailCodeMutant.validateRegisterCoincidentOfVertical(lastValue, itemToEvaluate, 
							listLastPositionEvaluateVertical);
			if (listLastPositionEvaluateVertical.values().stream().anyMatch(
					item -> item.equals(Constants.COUNT_CHARACTERS_CONSECUTIVES_VALID))) {
				countOcurrencesValid += 1;
			}
			if (countOcurrencesValid > Constants.COUNT_OCURRENCES_VALID) {
				return true;
			}
			lastValue = itemToEvaluate;
					
		}
		return false;
			
	}

}
