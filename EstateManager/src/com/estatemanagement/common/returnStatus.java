package com.estatemanagement.common;

public class returnStatus{
	private static final long serialVersionUID = 6113656632614318014L;
	public int errCode;
	public String errMsg;
	public returnStatus(int errCode, String errMsg){
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
}
