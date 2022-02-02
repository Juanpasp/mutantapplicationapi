package com.mutant.project.mutantapplicationapi.usescases;

import java.util.Map;

public interface IDetailMutantBusiness {

	Map<Integer, Integer> validateRegisterCoincidentOfLeftOblique(String previousValue, String currentValue, Map<Integer, Integer> currentPositionCoincident);
	Map<Integer, Integer> validateRegisterCoincidentOfRightOblique(String previousValue, String currentValue, Map<Integer, Integer> currentPositionCoincident);
	Map<Integer, Integer> validateRegisterCoincidentOfVertical(String previousValue, String currentValue, Map<Integer, Integer> currentPositionCoincident);
	Boolean validateRegisterCoincidentOfHorizontal(String currentValue);
	
}
