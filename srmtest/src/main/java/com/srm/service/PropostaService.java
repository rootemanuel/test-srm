package com.srm.service;

import com.srm.dto.PropostaDTO;
import com.srm.entity.PropostaEntity;

public interface PropostaService {
	PropostaEntity insereProposta(PropostaDTO proposta);
}
