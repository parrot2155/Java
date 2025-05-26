package com.test02.controller;

import java.util.Scanner;

import com.test02.model.vo.Person;

public class PersonController {
	private Person[] p = new Person[3];
	Scanner sc = new Scanner(System.in);
	 public void insertPerson() {
		 //회원 추가
		 for(int i=0;i<3;i++) {
			 System.out.println("== 회원 정보 입력 ==");
			 System.out.println("이름 : ");
			 String name = sc.next();
			 System.out.println("나이 : ");
			 int age = sc.nextInt();
			 System.out.println("재산 : ");
			 int wealth = sc.nextInt();
			
			 p[i] = new Person(name,age,wealth);
		 }
		 
	 }
	 
	 public void printPerson() {
		 //회원 전체 조회
//		for(int i=0;i<p.length;i++) {
//			System.out.println(p[i].info());
//		}
		 
		 //향상된 for문
		 for(Person people : p) { //p안의 값을 하나씩 people변수 안에 담는다.
			 System.out.println(people.info());
		 }	 
	 }
	 
	 public void avgWealth() {
		 //회원 평균재산
		 int sum = 0;
		 for(Person people : p) {
			 sum += people.getwealth();
		 }
		 System.out.println("평균 재산 : "+(sum/p.length));
	 }
	 
	 public void searchName() {
		 //키뵈드로 입력받은 이름과 같은 회원을 찾아 
		 //화면에 출력
		 System.out.println("찾을 이름 입력 : ");
		 String searchName = sc.next();
		 
		 for(int i=0; i<p.length; i++) {
			if(p[i].getName().equals(searchName)) {
				System.out.println(p[i].info());
			}else {
				System.out.println("찾는 이름이 없습니다.");
			}
		 }
	 }
}

//MVC : M-model데이터와 관련된 작업들.예를들어 데이터베이스 , V=view요청을 받고 출력을 응답하는것,  C=controller요청을 받아서 어떻게 동작할지

//view -프론트엔드/백엔드- model - model - DB  (비슷하게나마 구현을 해봤음.)
			