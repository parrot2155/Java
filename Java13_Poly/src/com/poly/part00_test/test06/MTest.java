package com.poly.part00_test.test06;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.make();
//		c.print();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도형 선택[1:원 2:사각형 3:삼각형] : " );
		int select = sc.nextInt();
		
		Area ar = null;
		
		switch(select) {
		case 1:
			ar = new Circle();
			break;
		case 2:
			ar = new Square();
			break;
		case 3:
			ar = new Triangle();
			break;
		}
		
		ar.make();
		ar.print();
		
	}

}
