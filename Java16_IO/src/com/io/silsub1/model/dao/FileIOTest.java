package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	public void fileSave() {
		BufferedReader br = null;
		FileWriter fw = null;
		
		String filename;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			filename = br.readLine();
			
			//기반스트림("외부자원")
			fw = new FileWriter(filename+".txt");
			String str = null;
			
			while(true) {
				System.out.println("파일에 저장할 내용 입력: ");
				str = br.readLine();
				if(!str.equals("exit")){
					//fw.write(null);
					fw.write(str.toCharArray());
				}else {
					System.out.println("파일에 성공적을 저장");
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void fileRead() {
		BufferedReader br = null;
		FileReader fr = null;
		
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("일겅올 파일 이름: ");
			String fileName = br.readLine();
			fr = new FileReader(fileName);
			int val = 0;
			StringBuilder sb = new StringBuilder();
			while((val=fr.read())!=-1) {
				sb.append((char)val);
			}
			String str = sb.toString();
			System.out.println(str);
				
		} catch (IOException e) {
	
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
}
