package com.test02.model.vo;

public class Person {
	//필드
	private String name;
	private int age;
	private int wealth;
	//생성자
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	//getter&setter
	
	//get
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getwealth() {
		return wealth;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	//info(필드값 문자열로 리턴)
	public String info() {
		String str = "이름 : "+name+", 나이 : "+age+", 재산 : "+wealth;
		return str;
	}
}
