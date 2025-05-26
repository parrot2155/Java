package com.test.part03_test;

public class SUV extends Car{
	public SUV() {
		
	}
	
	public SUV(String color) {
		super(color);
		System.out.println(color+"색 suv 생성");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("속도가 적당히 올라갑니다.");
		super.setSpeed(super.getSpeed()+15);
	}
	
	
	public void bPedal() {
		System.out.println("멈춥니다.");
	}
	
	
	
	
	@Override
	public String toString() {
		return "suv의 현재 속도는 "+getSpeed()+" 입니다.";
	}
	
	
	
}
