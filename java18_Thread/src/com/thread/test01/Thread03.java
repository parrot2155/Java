package com.thread.test01;

public class Thread03 {
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("야옹");
		Thread01 t2 = new Thread01("멍멍");
		
		long start = System.currentTimeMillis();
		t1.start();
		
		try {
			//t1스레드가 종료될 때까지 
			//다른 스레드를 멈춘다.
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		t2.start();
		
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start));
	}
}
