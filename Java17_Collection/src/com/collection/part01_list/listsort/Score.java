package com.collection.part01_list.listsort;

public class Score implements Comparable<Score>{
	//필드
	private String name;
	private int point;
	
	//생성자
	public Score() {}

	public Score(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	//게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	//투-스트링
	@Override
	public String toString() {
		return "Score [name=" + name + ", point=" + point + "]";
	}

	@Override
	//name기준 오름차순 정렬. String오름차순
	public int compareTo(Score o) {
		//비교되는 두 값을 기준으로 
		//양수를 리턴하면 바꾼다. 음수를 리턴하면 안바꾼다.
		
		String otherName = o.getName();
		
		return name.compareTo(otherName);//name과 othername을 비교한다.
		//음수 자리 바꾸지 않겠다.
		//양수 자리 바꾸겠다.
		//0 제자리
		
		//String의 기본정렬 기준인 오름차순을 그대로 따라서
		//name 오름차순 정렬 된다.
		
		//"나".compareTo("가"); ==>양수 리턴
		//바꿀꺼면 양수 그대로 리턴.
		//안바꿀꺼면 음수 리턴.
	}//얘를 오버라이딩 해야됨.리턴값만 잘 정해줘야된다.
	
	
}
