package com.srm.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public BusinessException(String msg) {
		this.msg = msg;				
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
