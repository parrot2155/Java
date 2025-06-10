package com.silsub1;

import java.util.Scanner;

public class example {
	public void ForWhile() {
		
	}
	
	public void printStar1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String str = "";
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
			System.out.println(str + i);
			str += "*";
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	public void printStar2() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String str = "";
		
		if(num>0) {
			for(int i=0; i<num; i++) {
				str += "*";
				System.out.println(str);
			}
		}else if(num==0){
			System.out.println("출력 기능이 없습니다.");
		}else {
			int mnum = (0-num);
			for(int i=0; i<mnum; i++) {
				str += "*";
			}
			for(int i=0; i<mnum; i++) {
				System.out.println(str);
				str = str.substring(0,str.length() - 1);
			}
		}
		
	}
	public void printStar3() {
		
	}
	
	
	
}
