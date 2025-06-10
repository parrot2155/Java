package com.test01;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
//		testFor1();
//		testFor2();
//		testFor3();
		testFor4();

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
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		for(int r=1; r<=row; r++) {
			for(int c=1; c<=col; c++) {
				if(r==c) {
					System.out.print(r);
				}else {
					System.out.print("@");
				}
			}
			System.out.println();
		}//0910~1000 50분 동안 범위는 프론트, 월 오전 객관식 or ox 20문제 과락 60점 이상
	}
}
















