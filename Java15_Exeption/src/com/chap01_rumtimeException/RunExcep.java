package com.chap01_rumtimeException;

import java.util.Scanner;

public class RunExcep {
 /*
  *예외(Exception) : 코드 수정으로 해결 가능한 에러
  *     -해당 하는 상황이 발생 되면 예외 발생, throw 명령어를 통해 예외 발생
  *     
  * RuntimeException
  * 	ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 상황
  * 	ClassCastException : 잘못된 형변환을 진행하는 상황
  * 	NullpointerException : 참조 변수가 null을 가진 상홍에서 메소드 호출하는 상황
  * 	주로 if문을 통해 처리
  * 
  */
	Scanner sc = new Scanner(System.in);
	
	
	public void arithEx() { //0으로 나누려했을 때
		
		//if로 처리.
		/*System.out.println("정수 입력 : ");
		int no = sc.nextInt();
		
		
		
		
		if(no!=0) { //if로 예외 처리.
			int ran = (int)(Math.random()*10)+1;
		
			int res = ran/no;
			System.out.println(ran+" / "+no+" = "+res);
			
		}else {
			System.out.println("0입력. 잘못 입력했습니다.");
		}*/
		
		
		//try-catch
		try {
			//예외가 발생할 코드를 작성
			System.out.println("정수 입력 : ");
			int no = sc.nextInt();
			
			int ran = (int)(Math.random()*10)+1;
		
			int res = ran/no;
			System.out.println(ran+" / "+no+" = "+res);
			
		}catch(ArithmeticException e) {//e <- 에러를 매개변수로 가지고 온다고 생각.
			//예외 발생 시 실행할 코드를 작성
			//e.printStackTrace();
			System.out.println("0을 입력했습니다. 잘못된 입력.");
			System.out.println(e.getMessage());
			
		}
		System.out.println("프로그램 종료");//try catch 없으면 안돌아감.
		//이런 런타임에러는 미리 코드짤때 예방하자.
	}
	
	public void classCastNarrayIndexEx() {
		//ClassCastException
		/*
		Object obj = 'a'; //'a'=>Character=>Object
		System.out.println(obj);
		if(obj instanceof String) {
			String str = (String)obj; //classCastException발생.잘못 형변환됨.
		System.out.println(obj);
		}else {
			System.out.println("String이 아닙니다.");
		}*/
		
		
		//try catch
		try {
//			Object obj = 'ㅁ'; //'a'=>Character=>Object
//			String str = (String)obj; //classCastException발생.잘못 형변환됨.
//			System.out.println(str);
//			
//			//ArrayIndexOutOfBoundsException
//			//배열에 인덱스 번호를 벗어나는 인덱스에 접근하려고 할 때
//			int[] arr = new int[2];
//			arr[0] = 1;
//			arr[2] = 2; //인덱스 잘 적어야지 별 수 있나... 	
			
			
			//NullPointerException
			String str = test();
			int length = str.length();
			
		}catch(ClassCastException e) {
			System.out.println("예외 발생");
			
		}catch(ArrayIndexOutOfBoundsException e){ //해당하는 예외처리 부분만 동작하게 됨.
			System.out.println("인덱스 잘못 작성...ㅋ");
			
		}catch(NullPointerException e) {
			System.out.println("null...없어?");
			
		}/*catch(Exception e){ //상위 예외클래스를 넣으면 지금 예외들 다 잡을 수 있다. <=e 다형성 적용되서.
			
		}*/finally {
			//예외가 발생 하건 발생하지 않건 무조건 마지막에 실행.
			System.out.println("실행 되나...?");
		}
		
	}
	
	public String test() {
		
		try {
			System.out.println("dldldldl");
		}catch(ClassCastException | ArrayIndexOutOfBoundsException |
				NullPointerException | NegativeArraySizeException e) {
			System.out.println("런타임 익셉션");
		}
		
		return null;
	}
	
	
}
