package com.test.chap02_class.defaultClassTest.model;

//default 클래스는 다른 곳에서 사용할 수 없다.못가져옴.
import com.test.chap02_class.defaultClassTest.model.*;
public class Run {

	public static void main(String[] args) {
		//객체 생성
		DefaultClassTest de = new DefaultClassTest();
		de.test();
		
		//default클래스는 패키지 외부에서 접근이 불가능.

	}

}
