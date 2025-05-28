package com.collection.part04_generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericTest {
	public void test() {
		//다루고자 하는 클래스 타입을 지정.
		//컬랙션이 다룰 클래스 타입을 제한하여 한가지 종류의 클래스 타입 객체만 저장하게 하는 기능
		
		//잘못된 타입을 사용하여 형변환 등의 작업을 할 가능성을 제거
		//컬랙션에 다양한 종류의 객체가 저장되있다 꺼내 사용할 때마다 형변환 해야된다. 그로인해 코드가 복잡해짐.보기 좋지도 않음.
		
		//<> 해당 기호를 이용하여 클래스 명시
		
		List list = new ArrayList();
		
		list.add(new String("String Object"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("저장된 객체 수 : "+list.size());
		System.out.println("list : "+list);
		
		//저장된 객체를 꺼내 사용할 때
		for(int i=0; i<list.size();i++) {
			Object obj = list.get(i);
			
			if(obj instanceof String) {
				System.out.println(((String)obj).equals("test"));
			}else if(obj instanceof Book) {
				((Book)obj).prnBook();
			}else if(obj instanceof Student) {
				((Student)obj).score();
			}else if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}	
	}
	public void test2() {
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형 제한
		List<Book> list = new ArrayList<Book>();
		//해당 리스트에는 Book클래스 객체만 저장하겠다.
		
		//list.add("test");//에러남
		list.add(new Book());
		list.add(new Book());
		
		for(int i=0;i <list.size();i++) {
			list.get(i).prnBook();
		}
		
		////////
		List list2 = new ArrayList();
		list2.add(new Book());
		list2.add(new Book());
		for(int i=0;i <list2.size();i++) {
			((Book)list2.get(i)).prnBook();
		}
	}
	
	public void test3() {
		//Map에 제네릭스 적용
		HashMap<String,Book> map = new HashMap<>(); //<(키에 대한 제네릭스),(밸류에 대한 제네릭스)>
		//map.put("one","test");//에러. 밸류에 string안된다.
		map.put("one",new Book("java"));
		map.put("two",new Book("js"));
		map.put("three",new Book("HTML"));
		
		System.out.println(map);
		
		System.out.println("--------------------------------");
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		Iterator<Map.Entry<String,Book>> it = entry.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,Book> en = it.next();
			String key = en.getKey();
			Book val = en.getValue();
			System.out.println(key+":"+val);
		}
		//keySet()을 이용하여 value 확인
		//제네릭스 사용!
		Set<String> keys = map.keySet();
		Iterator<String> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Book val = map.get(key);
			System.out.println(key+"="+val);
		}
		
		
		
		
		
		
	}
}
//클래스 파일(.java) 내에 또 다른 클래스 선언 가능함.
//단! public 접근제한자 1개만 가능. 디폴트값(private)만 쓴다.
class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void prnBook() {
		System.out.println("printBook() call...");
		
	}
	@Override           //.오버라이딩도 가능하다.
	public String toString() {
		return "title=" + title;
	}
	//일반적인 클래스와 동일하다.
	
}
class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call...");
		
	}
	@Override
	public String toString() {
		return "Student";
	}
	
}
class Car{
	public void printCar() {
		System.out.println("printCar() call...");
	}

	@Override
	public String toString() {
		return "Car";
	}
}