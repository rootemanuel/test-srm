package com.srm.controllers;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srm.dto.PropostaDTO;
import com.srm.dto.RetornoDTO;
import com.srm.entity.PropostaEntity;
import com.srm.enums.ERetorno;
import com.srm.exception.BusinessException;
import com.srm.service.PropostaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PropostaController {
	
	@Autowired
	PropostaService propostaService;
	
	@PostMapping(value = "/proposta")
	@Transactional
    public ResponseEntity<?> teste(@Valid @RequestBody PropostaDTO proposta, Errors errors) {
		PropostaEntity rtn = new PropostaEntity();
		
		try {
			
			if (errors.hasErrors()) {
	            String erros = errors.getAllErrors()
					.stream()
					.map(x -> x.getDefaultMessage())
					.collect(Collectors.joining(","));
	            
	            throw new BusinessException(erros);
	        }
			
			rtn = propostaService.insereProposta(proposta);
			
		} catch (BusinessException be) {
			return ResponseEntity.badRequest().body(new RetornoDTO(ERetorno.EX_NEGOC,be.getMsg()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new RetornoDTO(ERetorno.EX,e.getMessage()));
		}
		
        return ResponseEntity.status(HttpStatus.CREATED).body(rtn);
    }
}
