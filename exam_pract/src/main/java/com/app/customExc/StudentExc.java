package com.app.customExc;

public class StudentExc extends RuntimeException {
	private String msg;
	
	public StudentExc(String msg) {
		super(msg);
	}

}
