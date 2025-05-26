package com.test.singleton;

public class Run {

	public static void main(String[] args) {
		//생성 불가, 기본생성자 접근제한자가 private
		//Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
	
		s1.prn();
		s2.prn();
	
	
	
	
	}
	
	
}
