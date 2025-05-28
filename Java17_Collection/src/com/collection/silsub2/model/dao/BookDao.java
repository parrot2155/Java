package com.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.collection.silsub2.model.vo.Book;

public class BookDao {
	private ArrayList<Book> list = new ArrayList<Book>();
	
	public int getLastNo() {
		return list.get(list.size()-1).getbNo();
	}
	public void addBook(Book book) {
		list.add(book);
	}
}
