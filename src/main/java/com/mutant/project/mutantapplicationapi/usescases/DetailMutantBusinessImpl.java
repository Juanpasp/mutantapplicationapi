package com.mutant.project.mutantapplicationapi.usescases;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.mutant.project.mutantapplicationapi.utils.Constants;


public class DetailMutantBusinessImpl implements IDetailMutantBusiness{
	
		
	/***
	 * Metodo donde se valida entre la fila anterior y actual y se va acumulando  los caracteres coincidentes
	 * de manera oblicua izquierda
	 */
	@Override
	public Map<Integer, Integer> validateRegisterCoincidentOfLeftOblique(String previousValue, String currentValue,
			Map<Integer, Integer> currentPositionCoincident) {
		if (previousValue.equals("")) {
			return currentPositionCoincident;
		} else {
			Map<Integer, Integer> valueAdn = new HashMap<>();
			for (int i = 0; i < currentValue.length() -1; i++) {
				if (currentValue.charAt(i) == previousValue.charAt(i+1)) {
					if (currentPositionCoincident.containsKey(i+1)) {
						valueAdn.put(i, currentPositionCoincident.get(i+1)+1);
					} else {
						valueAdn.put(i, Constants.VALUE_INITIAL_COINCIDENT);
					}
				}
			}
			return valueAdn;
			
		}
		
	}

	/***
	 * Metodo donde se valida entre la fila anterior y actual y se va acumulando los caracteres coincidentes
	 * de manera oblicua derecha
	 */
	@Override
	public Map<Integer, Integer> validateRegisterCoincidentOfRightOblique(String previousValue, String currentValue,
			Map<Integer, Integer> currentPositionCoincident) {
		if (previousValue.equals("")) {
			return currentPositionCoincident;
		} else {
			Map<Integer, Integer> valueAdn = new HashMap<>();
			for (int i = 1; i < currentValue.length(); i++) {
				if (currentValue.charAt(i) == previousValue.charAt(i-1)) {
					if (currentPositionCoincident.containsKey(i-1)) {
						valueAdn.put(i, currentPositionCoincident.get(i-1)+1);
					} else {
						valueAdn.put(i, Constants.VALUE_INITIAL_COINCIDENT);
					}
				}
			}
			return valueAdn;
			
		}
	}

	/***
	 * Metodo donde se valida entre la fila anterior y actual y se va acumulando los caracteres coincidentes
	 * de manera vertical
	 */
	@Override
	public Map<Integer, Integer> validateRegisterCoincidentOfVertical(String previousValue, String currentValue,
			Map<Integer, Integer> currentPositionCoincident) {
		if (previousValue.equals("")) {
			return currentPositionCoincident;
		} else {
			Map<Integer, Integer> valueAdn = new HashMap<>();
			for (int i = 0; i < currentValue.length(); i++) {
				if (currentValue.charAt(i) == previousValue.charAt(i)) {
					if (currentPositionCoincident.containsKey(i)) {
						valueAdn.put(i, currentPositionCoincident.get(i)+1);
					} else {
						valueAdn.put(i, Constants.VALUE_INITIAL_COINCIDENT);
					}
				}
			}
			return valueAdn;
			
		}
	}

	/***
	 * Metodo donde se valida si existe caracteres coincidentes en el string ingresado
	 */
	@Override
	public Boolean validateRegisterCoincidentOfHorizontal(String currentValue) {
		Pattern patA = Pattern.compile("[A]{4}");
		Pattern patT = Pattern.compile("[T]{4}");
		Pattern patC = Pattern.compile("[C]{4}");
		Pattern patG = Pattern.compile("[G]{4}");
		Matcher matA = patA.matcher(currentValue);
		Matcher matT = patT.matcher(currentValue);
		Matcher matC = patC.matcher(currentValue);
		Matcher matG = patG.matcher(currentValue);
		if (matA.find() || matT.find() || matC.find() || matG.find()) {
			return true;
		} else {
			return false;
		}
	}

}
