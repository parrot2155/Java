package com.test.chap03_field.test01;

public class KindsOfVaroable2 {

	public static int staticNum;
	
	public final int num = 1; //final은 초기화 과정이 필요함.
	
	//public 접근 제한자에 static,final 키워드 함께 사용하는 필드
	//'상수필드'
	public static final int STATIC_NUM = 1;
	public final static int STATIV_NUM2 = 2;//static과 final자리가 바뀌어도 상관 없다.
	
	public void methodTest() {
//		static int localStaticNum;
		final int localFinalNum;
	}
	public static void methodTest2() {
//		static int loclaStaticNum;
		final int localFinalNum;
		
	}
	
}
