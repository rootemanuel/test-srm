package com.srm.dto;

import com.srm.enums.ERetorno;

public class RetornoDTO {
	
	Integer cod;
	String msg;
	
	public RetornoDTO(Integer cod, String msg){
		this.cod = cod;
		this.msg = msg;
	}
	
	public RetornoDTO(ERetorno eret, String msg){
		this.cod = eret.getCod();
		this.msg = String.format(eret.getMsg(),msg);
	}
	
	public RetornoDTO(ERetorno eret){
		this.cod = eret.getCod();
		this.msg = eret.getMsg();
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
