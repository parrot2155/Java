package com.collection.silsub2.view;

import java.util.Scanner;

import com.collection.silsub2.controller.BookManager;
import com.collection.silsub2.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호 선택[1~6] : ");
			
			int num = sc.nextInt();
			switch(num) {
			case 1:
				Book b = inputBook();
				bm.addBook(b);
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("프로그램 종료");
				return;
			}
		
		
		}
		
	}


	private Book inputBook() {
		System.out.println("[새 도서 추가하기]");
		
		System.out.println("도서 제목: ");
		String title = sc.nextLine();
		System.out.println("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4.기타): ");
		int category = sc.nextInt();
		System.out.println("도서 저자: ");
		String author = sc.nextLine();
		return new Book(category, title,author);
	}
	
}
