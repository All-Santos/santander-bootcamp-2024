package me.dio.santander_bootcamp_2024.services.exceptions;


public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não encontrado. Id " + id);
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
