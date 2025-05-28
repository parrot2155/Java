package com.collection.part01_list.listsort;

import java.util.Comparator;

public class NameDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String point1 = ((Score)o1).getName();
		String point2 = ((Score)o2).getName();
		//안바꾸겠다.->음수
		//바꾸겠다. ->양수
		
		return -point1.compareTo(point2);
		
	}

	
}
