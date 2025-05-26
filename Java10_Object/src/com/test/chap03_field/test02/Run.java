package com.test.chap03_field.test02;

public class Run {

	public static void main(String[] args) {
		InitBlock i = 
				new InitBlock("iPhone",200,"apple");
		i.information();
		
		InitBlock i2 = new InitBlock();
		i2.information();
		i.information();
		
		i2.savePName("sam");
		i2.information();
	}

}
