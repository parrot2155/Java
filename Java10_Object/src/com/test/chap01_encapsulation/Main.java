package com.test.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Account a = new Account();
		
		//Account b = new Account(); //하나의 클래스를 가리키지만 서로 다르다.
		
		//잔액조회
		a.prnBalance();
		
		//입금
		a.in(100000);
		a.prnBalance();
		
		a.in(150000);
		a.prnBalance();
		
		//출금
		a.out(50000);
		a.prnBalance();
		
		//a.balance -= 200000;//직접접근이라 접근 불가능(private)
		
		//메소드를 통해 접근되어야만 할 수 있게 됨.private
		//직접접근 불가능.
		//그래서 반드시 public으로 넘겨받아야함.
		
		
		
		a.out(50000);
		a.prnBalance();
		
		
		//객체 추가
		Account b = new Account();
		
		b.prnBalance();
		a.prnBalance(); // 변수 공간 자체가 다르다.
	}

}
