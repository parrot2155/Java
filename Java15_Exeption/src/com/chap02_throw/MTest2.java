package com.chap02_throw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MTest2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//readLine() => 문자열 형태로 한 줄 입력받겠다.
		
		try {
			String val = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
