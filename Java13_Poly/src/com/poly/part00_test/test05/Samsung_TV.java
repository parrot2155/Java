package com.poly.part00_test.test05;
//미완
public class Samsung_TV implements Tv{
	private int vol;
	
	
	public Samsung_TV() {
		System.out.println("SAMSUNG TV가 켜졌습니다.");
	}
	
	public Samsung_TV(int vol) {
		super();
		this.vol = vol;
	}

	//게터세터
	
	

	

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int volDown() {
		vol -=3;
		return vol;
	}
	
	@Override
	public int volUp() {
		vol +=3;
		return vol;
	}
	
}
