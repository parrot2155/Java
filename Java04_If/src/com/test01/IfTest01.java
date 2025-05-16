package com.test01;

import java.util.Scanner;

public class IfTest01 {
	Scanner sc = new Scanner(System.in);
	//필드, 멤버변수, 전역변수. 한번만 만들어놔도 메소드에서 다 쓸수 있음.
	//final double PI = 3.141592; <- 어디서든지 만들 수 있다.
	
	
	public void testIf() {
		//단독 if문
		//조건식의 결과가 참이면 {}안의 코드 실행
		//조건식의 결과가 거짓이면 {}안의 코드를 무시하고 건너뛰기.
		
		int num = 11;
		//짝수인지 확인
		if(num%2==0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		//짝수가 아닌 경우
		if(num%2 != 0 ) {
			System.out.println("입력하신 숫자는 짝수가 아닙니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public void testIfElse() {
		//else : 조건식을 사용 못함. 단독으로 못씀. if의 조건식이 거짓이라면 무조건 else의 {}안의 코드가 실행.
		
		int num = 11;
		//짝수인지 확인
		if(num%2==0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else{
			System.out.println("입력하신 숫자는 홀수 입니다.");
		}
		
		System.out.println("프로그램 종료");

	}
	
	public void testIfElse2() {
		//정수를 하나 입력받아
		//50보다 큰 수일때 짝수인지 홀수인지 출력.
		//50보다 작은 수라면 "작다".
		System.out.print("정수를 입력하면 50보다 큰지 작은지 알려드립니다!");
		
		int num = sc.nextInt();
		
		if(num>=50) {
			if(num%2==0) {
				System.out.println("50보다 큰 짝수입니다.");
			}else {
				System.out.println("50보다 큰 홀수입니다.");
			}
		}else {
			System.out.println("작다");
		}
		// 이 if문을 삼항연산자로********
		
		
	}
	public void testIfElse3() {
		//정수 하나를 입력받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다."라고 출력
		System.out.print("양수인지 음수인지 0인지 알려드립니다.");
		
		int num = sc.nextInt();
		if(num>=0) {
			if(num==0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("양수입니다.");
			}
		}else {
			System.out.println("음수입니다.");
		}
	}
	
	public void testIfElse4(){
		//정수 두개를 입력받는다.
		//입력받은 두 수의 산술연산을 처리하여 출력한다.(+,-,*,/,%)
		//단, 두 수 모두 1부터 100까지의 값이어야 한다.
		//둘 중 하나라도 범위에 속하지 않은 수라면
		//"값은 1부터 100 사이어야 합니다."라고 출력
		
		System.out.println("첫번째 수 입력");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 입력");
		int num2 = sc.nextInt();
		if(num1>=1&&num1<=100&&num2>=1&&num2<=100) {
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}else {
			System.out.println("값은 1부터 100 사이어야 합니다."); 
		}
		
	}
	
	
}
