package com.test.part02_OverridingTest.book;
///?????
public class Book {
	//필드
	private String title;
	private String writer;
	private int price;
	
	//생성자
	//기본생성자
	public Book () {}
	//매개변수 생성자

	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	//gettry setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title+" , "+writer+" , "+price;
	}
	
	//equal() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//두 객체의 주소가 같으면 같은 객체다.
		if(this == obj) {
			return true;
		}
		if(obj == null ) {
			return false;
		}
		
		//////////
		//전달받은 객체의 필드값과 현재 객체의 필드갑을 비교
		//형변환
		Book other = (Book)obj; 
		
		//원본의 제목이 null이면 비교할 객체의 제목도 null이어야 한다.
		//그렇지 않을 경우를 찾아서 false를 리턴한다.
		if(this.title == null) {
			if(other.title != null) {
				return false;
			}
		//두 객체의 타이틀이 저장된 값이 다른 경우를 찾아서 false를 리턴한다.
		}else if(!title.equals(other.title)) {
			return false;
		}
		
		
		
		//작가
		if(writer==null) {
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		//가격, 기본자료형
		if(price != other.price) {
			return false;
		}
		
		//모든 조건을 통과하면 두 객체는 같은 객체다.
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return(title+writer+price).hashCode();
	}
	
	
	
	
	
	
	
	
	
	
	
}
