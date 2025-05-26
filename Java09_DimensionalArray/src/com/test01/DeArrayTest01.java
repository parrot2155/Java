package com.test01;

public class DeArrayTest01 {
	public void test1() {
		//선언
		//선언==변수==stack
		//레퍼런스변수니까 주소값이 저장된다.
		int[][] iarr1;
		int iarr2[][];
		
		//단순 1차원배열은 못넣는다.
		
		//할당
		//new==heap영역에 공간 할당
		iarr1 = new int[3][5];
		
		//배열을 저장하는 배열은 반드시 크기를 지정하며 할당
		iarr2 = new int[3][];//행부분에만 할당은 가능. 열부분에만 할당은 불가능
		System.out.print(iarr2[0]);//null 출력
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[3];
		iarr2[2] = new int[10];
		//가변2차원배열. : 각 행마다 열의 길이가 다르다.
		System.out.println();
		
		for(int i=0; i<iarr2.length;i++) { //iarr1.length : 행(처음 가리키는 배열)의 길이
			for(int j=0; j<iarr2[i].length;j++) {
				System.out.print(iarr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public void test2() {
		//2차원 배열에 값 기록
		int[][] iarr = new int[3][5];
		
		//기본적인 방식
		//배열의 인덱스별로 직접 작성하여 접근해 값 저장
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		//이중 for문을 이용하여 값 저장
		int val = 1;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				iarr[i][j] = val++;
			}
		}
		//System.out.println(iarr[0][0]);
		
		//이중 for문을 이용하여 저장된 값 출력
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
		
		//가변배열
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		val=0;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				iarr[i][j] = val++;
			}
		}
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}			
				
		
	}
	public void test3() {
			//선언 및 할당과 동시에 초기화
		int[][] iarr = {{1,2,3},{4,5,6,7},{8,9,10,11}};
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void test4() {
		//구구단을 2차원 배열에 넣기
		int[][] arr = new int[8][9];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = (i+2)*(j+1);
				System.out.println((i+2)+" * "+(j+1)+" = "+arr[i][j]);
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}












