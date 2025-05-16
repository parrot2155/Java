package com.test01;

public class Variable01 {

	public static void main(String[] args) {
		//변수
		//타입 변수명 = 값; 세미콜론 절대 빼먹으면 안됨.
		//타입 : 생성할 변수에 어떤 종류의 값을 저장할지 타입 지정.
		//값 : 메모리에 저장할(변수에 넣을)데이터
		
		//변수의 선언
		//숫자형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//변수를 선언만 하면 아무 값도 저장 되지 않은 상태로
		//메모리상에 공간이 할당된다.
		
		//실수형
		float fnum;
		double dnum;
		
		//논리형
		boolean isTrue;
		
		//문자형(character)
		char ch;
		
		//문자열(참조형)
		String str;
		
		
		//---------------------------------------
		//초기화
		//변수에 값 대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;   //기본적으로 double타입인줄 알아서 뒤에 f뭍여야 float으로 인식함/
		dnum = 8.0;
		
		isTrue = false; // true or false 값만 저장
		
		ch = 'A';   //문자. 한글자만 입력 가능.
 		str = "AAA";  //문자열
 		
 		//콘솔에 출력
 		System.out.println("inum: " + inum);
 		System.out.println("dnum: " + dnum);
 		System.out.println("isTrue: " + isTrue);
 		System.out.println("ch: " + ch);
		
 		//---------------------------
 		System.out.println("initVar() 실행");
 		
 		
 		
 		
 		
 		//일반 메소드 실행하는 방법
 		
 		//클래스명 변수명 = new 클래스명();    //실행준비단계
 		//변수명.메소드명();                //실행

 		Variable01 test = new Variable01();
 		test.initVar();
		
 		
 		
 		
	}
	
	//메소드=>함수,기능
	public void initVar() {
		//변수 선언과 동시에 초기화
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8;
		float fnum = 4.0f;
		double dnum = 8.0;
		char ch = 'A';
		String str = "안녕하세요";		
		
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(str);
	}

}
















