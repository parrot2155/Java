package com.test02;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Functional02 {

	public static void main(String[] args) {
		//predi01();
		//predi02();
		predi03();

	}
	//Predicate
	//매개변수 있고 , 반환값도 존재(Boolean 리턴)
	//test() 호출하여 실행
	public static void predi01() {
		Predicate<Integer> p1 = (n)->n%2==0;
		Predicate<Integer> p2 = (n)->n%3==0;
		
		System.out.println("2의 배수인지");
		System.out.println(p1.test(6));
		System.out.println("3의 배수인지");
		System.out.println(p2.test(7));
		
	}
	public static void predi02() {
		String name = "ptw";
		if(isEmpty(name, (input)->input.length()==0)) {
			System.out.println("이름을 제대로 입력하지 않았습니다.");
		}else {
			System.out.println(name+"입니다.");
		}
	}
	
	public static boolean isEmpty(String name, Predicate<String> predic) {
		return predic.test(name);
	}
	
	public static void predi03() {
		//BiPredicate, 2개의 매개변수, Boolean리턴
		BiPredicate<Integer, Integer> biPre = (i,j)->i-j>0;
		if(biPre.test(10, 11)) {
			System.out.println("i>j");
		}else {
			System.out.println("i<=j");
		}
		
	}
}
