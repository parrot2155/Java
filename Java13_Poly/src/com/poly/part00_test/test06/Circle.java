package com.poly.part00_test.test06;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		double res = Math.PI * r * r;
//		super.setResult(res+"");
		super.setResult(String.format("%f", res)); //double타입에 소수점 둘째자리까지
	}
	
	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();
	}
	
}
