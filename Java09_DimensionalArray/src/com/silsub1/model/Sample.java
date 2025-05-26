package com.silsub1.model;
import java.util.Scanner;

public class Sample {
	public void munjae1() {
		int[][] iarr1 = new int[4][4];
		
		for(int i=0;i<(iarr1.length-1);i++) {
			for(int j=0;j<(iarr1[i].length-1);j++) {
				iarr1[i][j] = (int) (Math.random()*100-1);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				iarr1[3][i] += iarr1[j][i];
			}
			for(int j=0;j<3;j++) {
				iarr1[i][3] += iarr1[i][j];
			}
			for(int j=0;j<3;j++) {
				iarr1[3][3] += iarr1[i][j];
			}
		}
		for(int i=0; i<iarr1.length;i++) { //iarr1.length : 행(처음 가리키는 배열)의 길이
			for(int j=0; j<iarr1[i].length;j++) {
				System.out.print(iarr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void munjae2() {  //미완
		Scanner sc = new Scanner(System.in);
		System.out.println("1열의 개수 입력 : ");
		int col1 = sc.nextInt();
		System.out.println("2열의 개수 입력 : ");
		int col2 = sc.nextInt();
		System.out.println("3열의 개수 입력 : ");
		int col3 = sc.nextInt();
		
		int[][] iarr = new int[3][];
		iarr[0] = new int[col1];
		iarr[1] = new int[col2];
		iarr[2] = new int[col3];
		
		for(int i=0;i<(iarr.length-1);i++) {
			for(int j=0;j<(iarr[i].length-1);j++) {
				iarr[i][j] = (int) (Math.random()*100-1);
			}
		}
		
	}
	
}








