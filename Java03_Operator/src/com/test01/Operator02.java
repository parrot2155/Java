package com.test01;

public class Operator02 {
	public static void main(String[] args) {
		Operator02 o = new Operator02();
		o.test1();
		o.test2();
		o.test3();
	}
	//++ : 1증가, ++값, 값++
 	//-- : 1감소, --값, 값--
	public void test1() {
		int no = 20;
		
		System.out.println("현재 no : " + no);
		
		++no; //일단 먼저 증가시키고 다른 연산 진행함
		System.out.println("++no의 결과 : "+ no);
		
		no++;
		System.out.println("no++의 결과 : "+ no);
		
		--no;
		System.out.println("--no의 결과 : "+ no);
		
		
		System.out.println("----------------------");
		
		int num1 = 20;
		
		//후위연산자 : 다른 계산 먼저 처리 한 후 증감처리된다.
		int res = num1++ * 3;
		System.out.println("res : "+res);
		System.out.println("num1 : "+num1);
		
		//전위연산자 ; 증감을 먼저 처리한 후 다른 계산을 한다.
		num1 = 20;
		res = ++num1 *3;
		System.out.println("res : "+res);
		System.out.println("num1 : "+num1);
		
		//2씩 증가하고 싶다.
		// += 2
		
	}
	
	public void test2() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);//몫
		System.out.println(num1%num2);//나머지
		
		//%
		//홀수냐 짝수냐, 배수
		
	}
	public void test3() {
		//비교연산 : 비교 후 논리값을 결과값으로 받는다.
		//비교 연산자
		//<,>,<=,>=,==,!=
		int a=10, b=20;
		boolean res1, res2, res3;
		
		res1 = a == b;
		res2 = (a != b);
		res3 = (a <= b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
	}
	
	
	
}






