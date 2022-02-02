package com.mutant.project.mutantapplicationapi.utils;

public class Constants {
	
	private Constants() {
	    throw new IllegalStateException("Constants class");
	}

	public static final String MESSAGE_VALIDATION_CHARACTERS = "Solamente se permite los caracteres A, T, C, G. Por favor revise y vuelva ingresar la información";
	public static final String MESSAGE_RESULT_MUTANT = "El resultado del adn verificado es de mutante";
	public static final String MESSAGE_RESULT_HUMAN = "El resultado del adn verificado es de humano";
	public static final Integer COUNT_OCURRENCES_VALID = 1; 
	public static final Integer COUNT_CHARACTERS_CONSECUTIVES_VALID = 4;
	public static final Integer VALUE_INITIAL_COINCIDENT = 2;	
	public static final String MESSAGE_ERROR_EXECUTION = "Se presento un error durante la ejecución del servicio";
	public static final String MESSAGE_RESPONSE_OK = "200 - OK";
	public static final String MESSAGE_RESPONSE_FORBIDDEN = "403 - FORBIDDEN";
	public static final String CODE_ERROR_HUMAN = "ER001";
	public static final String MESSAGE_ERROR_HUMAN = "El Adn analizado es de humano";
	public static final String CODE_ERROR_CHARACTERS_INVALID = "ER002";
	public static final String MESSAGE_ERROR_CHARACTERS_INVALID = "Muestra de Adn con caracteres invalidos";
	public static final String CODE_ERROR_RUNTIME = "ER003";
	public static final String MESSAGE_ERROR_RUNTIME = "Se presento un error durante la ejecución del servicio";
	public static final String CODE_ERROR_BUSINESS = "ER004";
	public static final String MESSAGE_ERROR_BUSINESS = "No hay elementos para procesar el analisis del ADN";
}
