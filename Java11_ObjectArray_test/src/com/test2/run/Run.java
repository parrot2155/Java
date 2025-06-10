package com.test2.run;

import java.util.Scanner;

import com.test2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] std = new Student[10];
		int cnt = 0;
		int[] avg = new int[10];
		while(cnt<10) {
			std[cnt] = new Student();
			System.out.println("학년 입력 : ");
			std[cnt].setGrade(sc.nextInt());
			System.out.println("반 입력 : ");
			std[cnt].setClassroom(sc.nextInt());	
			System.out.println("이름 입력 : ");
			std[cnt].setName(sc.next());	
			System.out.println("국어 점수 입력 : ");
			std[cnt].setKor(sc.nextInt());
			System.out.println("영어 점수 입력 : ");
			std[cnt].setEng(sc.nextInt());
			System.out.println("수학 점수 입력 : ");
			std[cnt].setMath(sc.nextInt());
			avg[cnt] = (std[cnt].getKor()+std[cnt].getEng()+std[cnt].getMath())/3;
			cnt++;
			System.out.println("계속 객체를 추가하시겠습니까? (y/n) : ");
			String yn = sc.next();
			if(yn.equals("n")) {
				break;
			}else if(yn.equals("yes")) {
				continue;
			}
		}
		for(int i=0;i<cnt;i++) {
			System.out.println(std[i].information()+", avg="+avg[i]);
		}
	

	}

}
