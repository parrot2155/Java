package com.thread.test01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Thread01 th1 = new Thread01("야옹이");
		Thread01 th2 = new Thread01("강아지");
		
//		th1.start();
//		th1.start();
		
		Thread01_1 th3 = new Thread01_1();
//		th3.start();
//		th1.start();  //start=>입력을 받기 위해 기다리는 시간 조차도 야옹이는 기다리지 않고 병렬로 처리한다.
					  //run(single thread)일때는 입력을 받을 때까지 무기한 기다린다. 
		
		//우선순위 : 작업 진행이 우선순위가 높은 스레드부럴 가시리ㅣㅅㄴ
		th1.setPriority(Thread.MAX_PRIORITY);//setpriority 숫자가 높을수록 우선순위임.
		th2.setPriority(8);
		
		th1.start();
		th2.start();
		
	}

}
class Thread01_1 extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		 String str = sc.nextLine();
		 
		 System.out.println("str: "+str);
	}
}