package com.srm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srm.dao.PropostaDao;
import com.srm.dto.PropostaDTO;
import com.srm.dto.risco.RiscoStrategy;
import com.srm.entity.PropostaEntity;
import com.srm.enums.ERisco;
import com.srm.service.PropostaService;

@Service
public class PropostaServiceImpl implements PropostaService {
	
	@Autowired
	PropostaDao propostaDao;

	@Override
	@Transactional
	public PropostaEntity insereProposta(PropostaDTO proposta) {
		PropostaEntity propEnt = new PropostaEntity();
		ERisco risco = ERisco.values()[proposta.getRisco() - 1];
		RiscoStrategy riscoStrat = risco.obterRisco();
		
		propEnt.setLimiteCredito(proposta.getLimiteCredito());
		propEnt.setNomeCliente(proposta.getNomeCliente());
		propEnt.setRisco(riscoStrat.calcularJuros(proposta.getLimiteCredito()));
		
		propostaDao.insereProposta(propEnt);
		
		return propEnt;
	}
}
