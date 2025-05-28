package com.collection.part01_list.listsort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {
	public void test() {
		List list = new ArrayList();
		
		list.add(new Score("홍길동",99));
		list.add(new Score("박태욱",50));
		list.add(new Score("김이박",70));
		
		list.add(new Score("박길동",59));
		list.add(new Score("이태욱",78));
		list.add(new Score("최이박",63));
		
		//System.out.println("list : "+list);
		
//		Collections.sort(list);	//정렬기준이 정해져있지 않다.
//		System.out.println("list : "+list);
		
		//1. Compareable - 기본 정렬 기준 구현
		//해당 클래스(객체를 생성하는 킅래스,Score)에 구현
		//Score객체 정렬해!
		//2. Compareator - 기본 정렬 기준 이외 다른 정렬 기준 구현
		//새로운 클래스에 구현
		//Score객체 나이 오름차순 정렬해!
		
		//list안의 객체 정렬
		list.sort(null); //이름 오름차순
		System.out.println("List : "+list);
		
		list.sort(new PointAsc());//점수 오름차순
		System.out.println("List : "+list);
		
		//이름 내림차순, 점수 내림차순 정렬을 할 수 있게 
		//클래스 생성하고 그 기준에 맞게 완성해보자.
		
		list.sort(new NameDesc()); //이름 내림차순
		System.out.println("List : "+list);

		////
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new PointDesc());//점수 내림차순
		System.out.println("List : "+list);
		
	}
}
