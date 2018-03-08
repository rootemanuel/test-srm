package com.srm.dto.risco;

public class RiscoC implements RiscoStrategy {
	
	final private static Double JUROS = 0.2; 

	@Override
	public Double calcularJuros(Double limite) {
		return limite * JUROS;
	}
}
