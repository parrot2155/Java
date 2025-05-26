package com.test.part02_OverridingTest.book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("안녕하세요","박태욱",10000);
		Book b2 = new Book("Hello","박정민",20000);
		

		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		
//		System.out.println("b1 = "+b1.toString()); //object에 있던 toString이 
//		System.out.println("b2 = "+b2.toString()); //
//		
		
		System.out.println("b1과 b2가 같은가? : "+b1.equals(b2));
		
		Book b3 = b1;
		System.out.println("b1과 b3가 같나? : "+b1.equals(b3));
		
		Book b4 = new Book("안녕하세요","박태윽",10000);
		System.out.println("b1과 b4가 같나? : "+b1.equals(b4));
		//b1과 값이 동일 객체 b4는 false
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		//주소(해시)는 다르지만 값이 같은 객체를 동등한 객체라고 한다.
		//주소까지 같으면 동일객체라고 한다.
		//equals()의 값이 true인데 hashCode()가 다르면 
		//다른 객체로 취급될 수 있다.
		//그래서 hashCode()도 overriding 해줘야 한다.
	}

}
