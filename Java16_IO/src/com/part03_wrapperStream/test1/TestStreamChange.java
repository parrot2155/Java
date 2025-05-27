package com.part03_wrapperStream.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TestStreamChange {
	//보통 기반이 byte이고 보조가 char일 경우 많이 사용
	public void input() {
		//InputStreamReader클래스 이용할거임.
		//보조로는 BufferedReader <-char단위
		//기반으로는 System.in <- byte단위. 얘도 외부스트림 객체임.콘솔창이랑 연결되어있음.
		
		//new 보조스트림(new 보조스트림(다른스트림()));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String val;
		try {
			System.out.println("문자열 입력 : ");
			val = br.readLine();
			System.out.println("val : "+val);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void output() {
		//OutputStreamWriter클래스
		//보조스트림 : BufferedWriter. ->char단위
		//기반 스트림 : System.out ->byte단위. 콘솔창으로 출력함.
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		OutputStreamWriter osw = new OutputStreamWriter(System.out); //같음.
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			bw.write("hello ho bye");
			bw.flush();	//적절한 시점에 버퍼에 내용을 밀어낸다.
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();		//이게 중요함. 이거 없으면 출력이 안됨
				
				//bw.flush(); //버퍼에 남아있는 내용을 밀어버린다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
}










