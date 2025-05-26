package com.test01.run;

import com.test01.model.Book;
import java.util.Scanner;

public class ObjectTest {

	public static void main(String[] args) {
		Book b1 = new Book("어린왕자","생택쥐페리","문학동네",8000);
		Book b2 = new Book("동화","그림형제","책방",12000);
		Book b3 = new Book("치약","칫솔","카누",5000);
		Book b4 = new Book("커피믹스","립밤","핸드폰",13000);
		Book b5 = new Book("웹캠","빨간불","에어팟프로",300000);
		
		System.out.println(b1.info());
		System.out.println(b2.info());
		System.out.println(b3.info());
		System.out.println(b4.info());
		System.out.println(b5.info());
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		if(b1.getTitle().equals(searchTitle)) {
			System.out.println(b1.info());
		}else if(b2.getTitle().equals(searchTitle)) {
			System.out.println(b2.info());
		}else if(b3.getTitle().equals(searchTitle)) {
			System.out.println(b3.info());
		}else if(b4.getTitle().equals(searchTitle)) {
			System.out.println(b4.info());
		}else if(b5.getTitle().equals(searchTitle)) {
			System.out.println(b5.info());
		}else {
			System.out.println("일치하는 책이 없습니다.");
		}
		
	}

}














