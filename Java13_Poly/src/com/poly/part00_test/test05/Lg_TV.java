package com.poly.part00_test.test05;

public class Lg_TV implements Tv{
	private int vol;
	
	public Lg_TV() {
		System.out.println("LG TV가 켜졌습니다.");
	}
	
	

	public Lg_TV(int vol) {
		super();
		this.vol = vol;
	}



	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void closed() {
		System.out.println("LG TV가 꺼졌습니다");
	}

	@Override
	public int volUp() {
		vol += 1;
		return vol;
	}

	@Override
	public int volDown() {
		vol -= 1;
		return vol;
	}
	
	
	
	
}
