package com.thread.test01;
//2. Runable 상속
public class Thread02 {
	public static void main(String[] args) {
		System.out.println("----------main start----------");
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt);
		
		Thread t2  = new Thread(new MyThread());
		
		//start()실행과 동시에 -> 자동으로 run()실행.
		t1.start();
		t2.start();
		
		System.out.println("----------main end----------");
		
		
	}
	

}
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("i = "+i);
		}
		
	}
}