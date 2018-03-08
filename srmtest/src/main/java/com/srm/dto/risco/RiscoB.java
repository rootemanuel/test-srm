package com.srm.dto.risco;

public class RiscoB implements RiscoStrategy {
	
	final private static Double JUROS = 0.1;
	
	@Override
	public Double calcularJuros(Double limite) {
		return limite * JUROS;
	}
}
