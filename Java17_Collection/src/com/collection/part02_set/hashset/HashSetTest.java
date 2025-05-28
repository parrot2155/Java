package com.collection.part02_set.hashset;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public void test() {
		HashSet hset = new HashSet();
		//Set hset2 = new HashSet();
		
		//데이터 추가
		//객체만 저장 가능하다.
		hset.add("Java");
		hset.add(123);	//wrapper클래스로 객체화되어 저장(auteboxing)
		hset.add(45.67);
		hset.add(new Date());
		//다 들어간다.
		
		System.out.println("hset : "+hset);
		
		hset.add("Java");//똑같은 내용은 안들어감
		hset.add(123);
		System.out.println("hset : "+hset);
		System.out.println("저장된 객체 수"+hset.size());
		System.out.println("포함 확인 : "+hset.contains(123));
		
		//저장된 객체를 하나씩 접근
		//set객체는 인덱스가 없 고 순서가 없다.
		//그럴땐?
		//Iterator()메소드 : 저장된 객체를 목록으로 만들었다.줄을 세운다.
		Iterator it = hset.iterator();//목록이 줄이 세워진 채로 만들어질거임.타입 자체가 Iterator타입임.
		while(it.hasNext()) {
			System.out.println(it.next());
		}//Iterator<-얘는 일회용임.
		
		//toArray()사용
		Object[] ar = hset.toArray();
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+":"+ar[i]);
		}
		
		//삭제
		hset.remove(123);
		System.out.println(hset);
		hset.clear();
		System.out.println("없나?>"+hset.isEmpty());
		
	}
	
	public void test2() {
		//데이터 중복 저장
		Set<Menber> set = new HashSet<Menber>();
		//<Menber> => 제네릭 Generic
		
		set.add(new Menber("박태욱",35,"010-1234-4568"));
		set.add(new Menber("김태욱",25,"010-4321-2352"));
		set.add(new Menber("이태욱",15,"010-2566-2353"));
		
		//set.add(set);에러발생. 지금 set에는 Menber클래스 객체만 저장 가능.
		System.out.println(set);
		
		set.add(new Menber("박태욱",35,"010-1234-4568"));
		set.add(new Menber("김태욱",25,"010-4321-2352"));
		
		System.out.println(set);//중복을 허용하지 않는다.
		
		//hashcode, equals 를 오버라이딩
		
		
		
		
		
		
	}
}
