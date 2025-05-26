package com.test.singleton;

public class Singleton {
	//클래스의 객체를 하나만 생성해서 사용하는 패턴
	private static Singleton one;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		//해당 메소드가 호출이 될 때 singleton객체를 생성해서
		//one에 저장
		//단, 첫 호출시에만.
		if(one==null) {
			one = new Singleton();
		}
		return one;
	}
	
	public void prn() {
		System.out.println("Singleton클래스의 일반 메소드");
		System.out.println(this);
	}
	
	//singleton
	//메모리 절약, 로딩시간의 이점.
	//단점은 결합력(클래스 서로서로의 영향)이 크다.문제가 하나 발생하면 여러군데 문제가 발생할 가능성이 높다.
}
