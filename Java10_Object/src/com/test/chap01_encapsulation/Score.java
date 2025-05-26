package com.test.chap01_encapsulation;

public class Score {
	//필드 4개
	private String name = "박태욱";
	private int kor=90;
	private int eng=84;
	private int math=97;
	
	//메소드
	//생성자
	public Score() {}//?
	
	//1. 점수의 총합을 구해 출력하는 메소드
	public void sum() {
		int sum = (kor+eng+math);
		System.out.println("총합 : "+sum);
	}
	//2. 점수의 평균을 구해 출력하는 메소드
	public void aver () {
		int aver = (kor+eng+math)/3;
		System.out.println("평균 : "+aver);
	}
	//3. 평균을 확인하고 등급을 매기는 메소드
	// (평균 점수가 90이상 A, 70~89 B, 나머지 C)
	public void grade() {
		int aver = (kor+eng+math)/3;
		char grd;
		
		if(aver>=90) {
			grd = 'A';
		}else if(aver>=70) {
			grd = 'B';
		}else {
			grd = 'c';
		}
		System.out.println("등급 : "+grd);
	}
	//4. 필드값을 확인할 수 있게 출력해주는 메소드
	public void prnt() {
		System.out.println("이름 : "+name+", 국어 : "+kor+", 수학 : "+math+", 영어 : "+eng);
	}
	
	
	
	
	
	
}
