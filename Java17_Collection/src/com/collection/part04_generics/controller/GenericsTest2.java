package com.collection.part04_generics.controller;
//클래스 선언부에 제네릭스를 적용시키기
public class GenericsTest2<T>/*대문자*/ {
	private T[] array;
	
	public GenericsTest2() {}
	
	public GenericsTest2(T[] array) {
		this.array = array;
	}
	public void prn() {
		for(T tmp:array) {
			System.out.println(tmp);
		}
	}
}
