package com.test01;

public class Variable03 { //파일 이름과 클래스 이름은 동일해야한다.
					
	public static void main(String[] args) { //main이 아니면 시작점이 지정되지않아 실행되지 않는다.
		//상수
		int age;
		final int AGE; //변ㄴ하지 않는 값(상수)을 대문자로 한다.
		
		age = 20;
		AGE = 50;
		
		System.out.println(age);
		System.out.println(AGE);
		
		//값 변경
		age = 30;
		//AGE = 60; //상수는 절대 변경 불가,에러발생
		
		final double PI = 3.141592;
		
		
		//오버플로우
		//byte bnum = 128;
		//에러, 범위를 벗어난 값
		
		//계산 과정에서 범위를 벗어나면 오버플로우 처리된다.
		byte bnum = 127;
		
		bnum++;
		
		System.out.println(bnum);  //데이터 범위를 벗어나게 되면 최솟값으로 바뀐다...
		//데이터 처리 과정에서 뜬금없는 마이너스같은 값이 나온다면 의심해보아라.
		
		

	}

}
