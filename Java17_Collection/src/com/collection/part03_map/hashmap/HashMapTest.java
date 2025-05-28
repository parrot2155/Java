package com.collection.part03_map.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void test() {
		//HashMap Test
		HashMap hmap = new HashMap();
		
		//put(key,value), key,value
		hmap.put("one",new Date());
		hmap.put(12,"red apple");//12=>Integer객체
		hmap.put(34, 123);
		//key, value모두 반드시 객체여야 한다.
		
		//어떤 순서로 입력되었든 순서 상관 없이 저장된다.
		
		System.out.println("hmap : "+hmap);
		
		hmap.put(12, "yellow banana");//동일한 키값을 지정할 떄 원래 값이 지워지고 내용이 들어간다.
		//=> 키는 중복 허용 안한다.
		System.out.println("hmap : "+hmap);
		
		hmap.put(11, "yellow banana");
		hmap.put(19, "yellow banana");//키값 다르면 역시 잘 추가된다.
		System.out.println("hmap : "+hmap);
		
		
		//value 가져오기
		 System.out.println(hmap.get(19));
		 
		 //삭제하기
		 hmap.remove(19);
		 System.out.println("hmap : "+hmap);//그 키를 갖고있는 엔트리 자체가 삭제됨.
		 
		 //갯수확인
		 System.out.println("hmap에 저장된 객체 수 : "+hmap.size());
		
	}
	public void test2() {
		//map에 저장된 객체 연속 처리
		
		//메실차 맛있네
		HashMap map = new HashMap();
		map.put("one","비타500");
		map.put("two","더벤티");
		map.put("three","핸드크림");
		map.put("four","에어팟");
		map.put("five", "칫솔");
		
		//1. keySet() - key만 set으로 만든다.
		
		Set keys = map.keySet();
		Iterator keyIt = keys.iterator();//줄세웠다. 하나씩 가져오기만 하면 됨.
		while(keyIt.hasNext()) {
			String key = (String) keyIt.next();//가지고 오는 오브젝트의 타입도 맞춰줘야 한다.
			String val = (String) map.get(key);//키값이 만약 string이 아니면 오루가 발생한다.
			System.out.println(key+"="+val);
		}
		
		//2. entrySet() - Map의 내부 클래스 Map.Entry를 set으로 만든다.
		Set set = map.entrySet();
		Iterator entryIt = set.iterator();
		while(entryIt.hasNext()) {
			Map.Entry entry = (Map.Entry) entryIt.next(); //entry를 가지고 온다.//오브젝트로 가지고 오다 보니까 형변환을 자주한다.
			
			//System.out.println(entry.getKey()+"="+entry.getValue());
			
			String key = (String)entry.getKey();
			String val = (String)entry.getValue();
			System.out.println(key+"="+val);//변수에 한번 더 담았다.
			//맵에 저장될때 엔트리 객체로 저장된다.

		}
		
		//3. vlaues() - 저장된 vlaue값들만 Collection으로 만든다.
		Collection values = map.values();//밸류값들만 있다. 
		
		//iterator(), toArray()
		Object[] arr = values.toArray();
		for(int i=0;i<arr.length;i++) {
			String val = (String)arr[i]; //배열 안에는 밸류값들만 들어있음. 형변환(String) 필요
			System.out.println(val);
			
		}
		
	}
	
	public void test3() {
		//score클래스 객체 생성하며 map에 저장
		HashMap map = new HashMap();
		
		map.put("1", new Score("태욱",100));
		map.put("2", new Score("태울",90));
		map.put("3", new Score("태웅",80));
		
		System.out.println(map);
		
		map.clear();//초기화
		map.put(new Score(),"one");
		map.put(new Score("태욱",100), "one");
		map.put(new Score("태울",90), "one");
		map.put(new Score("태웅",80), "one");
		
		System.out.println(map);//map의 값을 또 다른 map의 키로 사용하기.
		
		map.put(new Score("태욱",100), "one");//그냥은 새로 입력한 값이 기존거랑 다른애인지 인식을 못한다. 그래서 score클래스에 hashcode오버라이드를 해줬다.
		
		System.out.println(map);
		
		map.put("key", new Score());
	}
	
}











