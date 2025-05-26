package com.poly.part00_test.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.println("선택 [1:고양이 2:강아지 3:송아지]: ");
		int select = new Scanner(System.in).nextInt();
		
		//입력한 값에 따라 다른 객체를 생성해서 실행

//		Cat cat = null;
//		Dog dog = null;
//		Cow cow = null;
//		
//		switch(select) {
//		case 1:
//			cat = new Cat();
//			break;
//		case 2:
//			dog = new Dog();
//			break;	
//		case 3:
//			cow = new Cow();
//			break;
//		}
//
//		if(!(cat == null)) {
//			cat.start();
//			cat.stop();
//		}else if(!(dog==null)) {
//			dog.start();
//		}else if(!(cow==null)) {
//			cow.stop();
//		}
		
		Base base = null;
		switch(select) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
		}
		
		
		base.start();
		base.stop();
		
		
		
		
		
		
		
		
		
	}

}
