package com.part02_charStream.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	//이번에는 문자단위의 스트림 확인해볼게요
	//글자단위 입출력은 얘가 더 좋다.
	public void filesave() {
		//문자단위의 기반 스트림
		//FileWriter
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample2.txt",true); //연결해주고 외부로 데이터가 나가는 흐름.
			//파일이 존재하지 않으면 자동 생성한다.		//true로 계속 이어서 쓸 수 있음.
			
			fw.write("안녕하세요 반가워요!");
			fw.write('A');
			
			char[] arr = {'a','p','q','l','e'};
			fw.write(arr);
			fw.write("\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileopen() {
		//문자 단위의 기반 스트림
		//FileReader
		FileReader fr = null;
		
	
			try {
				fr = new FileReader("sample2.txt");
				
//				System.out.println((char)fr.read());
//				System.out.println((char)fr.read());
				
				int val;
				while((val = fr.read())!=-1) {
					System.out.print((char)val);
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	//new 기반 스트림("외부자원");
	//new 보조 스트림(다른 스트림()); //다른스트림이라는 것은 또 다른 보조스트림or기반스트림.
								//한마디로 다른 스트림이 다 들어갈 수 있다는것.
	//new 보조스트림(new 보조스트림(new 다른스트림()));
	//new 보조스트림(new 기반스트림("외부자원"));
	//
	//new 보조스트림("외부자원"); <- 안됨. 보조스트림은 외부자원이 못들어가기 때문에 꼭 기반스트림이 들어가야됨.
	//
}
