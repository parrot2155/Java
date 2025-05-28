package com.collection.part03_map.hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test() {
		//properties
		//key,value 모두 String객체
		
		Properties prop = new Properties();
		prop.setProperty("key","value");
		prop.setProperty("id","admin");
		prop.setProperty("pw","1234");
		//prop.setProperty("age",12); //property는 키 값 모두 string이다.
		//prop.put("pw",12);//<=put을 이용하게 되면 정수가 들어가긴 하나,그냥 map을 사용한거나 다름없다.  
		System.out.println(prop);
		System.out.println();
		
		String id = prop.getProperty("id");
		String pw = prop.getProperty("pw");
		//int getPw = (int)prop.get("pw");//굳이 이렇게 쓰지 않는다.
		System.out.println(id+" , "+pw);//setProperties로 제대로 집어넣은게 아니어서
		//제대로 인식하지 못한다. (null 출력)
		
		//System.out.println("getPw : "+getPw);
		//그냥 setProperties와 getProperties쓰자!
		
		//외부파일로 출력 가능
		try {
			prop.store(new FileOutputStream("driver.properties"), "properties Test");//?
			prop.store(new FileWriter("driver.txt"), "properties Test");
			prop.storeToXML(new FileOutputStream("dr.xml"),"xml store");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test2() {
		//파일로부터 읽어오기
		
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileInputStream("driver.properties"));
			
			System.out.println(prop);
			System.out.println("name");
			System.out.println("age");
			System.out.println("id");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
