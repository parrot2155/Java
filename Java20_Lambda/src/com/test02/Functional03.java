package com.test02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functional03 {

	public static void main(String[] args) {
		//func01();
		func02();
	}
	//Function<T,R> T-매개변수, R-반환값
	//apply() - 매개변수o, 반환값o
	
	public static void func01() {
		Function<Integer, String> fn = n -> (n>=10)?""+n:"0"+n;
		System.out.println(fn.apply(1));
		System.out.println(fn.apply(4));
		System.out.println(fn.apply(12));
	}
	public static void func02() {
		//매개변수 2개
		BiFunction<String, String, Integer> bFn = (i,j)->Integer.parseInt(i)+Integer.parseInt(j);
		System.out.println(bFn.apply("10","20"));//매개변수 스트링 두개를 넣어 정수 하나 리턴함.
	
		
		
		
	}
}







