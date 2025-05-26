package com.poly.part00_test.test06;

import java.util.Scanner;

public class Square extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		int x = sc.nextInt();
		System.out.println("세로 : ");
		int y = sc.nextInt();
		
		int res = x*y;
		setResult(res+"");
		
	}
	
}
