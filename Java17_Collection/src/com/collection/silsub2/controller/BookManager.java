package com.collection.silsub2.controller;

import java.util.Scanner;

import com.collection.silsub2.model.dao.BookDao;
import com.collection.silsub2.model.vo.Book;

public class BookManager {
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		try {
			book.setbNo(bd.getLastNo()+1);
		}catch(IndexOutOfBoundsException e) {
			book.setbNo(1);
		}
		bd.addBook(book);
		

	}
	
	
	
	
	
}
