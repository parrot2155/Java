package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//메소드 호출
		MethodTest01.publicMethod(); //public다른 클래스여도 잘 접근이 가능하다.
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); //private는 다른데서 가져갈 수 없다.해당 클래스 내에서만 가져갈 수 있음.
		
		//nonestaticmethod 변수생성 없이 실행
		//준비과정 없이 실행을 한번에
		new MethodTest01().NonstaticMethod();
		
	}

	
	
	
	
	
}
