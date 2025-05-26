package com.test.chap04_constructor.test01;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		u1.info();
		
		User u2 = new User("admin","1234","박태욱");
		u2.info();
		
		User u3 = new User("user01","1234","박태욱",new Date());
		u3.info();
		
		u1.setUserId("user02");
		u1.setUserPwd("1q2w3e4r!");
		u1.setUserName("태욱");
		u1.setDate(new Date());
		u1.info();
		System.out.println(u1.getUserId());
	}	
	
}
