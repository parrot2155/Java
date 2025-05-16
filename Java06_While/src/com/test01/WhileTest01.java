package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		WhileTest01 wt1 = new WhileTest01();
		wt1.testWhile5();

	}
	public static void testWhile1() {
		int i = 0;
		while(i<10) {
			System.out.println(i+" 번째 반복중");
			i++;
		}
		System.out.println("while 종료 후 i값 : "+i);
	}
	
	
	public static void testWhile2() {
		//문자열을 입력받아 인덱스 별로 문자 출력. 문자열은 문자마다 인덱스번호가 메겨져 있다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String str = sc.next();
		
		int index = 0;
		String res = "";
		while(index<str.length()) { //()괄호를 써야한다.-> .length길이를 구하는 동작을 하는거임.
			System.out.println(str.charAt(index)+":"+(index+1));
			index++;
		}
		
	
	}
	
	
	public static void testWhile3() {
		//1부터 입력받은 수까지 정수들의 합
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		System.out.print(num+"! : ");
		while(0<num) {
			sum += num;
			num--;
		}
		System.out.print(sum);
	}
	
	public static void testWhile4() {
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;
			}
		}
	}
	
	//키보드로 숫자를 입력 받는다.
	//4가 입력 될떄까지.
	//4를 제외한 나머지 숫자를 입력받으면 계속 반복하면 숫자를 입력 받는다.
	
	public static void testWhile4_1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4를 입력할때까지 입력 계속 받을거임. 입력해보셈");
		int num = sc.nextInt();
		while(num!=4) {
			System.out.println("4가 아닙니다. 다시 입력해주세요.");
			num = sc.nextInt();
		}
		System.out.println("4맞음.끝.");
		
		while(true) {
			System.out.print("숫자입력");
			int no=sc.nextInt();
			if(no==4) {
				System.out.println("4입력. 종료.");
				break;
			}
		}
		
		while(true) {
			System.out.print("문자열 입력(1,2,3,4,5)");
			String tmp = sc.next();
			
			if(tmp.equals("4")) {  //문자열은 equals함수로 비교한다.<-처음보는거***
				System.out.println("4입력. 종료.");
				break;
			}
		}
		
		
		
	}
	
	public static void testWhile5() {
		int no1 = 2;
		while(no1<10) {
			System.out.println(no1+"단");
			int no2=2;
			while(no2<10) {
				System.out.println(no1+" X "+no2+" = "+(no1*no2));
				no2++;
			}
			System.out.println();
			no1++;
		}
		
		//구구단.
		
		
	}
	
}











