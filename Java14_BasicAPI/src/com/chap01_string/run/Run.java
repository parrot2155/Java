package com.chap01_string.run;

public class Run {

	public static void main(String[] args) {
		//String 클래스
		//문자열, immutable(불변)
		
//		test1();
		test2();
	}
	
	public static void test1() {

		//문자열 리터럴로 생성
		String str = "abc";
		String str1 = "abc";
		//String pool 활용
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		//new연산자로 생성
		System.out.println("--------------------");
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//동일한 hashcode()값, 오버라이딩 되어있어 같은 값일 경우 같은 hashcode
		System.out.println("abc".hashCode());
		
		System.out.println("---------------------");
		System.out.println("str: " +System.identityHashCode(str));
		System.out.println("str1: " +System.identityHashCode(str1));
		System.out.println("str2: " +System.identityHashCode(str2));
		System.out.println("str3: " +System.identityHashCode(str3));
		
		System.out.println(str == str1);
		System.out.println(str2 == str3);
		
		String s1 = new String("ABC");
		String s2 = new String("ABC"+"D");
		String s3 = "ABCD";
		System.out.println("----------------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s2.intern() == s3);
	}

	public static void test2() {
		//String클래스의 대표 메소드
		String str = "abc";
		
		System.out.println(str.charAt(1));
		System.out.println(str.concat("def"));
		System.out.println(str.contains("ac"));
		System.out.println(str.equals("abc"));
		System.out.println(str.length());
		
		str = "a,b,c";
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		str = "        ab c  ";
		System.out.println(str);
		System.out.println(str.trim());
	}
	
}













