package com.part03_wrapperStream.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	public static void main(String[] args) {
		new TestObject().fileopen();
		//new TestObject().fileSave();
	}
	
	
	public void fileSave() {
		Member mar[] = {
			new Member("user01","pass01","박태욱","park1234",20,'남',1200.4),
			new Member("user02","pass02","김태욱","kim1234",30,'여',1234.8),
			new Member("user03","pass03","이태욱","lee1234",40,'남',1275.5)
		};
		
		//객체 출력
		//ObjectOutputStream 클래스 사용. 보조스트림
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(int i=0;i<mar.length;i++) {
				objOut.writeObject(mar[i]);
			}
			
			objOut.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				objOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void fileopen() {
		Member[] mar = new Member[3];
		
		//스트림 객체 생성
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"))){
			
			//입력
			mar[0] = (Member)objIn.readObject();
			mar[1] = (Member)objIn.readObject();
			mar[2] = (Member)objIn.readObject();
			
			//입력받은 객체 콘솔에 출력
			for(Member m : mar) {
				System.out.println("얻어온 객체 : "+m);
				System.out.println(m.getAddr());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}









