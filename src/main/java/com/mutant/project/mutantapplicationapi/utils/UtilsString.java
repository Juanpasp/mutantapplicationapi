package com.mutant.project.mutantapplicationapi.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsString {

	private UtilsString() {
	    throw new IllegalStateException("Utility class");
	}
	
	/***
	 * Metodo en el que se valida el patron de entrada de caracteres validos de un String
	 * @param characterAdn
	 * @return
	 */
	public static boolean containsCharactersValids(String characterAdn) {
		
		Pattern pattern = Pattern.compile("^$|^[ATCG]+$");
		Matcher matcher = pattern.matcher(characterAdn);
		return matcher.matches();
		
	}
}
