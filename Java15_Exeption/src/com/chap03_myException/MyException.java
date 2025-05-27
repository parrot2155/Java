package com.chap03_myException;

//예외클래스
public class MyException extends Exception{ //exception을 상속
	
	public MyException() {
		System.out.println("내가 만든 예외 클래스!!~!");
	}
	
	public MyException(String msg) {
		super(msg);
	}
	
	
	
}
