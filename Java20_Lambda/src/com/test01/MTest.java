package com.test01;
//람다함수 : 익명함수. 화살표함수와 비슷


public class MTest {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hi");
			}
		};
		
		//람다식
		Runnable r2 = ()->System.out.println("Hello");
		
		r.run();
		r2.run();
		
		/////////////////////
		
		Test01 test01_0 = new Test01() {
			@Override
			public void prn() {
				System.out.println("test01_0");
			}
		};
		test01_0.prn();
		
		//()->{code;}
		Test01 test01_1 = ()->{System.out.println("test01");};
		test01_1.prn();
		
		//(parameter) -> {code;}
		Test02 test02_1 = (int n)->System.out.println("input no : "+n);
		//실행할 함수가 한줄이면 중괄호 생략가능.
		test02_1.prn(80);
		//더 줄이기
		//매개변수의 타입은 대부분 짐작 가능하여 생략하는 경우가 많음.
		Test02 test02_2 = (n)->System.out.println("input no: "+n);
		test02_2.prn(22);
		Test02 test02_3 = n->System.out.println("input no: "+n);
		test02_3.prn(23);
		
		//(param) -> {code;return;}   //?
		
		Test03 test03 = n->n+n;
		System.out.println(test03.prn(3));
		test03 = n-> {
			System.out.println(n+"입력");
			return n+n;
		};
		System.out.println(test03.prn(4));
		
		//(param,param)->{code;return;}
		Test04 test04 = (n,m)->{ //매개변수 두개면 괄호 잘 쳐야 한다.
			System.out.println("n : "+n+" , m : "+m);
			return n*m;	
		};
		System.out.println(test04.prn(5,4));
		
		
	}
}











