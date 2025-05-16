package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 /*extends MethodTest01*/ {  //extends : 상속해주기.

	public static void main(String[] args) {
		MethodTest01.publicMethod(); //어디서나 가능
		//MethodTest01.protectedMethod(); //같은 패키지 안에서만 가능 but 상속받으면 가능
		//MethodTest01.defaultMethod();  //같은 패키지 안에서만 가능
		//MethodTest01.privateMethod();// 약시 안됨.
	}

}
