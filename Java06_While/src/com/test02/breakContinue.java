package com.test02;

public class breakContinue {

	public static void main(String[] args) {
		testBreak();
		testCon();

	}
	public static void testBreak() {
		int no = 10;
		int sum = 0;
		
		int i=1;
		while(true) {
			sum += i;
			if(i==no) {
				break;
			}
			i++;
		}
		System.out.println("sum: "+sum);
	}
	public static void testCon() {
		int i=0;
		while(i<10) {
			i++;
			if(i%2==1) {
				continue;   //조건을 만족하는 애들은 그냥 건너뜀.
			}
			System.out.println(i);
		}
	}
	
	
	
	
	
	
}



















