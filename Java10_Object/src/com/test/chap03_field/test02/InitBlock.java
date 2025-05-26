package com.test.chap03_field.test02;

public class InitBlock {
/*	1. 기본값
 *  private String pName;
	private int price;
	private static String brand;
	*/
	
	//2. 명시적 초기화
	private String pName = "iPhone";
	private int price = 200;
	private static String brand = "apple";
	
	//3. 초기화 블럭
	static {
		//static 초기화 블럭
		brand = "samsung";
	}
	{
		//인스턴스 초기화 블럭
		pName = "flip";
		price = 150;
		brand = "삼성";
	}
	
	
	//4. 매개변수 있는 생성자
	public InitBlock() {} //기본 생성자
	//매개변수 있는 생성자 : 위의 초기화된 값을 덮어쓰고 전달받은 값을 초기화.
	public InitBlock(String pName, int price, String brand) {
		this.pName = pName;
		this.price= price;
		InitBlock.brand = brand;
	}
	
	//4.5 값을 저장하는 메소드
	public void savePName(String pName) { //필드에 저장한다.
		this.pName = pName;
	}
	//setter 메소드
	public void setPrice(int pName) {
		this.price = price;
	}
	//public void get필드이름(필드타입 매개변수)
	//		 해당 필드의 값 저장하는 코드
	
	public void information() {
		System.out.println(pName+" , "+price+" , "+brand);
	}
}
