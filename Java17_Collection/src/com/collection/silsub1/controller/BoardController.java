package com.collection.silsub1.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

//view -> controller -> model{dao}

import java.util.Scanner;

import com.collection.silsub1.model.comparator.AscBoardNo;
import com.collection.silsub1.model.comparator.DescBoardNo;
import com.collection.silsub1.model.dao.BoardDao;
import com.collection.silsub1.model.vo.Board;

public class BoardController {
	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);
	
	public void write() {
		//게시글 작성 및 추가
		System.out.println("[새 게시글 쓰기]");
		
		System.out.println("글제목 : ");
		String title = sc.nextLine();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.println("내용(exit 입력 시 종료) : ");
		String content = "";
		String str = "";
		
		while(true) {
			str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			content += str;
		}
		
		try {
			Board b = new Board(bd.getLastNo()+1, title, writer,new Date(), content);
			bd.write(b);
		}catch(IndexOutOfBoundsException e) {
			//해당 예외가 발생하는 경우는 list의 객체가 하나도 없을 경우 발생한다.
			Board b = new Board(1, title, writer,new Date(), content);
			bd.write(b);
		}

	}
	
	public void displayAll() {
		List<Board> list = bd.displayAll();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void saveList() {
		bd.saveList();
	}
	
	public void displayOne() {
		//게시글 번호를 입력받아 
		//해당 게시글 출력
		try {
			System.out.println("몇 번째 줄을 출력할까요?");
			Board res = bd.displayOne(sc.nextInt());
			System.out.println(res);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("해당 번의 줄에 데이터가 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
	}
	public void updateTitle() {
		//수정하려는 게시글 번호를 입력받는다.
		//변경하고자 하는 제목을 입력받는다.
		//dao로 수정작업 진행한다.
		
		System.out.println("수정할 게시글 번호를 입력 : ");
		int no = sc.nextInt();
		sc.nextLine(); //이거 없으면 위에서 엔터친게 콘솔에 남아있어서 다음 동작이 그냥 넘어가버리니까 이걸 넣어서 한번 날려준다.
		
		Board board = bd.displayOne(no);
		if(board == null) { 
			System.out.println("수정하려는 글이 없습니다.");
		}else {
			System.out.println("변경할 내용은? :  내용은? : ");
			String title = sc.nextLine();
			//수정할 작업 진행
			bd.updateTitle(no, title);
		}
	}
	public void updateContent() {
		System.out.println("수정할 게시글 번호를 입력 : ");
		int no = sc.nextInt();
		sc.nextLine(); //이거 없으면 위에서 엔터친게 콘솔에 남아있어서 다음 동작이 그냥 넘어가버리니까 이걸 넣어서 한번 날려준다.
		
		Board board = bd.displayOne(no);
		if(board == null) { 
			System.out.println("수정하려는 글이 없습니다.");
		}else {
			System.out.println("변경할 내용은? : ");
			String content = sc.nextLine();
			//수정할 작업 진행
			bd.updateContent(no, content);
		}
	}
	
	public void delete() {
		System.out.println("삭제할 게시글의 번호를 입력해주세요.");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayOne(no);
		if(board == null) { 
			System.out.println("수정하려는 글이 없습니다.");
		}else {
			System.out.println("정말로 삭제하시겠습니까?(y/n):");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch=='Y') {
				bd.delete(no);
				System.out.println(no+"번 게시글 삭제 완료.");
			}
			
		}
	}
	
	public void search() {
		//검색할 게시글릐 제목 입력
		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();
		
		//검색
		ArrayList<Board> res = bd.search(title);
		
		if(res.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Board b : res) {
				System.out.println(b);
			}
		}
	}
	public void sortList(int field, boolean isAsc) {
		//매개변수
		//정수값 : 어떤 필드를 정렬할지
		//논리값 : true -> 오름차순, false -> 내림차순
		List<Board> list = bd.displayAll();
		
		switch(field) {
		case 1:
			//field == 1 -> boardNo로 정렬하겠다.
			if(isAsc) {
				///true일 때 
				//오름차순 하겠다.
				list.sort(new AscBoardNo());
			}else {
				//내림차순 하겠다.
				list.sort(new DescBoardNo());
			}
			break;
			
		}
		//정렬 후 리스트 출력
		for(Board b : list) {
			System.out.println(b);
		}
		
	}
}











