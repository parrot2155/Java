package com.test02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional04 {

	public static void main(String[] args) {
		//Supplier : 매개변수가 없다.반환값은 있다.
		//public int test(){...}
		
		Supplier<Integer/*반환값의 타입*/> ran = ()-> (int)(Math.random()*50)+1;
		System.out.println(ran.get());
		
		//Consumer : 매개변수는 있고 반환값은 없다.
		Consumer<String/*매개변수의 타입*/> hello = (name) -> System.out.println("hi, "+name);
		hello.accept("Lambda");//반환값은 없고 읽어들인 매개변수를 변수 안에서 처리하고 끝난다.
		//네트워크통신의 accept는 매개변수가 없다. 다르다.
		
		//BiConsumer : 매개변수가 두개 있고, 반환값은 없다.
		BiConsumer<String, Integer> cl = (sub,point)->{
			System.out.println(sub+"점수 : "+point);
		};
		cl.accept("Java", 99);
		
	}

}
