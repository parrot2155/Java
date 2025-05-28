package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	public void test() {
		
		int[] arr = new int [3];
		
		//어레이리스트
		ArrayList alist = new ArrayList();
		
		//다형성
		List<Integer> list = new ArrayList<Integer>();; //데이터타입 고정시키기
		Collection clist = new ArrayList();
		
		
		//arraylist는 저장 순서 유지, 중복 가능.
		//index
		
		//추가
		alist.add("apple");
		alist.add(123); //autoboxing처리 , int -> autoboxing - > Integer
		alist.add(45.67);
		alist.add(new Date());
		
		
		System.out.println("alist : "+alist.toString());
		
		//인덱스로 접근
		//배열의 크기 : length
		//리스트의 크기 : size();
		for(int i=1;i<alist.size();i++) {
			//System.out.println(i+" : "+arr[i]);
			//값을 가져올 때는 get(index)를 가사용한다.
			System.out.println(i+" : "+alist.get(i));

		}
		
		//ArrayList는 중복 저장 허용
		alist.add("apple");
		System.out.println("alist : "+alist);
		
		alist.add(new String("apple"));
		System.out.println("alist : "+alist);
		
		//리스트 중간에 추가된다. 하나씩 뒤로 밀리는것 확인 가능하다.
		alist.add(1,"banana");
		System.out.println("alist: "+alist);
		
		//삭제
		alist.remove(2);
		System.out.println("alist : "+alist);
		System.out.println(alist.get(2));
		
		//수정
		alist.set(1, true);
		System.out.println("alist : "+alist);
		
		System.out.println(alist.size()+"개");
		alist.clear();
		System.out.println(alist.size()+"개");
		System.out.println(alist.isEmpty());//데이터가 있는지 없는지 판별
				
	}
	
	public void testSort() {
		//기본적으로 제공되는 sort()메소드, 오름차순 정렬된다.
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("banana");
		list.add("grape");
		
		System.out.println("list : "+list);
		
		//list.sort(null); //오름차순 정렬이 되버린다.//null-> 기본값
		Collections.sort(list);
		System.out.println("list : "+list);
		
		Iterator dIter = new LinkedList(list).descendingIterator();
		
		ArrayList descList = new ArrayList();
		
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		System.out.println("descList : "+descList);
		
	}
	
	
	
	
}









