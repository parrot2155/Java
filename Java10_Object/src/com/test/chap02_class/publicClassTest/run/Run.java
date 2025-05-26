package com.test.chap02_class.publicClassTest.run;

import com.test.chap02_class.publicClassTest.model.PublicClassTest;//다른 패키지니까 import해야됨.

public class Run {

	public static void main(String[] args) {
		//객체 생성
		//test()메소드 실행
		PublicClassTest t = new PublicClassTest();
		t.test();
	}

}
