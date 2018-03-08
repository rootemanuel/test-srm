package com.srm.enums;

public enum ERetorno {
	
	RET_OK(0,"executado com sucesso"),
	EX_NEGOC(999,"erro negócio - %s"),
	EX(-1,"exception - %s");
	
	private Integer cod;
	private String msg;
	
	ERetorno(Integer cod, String msg){
		this.cod = cod;
		this.msg = msg;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
