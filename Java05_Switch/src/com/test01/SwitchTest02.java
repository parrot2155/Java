package com.test01;

import java.util.Scanner;

public class SwitchTest02 {
	public void test1() {
		//정수 두개와 연산기호를 문자로 입력받아 
		//입력받은 연산 기호에 해당하는 계산을 수행하고 출력
		//3 4 + => 3+4
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자");
		int num2 = sc.nextInt();
		System.out.println("연산자 (+,-,*,/)");
		String str = sc.next();
		
		int res = 0;
		
		switch(str){
			case "+":
				res = num1 + num2;
				break;
			case "-":
				res = num1 - num2;
				break;
			case "*":
				res = num1 * num2;
				break;
			case "/":
				res = num1 / num2;
				break;
		}
		
		System.out.println(num1+str+num2+"="+res);
		
		
		
	}
}
