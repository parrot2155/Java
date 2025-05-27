package com.chap02_stringBuffer_stringBuilder.run;

public class Run1 {
	public static void main(String[] args) {
		//StringBUffer, StringBuilder
		//mutable클래스
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		//String str = new String("ab cde");
		StringBuilder sb = new StringBuilder("AB CDE");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //16 + 6 
		
		StringBuffer sf = new StringBuffer("FG HI");
		System.out.println(sf);
		System.out.println(sf.length());
	}
	public static void test2() {
		String str = "Hello!";
		StringBuffer sf = new StringBuffer("Hi! ");
		StringBuilder sb = new StringBuilder("Hey~ ");
		
		//String 클래스
		System.out.println("str: " + str +", 주소: " + System.identityHashCode(str));
		str += " I'm java!";
		System.out.println("변경 후 str: " + str+", 주소: " + System.identityHashCode(str));
		
		//StringBuffer
		System.out.println("sf: "+ sf + ", 주소: " + System.identityHashCode(sf));
		sf.append("I'm JAVA!");
		System.out.println("변경 후 sf: "+ sf + ", 주소: " + System.identityHashCode(sf));
		
		//StringBuilder
		System.out.println("sb: " + sb + ", 주소: " + System.identityHashCode(sb));
		sb.append("im JaVa@");
		System.out.println("변경 후 sb: " + sb + ", 주소: " + System.identityHashCode(sb));
	}	
		public static void test3() {
			StringBuilder sb = new StringBuilder();
			sb.append("오늘은");
			sb.append("금요일").append("입니다.");
			System.out.println(sb);
			System.out.println(sb.length());
			sb.insert(0,"너무너무 신나는");
			System.out.println(sb);
			sb.delete(0, 8);
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
			
			
		
		
	}
}
























