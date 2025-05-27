package com.chap04_wrapperclass.run;

public class Run {

	//wrapper클래스
	//프로그램에 따라 기본타입의 데이터가 아닌 객체로 취급해야 하는 경우 활용
	//예) 메소드 실행시 매개변수로 객체타입만 요구하는 경우
	//Object와 관련된 메소드 활용할 때
	
	//8개의 기본타입에 해당하는 데이터를 객체로 만들 수 있는 wrapper클래스가 각각 존재한다.
	//boxing : 기본자료형 => Wrapper클래스 객체
	///UnBoxing : Wrapper클래스 객체 => 기본자료형
	public static void main(String[] args) {
		//boxing
		Integer i = new Integer(10);//돌아가긴 하지만 웬만하면 쓰지마라.
		Integer i2 = new Integer(10);
		Integer i3 = 15;
		//객체화 => boxing => 자동으로 boxing==autoBoxing
		
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		System.out.println(i3.equals(i));
		System.out.println(i.compareTo(i3));
		//i3가 크면 음수, i가 크면 양수,
		
		short i4 = 10;
		Double d1 = 10.0;
		
		//unBoxing
		int pi = i.intValue();
		double pd = d1.doubleValue();
		System.out.println(pi);
		System.out.println(pd);
		
		//AutoUnBoxing
		int a = i;
		double d = d1;
		int b = i3;
		
		ab(a+b); //int >> (autoboxing) >> Integer 객체 >> (다형성) >> Object obj
		
		test1();
	}
	public static void ab(Object obj) {
		System.out.println(obj);
		int o1 = (Integer)obj; //형변환이 필요하다.
	}
	
	public static void test1() {
		//string => primitive
		byte b = Byte.parseByte("1");
		int i = Integer.parseInt("4");
		double d = Double.parseDouble("1.0");
		char c = "a".charAt(0);
		
		b = Byte.valueOf("1");
		i = Integer.valueOf("1"); //wrapper클래스 객체로 리턴해준다.
		
		
		//primitive => String
		String str = b+""; //스트링을 뒤에 붙이면 스트링으로 바뀐다.
		str = ((Integer)i).toString();
		str = Integer.valueOf(1).toString();
		System.out.println(str); //wrapper클래스가 필요하다.
		
	}
	
	
	
	
	
	
	
	
	
}













