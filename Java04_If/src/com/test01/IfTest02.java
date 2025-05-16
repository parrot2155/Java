package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//else if : 다중으로 조건을 줄 수 있는 문법
	public void testElseIf1() {
		int no = 10;
		
		if(no != 0) {
			
		}else if(no>0) {
			System.out.println("양수입니다.");
		}
		//----------------------------
		
		
		int i=10, j=20;
		
		if(i>j) {
			System.out.println("i가 j보다 크다.");
		}else if(i==j){
			System.out.println("i롸 j가 같다.");
		}else{
			System.out.println("i가 j보다 작다.");
		}
		
	}
	public void testElseIf2() {
		//점수 하나응 입력받아서 등급을 나눠서 점수와 등급을 출력
		//90이상은 A
		//90미만 80이상 B
		//80미만 70이상 C
		//70미만 60이상 D
		//60미만 F
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		int score = sc.nextInt();
		char grade = ' ';
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		//System.out.println("점수는 "+score+"이고, 등급은 "+grade+"이다.");
		System.out.printf("점수는 %d 이고, 등급은 %c 이다.",score,grade);
	}
	
	public void testElseIf3() {
		//testElseIf2에서 
		//각 등급별 중간 점수 이상의 경우에는 등급에 + 라는 문자를 추가하여 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		int score = sc.nextInt();
		String grade = "";
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else if(score>=60){
			grade = "D";
		}else {
			grade = "F";
		}
		
		if(score%10>=5&&score>=60) {
			grade += "+";
		}
		
		System.out.printf("점수는 %d 이고, 등급은 %S 이다.",score,grade);
	}
}














