package com.srm.enums;

import com.srm.dto.risco.RiscoA;
import com.srm.dto.risco.RiscoB;
import com.srm.dto.risco.RiscoC;
import com.srm.dto.risco.RiscoStrategy;

public enum ERisco {
	
	RiscoA {
		@Override
		public RiscoStrategy obterRisco() {
			return new RiscoA();
		}
	},
	
	RiscoB {
		@Override
		public RiscoStrategy obterRisco() {
			return new RiscoB();
		}
		
	},
	
	RiscoC {
		@Override
		public RiscoStrategy obterRisco() {
			return new RiscoC();
		}
		
	};
	
	public abstract RiscoStrategy obterRisco();

}
