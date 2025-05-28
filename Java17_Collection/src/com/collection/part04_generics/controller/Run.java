package com.collection.part04_generics.controller;

public class Run {

	public static void main(String[] args) {
		//new GenericTest().test3();
		
		String[] sarr = {"apple","banana","mange"};
		GenericsTest2<String> my = new GenericsTest2<String>(sarr);
		my.prn();
		
		
		Integer[] iarr = {1,2,3,4};
		GenericsTest2<Integer> my2 = new GenericsTest2<Integer>(iarr);
		my2.prn();
		
		
		
	}

}
