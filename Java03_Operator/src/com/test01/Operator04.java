package com.test01;

import java.util.Scanner;

public class Operator04 {

	public static void main(String[] args) {
		
		Operator04 o = new Operator04();
		//o.test1();
		o.test2();
	}
	public void test1() {
		//복합대입연산자
		int num = 12, res;
		
		//num의 값을 3 증가시키고 싶다.
		//num = num + 3;
		
		num += 3;
		System.out.println(num);
		num -= 5;
		System.out.println(num);
		num *= 4; //num = num * 4;
		System.out.println(num);
		num /= 2; //num = num / 4;
		System.out.println(num);
		num %= 3; //num = num % 4;
		System.out.println(num);
		
		
	}
	
	public void test2() {
		//삼항 연산자
		//항이 3개 : (조건식)? 참일때 : 거짓일때
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		//입력받은 정수가 양수인지 음수인지 확인
		String res = (num>0)? "양수다." : "양수가 아니다.";
		System.out.println(res);
		
		//삼항연산자를 중첩
		res = (num>0)?"양수다.":(num==0)?"0이다." :"음수다.";
		System.out.println(res);
		
		
		
	}
	

}







