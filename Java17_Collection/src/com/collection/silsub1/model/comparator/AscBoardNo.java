package com.collection.silsub1.model.comparator;

import java.util.Comparator;

import com.collection.silsub1.model.vo.Board;

public class AscBoardNo implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		
		return o1.getBoardNo()-o2.getBoardNo();
	}
	
	
	
	
	
	
}
