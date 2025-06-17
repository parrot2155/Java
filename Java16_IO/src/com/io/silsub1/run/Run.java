package com.io.silsub1.run;

import java.util.Scanner;

import com.io.silsub1.model.dao.FileIOTest;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 파일저장");
		System.out.println("2 - 출력");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			new FileIOTest().fileSave();
			break;
		case 2:
			new FileIOTest().fileRead();
			break;
		}
		

	}

}
