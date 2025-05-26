package com.test01;

import java.util.Collections;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		//1. a~z 배열에 저장하여 그 배열을 출력
		
		//배열생성
		
		char[] ch = new char[26];
		for(int i=0; i<26;i++) {
			ch[i] = (char)((int)'a'+i);
		}
		//prn(ch);
		
		//2. 1에서 만든 배열을 거꾸로 출력
		reverse(ch);
		
		//3. 1에서 만든 배열을 대문자로 바꿔 출력
		upper(ch);
		
		System.out.println("------");
		prn(ch);
	}
	public static void reverse(char[] ch) {
		
//		char[] rechar = new char[ch.length];
//		for(int i=25; i>=0; i--) {
//			System.out.print(ch[i] + " ");
//		}
		
		//배열의 값을 역순으로 저장한 새로운 배열 생성
		char re[] = new char[26];
		int tmp=0;
		
		for(int i=ch.length-1;i>=0;i--) {
			re[tmp] = ch[i];
			tmp++;
		}
		prn(re);
	}
	
	public static void upper(char[] carr) { //이름이 다른 매개변수 또한 같은 배열을 참조하는 주소를 갖고있으니 같은 배열을 담은거나 마찬가지다. 같은 배열을 여러 변수가 참조중.
//		for(int i=0; i<ch.length; i++) {
//			//System.out.print(Character.toUpperCase(ch[i]) + " ");
//			//System.out.print((char)(ch[i]-32));
//		}
		for(int i=0; i<carr.length; i++) {
			carr[i] = Character.toUpperCase(carr[i]);
		}
		prn(carr);
	}
	
	public static void prn(char[] ch) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}
}
