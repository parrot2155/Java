package com.silsub2;

import java.util.Scanner;

public class Munjae {
	
	public static void main(String[] args) {
		Munjae mj = new Munjae();
		mj.login();
	}
	//키보드로 정수 3개를 입력받아
	//가장 큰 수를 찾아 출력
	public void maxOfNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.println("세번쨰 정수 입력: ");
		int num3 = sc.nextInt();
		
		int res = num1;
		if(num1<num2) {
			res = num2;
			if(num2<num3){
				res = num3;
			}
		}
		System.out.println(res);
	}
	
	//사용자의 id의 pw를 키보드로 입력받아
	//정해진 관리자 id,pw와 일치하는지 확인
	//관리자(admin, 1234)
	/*
	 * ID,PW 두개 모두 일치하면 "로그인 성공" 출력
	 * ID만 맞으면 "비밀번호가 틀렸스니다." 출력
	 * ID가 클리면 "존재하지 않는 사용자입니다."출력
	 */
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		int pw = sc.nextInt();
		
		if(id.equals("admin")) {
			if(pw == 1234) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}
	
	//암호체크
	//키보드로 3개의 정수를 입력
	//각 자리수를 분해해서 
	//모두 홀수면  "code A" 출력
	//모두 홀수면  "code B" 츨력
	//첫번째 자리가 홀수, 나머지 짝수 - "code C" 출력
	//위 조건 모두 해당하지 않으면 "nomal code" 출력
	public void codeCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 정수 입력: ");
		int num = sc.nextInt();
		int num1 = num/100;
		int num2 = (num-num1)/10;
		int num3 = num%10;
		
		
	}
}
