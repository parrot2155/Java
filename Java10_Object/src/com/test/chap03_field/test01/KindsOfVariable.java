package com.test.chap03_field.test01;

//변수 선언 위치에 구분
public class KindsOfVariable {//클래스 영역의 시작
	//클래스 영역에 선언하는 변수
	//필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	private int globalNum;
	
	public void testMethod(int num) {//메소드 영역의 시작
		//메소드 영역에서 선언하는 변수 : 지역변수
		//
		//메소드 괄호 안에 선언하는 변수 : 매개변수
		int localNum;
		
		System.out.println(globalNum); //전역변수는 클래스 전역에서 사용 가능하다.
		//System.out.println(localNum); //지역변수는 사용하기 위해 초기화 필요.
		System.out.println(num); //매개변수는 호출 시 값이 넘어와 저장이 되기 때문에 초기화 필요 x
		
	}//메소드 영역의 끝
	
	public void testMethod2() {
		//System.out.println(localNum);//지역변수는 해당 지경(블럭)에서만 사용 가능.
		System.out.println(globalNum); //전역변수는 다른 메소드에서도 사용 가능.
		
	}
	
	
}//여기까지 클래스 영역
