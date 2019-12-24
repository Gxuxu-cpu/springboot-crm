package com.crm.exceptionHandler;

public class MyException extends Exception {

	   private String msg;
	
		
		public MyException() {
			super();
		}
	
		//有参的构造可以自定义异常信息
		public MyException(String msg) {
			super();
			this.msg = msg;
		}
	
	
		public String getMsg() {
			return msg;
		}
	
		public void setMsg(String msg) {
			this.msg = msg;
		}

}
