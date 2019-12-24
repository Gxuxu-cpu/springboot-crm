package com.crm.support;

import java.io.Serializable;

public class CrmResult implements Serializable {

	private String errCode;
	private Object errMsg;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Object getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(Object errMsg) {
		this.errMsg = errMsg;
	}

	public CrmResult(String errCode, Object errMsg) {
		super();
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public CrmResult() {
		super();
	}

}
