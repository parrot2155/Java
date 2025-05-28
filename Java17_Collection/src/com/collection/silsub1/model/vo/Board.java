package com.collection.silsub1.model.vo;

import java.io.Serializable;
import java.util.Date;

//vo(value object) or dto(data transfer object) 라고 줄여부른다.
//전송시에 사용할 객체

public class Board implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5716539748787584395L;
	
	//게시글
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	
	public Board() {}

	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	@Override
	public String toString() {
		return "번호=" + boardNo + ", 제목=" + boardTitle + ", 작성자=" + boardWriter
				+ ", 작성일=" + boardDate + ", 내용=" + boardContent;
	}
	
	
}
