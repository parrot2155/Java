package com.thread.test02;

public class Run {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Heart());
		Thread th2 = new Thread(new Start());
		try {
			th1.start();
			Thread.sleep(500);
			th2.start();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}//움직이는듯한.
		
	}

}
