package com.test01;

public class Variable04 {

	public static void main(String[] args) {
	//준비
		//클래스명 변수명 = new 클래스명();
		Variable04 v04 = new Variable04();
	//실행
	//변수명
		v04.test1();  //65출력. A는 아스키코드로 65.
		v04.test2();
		v04.test3();
	}
	
	//자동 형변환, 강제 형변환
	
	//컴퓨터의 데이터 처리 원칙
	//같은 자료형 끼리 대입 가능, 같은 자료형 끼리 연산 가능.
	//작은 자료형을 큰 자료형으로, 정수형을 실수형으로 자동형변환 가능
	
	public void test1() {
		//형변환 예외
		boolean flag = true;
		//flag = "true";
		
		
		int num = 'A'; //자동 형변환
		System.out.println("num" + num);
		
		char ch = 97; //자동 형변환
		System.out.println(ch); // a 출력
		
		//num = -65; //음수를 저장한 변수를 char강제 형변환 하게되면 문자로 인식할 수 없다.
		//int 변수의 값을 강제 형변환 해야한다.
		char ch2 = (char)num;
		System.out.println("ch: " + ch2);
		
		
	}
	public void test2() {
		int inum = 10;
		long lnum = 100L; //long은 뒤에 붙여도 되고 안붙여도 된다.안붙이면 자동 형변환 되는거임
		
		// inum + lnum =>결과값은 long타입이다.
		//다른 자료ㅕㅇ끼리 연산 후에 결과로 큰 자료형의 데이터가 나온다.
		//int isum = inum + lnum;
		
		//1. 
		int isum = (int)(inum+lnum);
		//2.
		int isum2 = inum + (int)lnum;
		//3.
		long lsum = inum + lnum;
		
		System.out.printf("isum:%d, isum2:%d, lsum:%d", isum,isum2,lsum);
		
		byte bnum = 1;
		short snum = 2;
		//byte와 short은 연산 결과가 무조건 int다.
		
		//short sum = bnum + snum; 에러
		
		int sum = bnum + snum;
		short sum2 = (short)(bnum+snum);
		
		System.out.println();  //그냥 줄바꿈
		System.out.println();
		System.out.println(sum+","+sum2);
	}
	public void test3() {
		long lnum = 100;
		
		float fnum = lnum;
		//정수는 실수로 자동 형변환 된다.
		System.out.println("fnum: "+fnum); //100.0으로 출력. 정수값이 실수로 형변환 된걸 티를 낸다.
		
		//실수에서 정수로는 강제 형변환 필요
		double dnum = 1234.567;
		int inum = (int)dnum;
		System.out.println("inum: " + inum); //1234출력. int로 바뀌어서 소수점 날라감. 데이터 손실 발생.
		//이미 소수점 자리 손실되었기 때문에 double로 바꾸더라도 돌아오지 않는다.
		
		
		
	}

}

















