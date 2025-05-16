package com.test01;

public class Operator01 {
	public static void main(String[] args) {
		// !
		//!true => false  ,  !false => true
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		//변수 no의 값이 짝수인가 홀수인가?
		// % 2 == 0 =>짝수
		int no = 33;
		System.out.println("no가 짝수? " + (no%2==0) ); //짝수일때 0, 홀수일때 1
		System.out.println("no가 짝수? " + !(no%2==0) );
		System.out.println("no가 짝수? " + (no%2!=0) );
		System.out.println("no가 짝수? " + (no%2==1) );
		

	}

	
	
	
	
}






