package com.collection.part01_list.listsort;

import java.util.Comparator;

//점수 오름차순
public class PointAsc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int point1 = ((Score)o1).getPoint();
		int point2 = ((Score)o2).getPoint();
		//안바꾸겠다.->음수
		//바꾸겠다. ->양수
		
		//return point1-point2;
		if(point1 > point2) {
			return 1;
			//point1.이 더 크기 때문에 자리를 바구기 위해 양수 리턴.
		}else if(point1<point2) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
