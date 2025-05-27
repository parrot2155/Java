package com.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {
	//StringTokenizer
	//util패키지
	//spit 차이점: split()은 추출한 문자를 배열로 저장, stringtokenizer는 토큰으로 처리된다.
	
	//hasMoreTokens(): 토큰이 남아 있는지 확인
	//nextToken(): 토큰 읽어오기
	
	public static void main(String[] args) {
		String str = "박태욱,20,경기 용인시,남";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		String arr[] = str.split(",");
		for(String s:arr) {
			System.out.println(s);
		}
		
	}
}
