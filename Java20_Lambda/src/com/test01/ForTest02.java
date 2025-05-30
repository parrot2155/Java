package com.test01;

public class ForTest02 {
	public static void main(String[] args) {
//		testFor1();
//		testFor2();
		testFor3();

	}
	public static void testFor1() {
		for(int i=0; i<10; i++) {
			System.out.println(i+" : ");
			for(int j=0; j<10; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void testFor2() {
		//구구단(2~9)
		for(int i=2; i<10; i++) {
			System.out.println(i+" 단 ");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
	}
	public static void testFor3() {
		
		for(int k=0; k<5; k++) {
			for(int i=0; i<5; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		int no = 1;
		
	}

}
















