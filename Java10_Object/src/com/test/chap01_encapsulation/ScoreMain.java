package com.test.chap01_encapsulation;

public class ScoreMain {
	public static void main(String[] args) {
		//1. score 클래스로 객체 하나 생성
			Score sc = new Score();
		//2. 현재 저장된 점수들을 확인
		sc.prnt();
		//3. 총합을 확인
		sc.sum();
		//4. 평균을 확인
		sc.aver();
		//5. 등급을 확인
		sc.grade();
		

	}

}
