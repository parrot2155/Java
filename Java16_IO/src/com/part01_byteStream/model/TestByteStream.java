package com.part01_byteStream.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void filesave() {
		//byte단위로 데이터를 출력할 수 있는 스트림
		//FileOutputStream
		//먼저 데이터를 내보낼거임 내보내기 위한 파일 객체가 필요함. 지금은 일단 먼저 
		
		//스트림 생성
		FileOutputStream fout = null;//finally에서 쓰기 위해 밖에서 먼저 선언해준다.
		try {
			fout = new FileOutputStream("sample.txt");
			//대상파일(외부자원)이 존재하지 않아 자동으로 생성함. 지가 만들었음.
			//자바 프로그램과 스트림을 통해서 외부와 통로를 만들었다.
			
			//출력작업
			fout.write(97);
			
			byte[] barr = {98,99,100,101,102,10};//10은 줄바꿈.
			fout.write(barr);
			fout.write(barr,1,3);//1번~3번 인덱스의 값만 넣어주겠다.		
			
			//스트림 닫아주는 코드//그러나 try문 안에서 에러가 발생하면 건너뛰어지게 된다.
						  //프로그램이 종료되어도 닫아주지 않는다면 스트림이 계속 열려있을 수 있다.그래서 위치를 옮겨야됨.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {		//예외처리 또 해줘야됨.
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//스트림 닫아주는 코드//try문 안에 있으면 try문 안에서 에러가 발생하면 건너뛰어지게 된다.
			//프로그램이 종료되어도 닫아주지 않는다면 스트림이 계속 열려있을 수 있다.그래서 위치를 옮겨야됨.
		}
		
		
		
	}
	//이제는 sample.txt.로부터 입력받아오자.
	//하나의 스트림은 단방향만 된다. 또 입력 스트림을 만들어 줘야 된다.
	
	public void fileopen() {
		//파일로부터 byte단위로 데이터를 읽어 올 수 있는 스트림
		//FileInputStream
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("sample.txt"); //반드시 예외처리 해줘야한다.
			//이제 자바와 외부 파일이랑 입력 스트림을 만들어졌다.
			/*
			//파일 크기만큼 배열 선언
			int fileSize = (int)new File("sample.txt").length();//리턴타입이 long. 변환해줘야됨
			System.out.println(fileSize);
			byte[] barr = new byte[fileSize];
			
			fin.read(barr);
			
			for(int i=0;i<barr.length;i++) {
				System.out.print((char)barr[i]+" ");//문자로 바꿔읽고싶을땐 형변환.
			}*/
			
			//하나씩 읽어오기
		
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read()); //이건 좀 안예쁨					다 읽어와서 읽을 게 없으면 -1을 출력한다.
			int val = 0;
			while((val=fin.read())!=-1) {						//위에서 읽고
				System.out.print((char)val+" ");//아래서 한번 더 읽으니까 하나씩 비워서 출력하게 됨.
			}			//그래서 변수 val을 하나 만들어주고 값을 넣어둔 뒤 read대신 출력해줘서 read를 한번만 출력할 수 있게 해준다.
			System.out.println();
			System.out.println("while 종료 후 val : "+val);
															//한글은 자바에서 2바이트라 제대로 출력 안됨. 심지어 저장할 수 도 없음.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close(); 			//close까먹지 않기.
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
	}
	
	public void filesave2() {
		//try with resourcr문
		//try(객체생성){}catch (예외클래스){}
		//얘네는 자동으로 close초리가 됨. 그러니까 IOException 예외처리를 해줘야됨.
		
		//FileOutputStream객체 생성
		try(FileOutputStream fout = new FileOutputStream("sample.txt")){
			//일반적으로는 똑같음 이 안에다 실행할 코드 적어주면 됨
			fout.write(65);
			byte[] b = {66,67};
			fout.write(b);
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}//따로 close가 필요 없음.
	}
	public void fileopen2() {
		//fileopen과 동일하게 sample.txt에서
		//데이터를 읽어 출력하기.
		//단.try with resource 이용해서 작성
		
		//FileInputStream
		
		try (FileInputStream fin = new FileInputStream("sample.txt");){ //()안의 구문을 먼저 작성하고 자동완성 때려넣으면 빠르게 만들 수 있다.
			int size = (int)new File("sample.txt").length();
			byte[] b = new byte[size];
			fin.read(b);
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			
		} catch (FileNotFoundException e) {			//shift+ctrl+z =>매우 좋은 단축키!
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}















