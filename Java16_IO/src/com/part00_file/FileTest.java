package com.part00_file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//file클래스
		//경로에 작성된 파일이 없어도 file객체 생성 가능
		//new File("경로"); 경로 - "C:/work/test/fileTest.txt"
		File file = new File("test/fileTest.txt");
		
		System.out.println("파일명 : "+file.getName());
		System.out.println(("경로 : "+file.getAbsolutePath()));
		System.out.println("파일 크기 : "+file.length());
		
		//파일이 없는 경우 생성.
		//createNewFile()=>생성을 하면 true리턴. 기존 파일이 존재하면 false 리턴.
		try {
			boolean b = file.createNewFile();//파일을 만드는 기능. 같은 경로와 이름의 파일이 있으면 안만든다.
			
			System.out.println("파일 생성 결과 : "+b);//지운뒤에 다시 생성하면 true값을 반환한다.
			System.out.println("파일 생성 완료!");
			
			file.mkdirs();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
		
		
		
		
		//필요 디렉토리 생성
		//=>파일 생성
		File dir1 = new File("test");
		dir1.mkdirs();
		
		File dir2 = new File("test1/test2/test3");
		dir2.mkdirs();
	}

}
