package com.test01.run;

import com.test01.model.Book;
import java.util.Scanner;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Book b1 = new Book("웹캠","빨간불","에어팟프로",300000);
		
		//객체 배열
		Book[] b = new Book[5];		
		b[0] = new Book("어린왕자","생택쥐페리","문학동네",8000);
		b[1] = new Book("동화","그림형제","책방",12000);
		b[2] = new Book("치약","칫솔","카누",5000);
		b[3] = new Book("커피믹스","립밤","핸드폰",13000);
		b[4] = new Book("웹캠","빨간불","에어팟프로",300000);
		
		Book[] bk = {
						new Book("어린왕자","생택쥐페리","문학동네",8000),
						new Book("동화","그림형제","책방",12000),
						new Book("치약","칫솔","카누",5000),
						new Book("커피믹스","립밤","핸드폰",13000),
						new Book("웹캠","빨간불","에어팟프로",300000),
						b1
					};
		System.out.println(bk); // bk=> 참조형+Book클래스의 배열을 의미
		System.out.println(bk[1]);//bk[idx] = > 참조형, Book 객체
		System.out.println(bk[1].getPrice());//bk[idx].getPrice() => 정수(기본자료형),
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].info());
			}
		}
		
		
		
		
	}

}
