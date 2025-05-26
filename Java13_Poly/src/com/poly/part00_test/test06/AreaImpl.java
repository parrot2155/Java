package com.poly.part00_test.test06;

public abstract class AreaImpl implements Area{ //구현하기 싫을 땐 같이 추상abstract 시키면 된다.
	
	private String result;
	
	
	@Override
	public void print() {
		System.out.println(Area.print + result);
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	
	
	
}











