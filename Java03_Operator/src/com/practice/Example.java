package com.practice;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);
	public void sample1() {
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double aver = total / 3.0;
		
		if(kor>=40&&eng>=40&&math>=40&&aver>=60) {
				System.out.println("합격");
		}else {
			System.out.println("불합격");
		}	
	}
	public void sample2() {
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("학년 입력 : ");
		int grade = sc.nextInt();
		System.out.println("반 입력 : ");
		int clasNum = sc.nextInt();
		System.out.println("번호 입력 : ");
		int number = sc.nextInt();
		System.out.println("성별 입력 (M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("성적 입력 : ");
		double score = sc.nextDouble();
		
		
		
	}
	
	
}
