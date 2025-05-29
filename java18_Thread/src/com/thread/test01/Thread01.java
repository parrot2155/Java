package com.thread.test01;

//1. Thread 클래스 상속
public class Thread01 extends Thread{
	public Thread01(String name) {
		super(name);
	}
	
	
	//run() 오버라이딩 해서 구현 코드 작성
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println(this.getName()+"="+i);
		}
		System.out.println(this.getName()+" 끝!!!!!!!!!!!");
	}
}
