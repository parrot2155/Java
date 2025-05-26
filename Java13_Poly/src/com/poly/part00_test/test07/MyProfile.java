package com.poly.part00_test.test07;

public class MyProfile extends Profile implements Display, Job { //여러개 인터페이스 상속받기
	private String loc;
	
	public MyProfile(String name, String phone) { //profile에 기본 생성자가 없어서 만들어야함. 부모클래스 생성자를 호출하는 코드가 꼭 들어가야 한다.
		super(name,phone);						  //기본생성자 못만들고 강제로 값을 넘겨주도록 만들 수 있는거임
	}

	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사 주소 : "+loc);
		System.out.println("회사 직종 : "+ jobId);
	}
		
	
	
}
