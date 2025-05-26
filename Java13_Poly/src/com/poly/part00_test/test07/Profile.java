package com.poly.part00_test.test07;

public class Profile {
	private String name;
	private String phone;
	
	
	
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	//ㄳ기본생성자 안만들어도 된다.안사용할거면/.
	
	public void printProfile() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
	}
	
}
