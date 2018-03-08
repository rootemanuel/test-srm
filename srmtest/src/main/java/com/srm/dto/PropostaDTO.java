package com.srm.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class PropostaDTO {
	
	@NotNull(message = "Campo nome mandatório")
	@NotEmpty(message = "Campo nome não pode ser vazio")
	private String nomeCliente;
	
	@NotNull(message = "Campo limite mandatório")
	private Double limiteCredito;
	
	@NotNull(message = "Campo risco mandatório")
	@Min(value = 1, message = "Valor mínimo para risco é 1")
    @Max(value = 3, message = "Valor máximo para risco é 3")
	private Integer risco;
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public Integer getRisco() {
		return risco;
	}

	public void setRisco(Integer risco) {
		this.risco = risco;
	}
}
