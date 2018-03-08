package com.srm.dto.risco;

public class RiscoA implements RiscoStrategy {

	final private static Double SEM_JUROS = 0.0; 
	
	@Override
	public Double calcularJuros(Double limite) {
		return SEM_JUROS;
	}
}
