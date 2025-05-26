package com.test.part01_inheritTest.after.run;

import java.util.Date;

import com.test.part01_inheritTest.after.model.Desktop;
import com.test.part01_inheritTest.after.model.SmartPhone;
import com.test.part01_inheritTest.after.model.Television;

public class Run {
	public static void main(String[] args) {
		Television t = new Television("LG","01","T-01234","LGTV",2000000,new Date(),65);
		System.out.println(t.toString());
		
		Desktop d = new Desktop("apple","02", "A-111","Mac",5000000,new Date(),"A-6",500,24,"macOS",true);
		System.out.println(d.toString());
		
		
		SmartPhone s = new SmartPhone("samsung","03","G-1234","갤럭시",1000000,new Date(),"퀄컴",512,36,"android","KT");
		System.out.println(s.toString());
		
		
		System.out.println(s.getBrand()); //상속 잘 되어있으면 부모거 내거 상관없이 잘 불러오기가 가능하다.
		
		
		
	}  //product-1.television
	   //		-2.computer   -2.1.Desktop          //상속에 상속
	   //   				  -2.2.smartphone

}
