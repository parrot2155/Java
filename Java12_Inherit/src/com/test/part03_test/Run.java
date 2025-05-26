package com.test.part03_test;

import com.test.part02_OverridingTest.book.Book;

public class Run {

	public static void main(String[] args) {
		Car c1 = new SUV("하얀");
		
		c1.accelPedal();
		
		System.out.println(c1.toString());
		
		
		
		//다형성
//		Object obj = new SUV();
//		Book b = (Book)obj;
		
		
		//c1.bPedal();  //작동 안함.
	}

}
