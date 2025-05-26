package com.poly.silsub1.shape.model;

public class Triangle /*extends Shape*/implements IShape{
	private double base;
	private double height;
	
	public Triangle() {}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return (base*height)/2;
	}

	@Override
	public double perimeter() {
		double hypo = Math.sqrt(base*base+height*height);//Math.sqrt : 제곱근
		return base+height+hypo;
	}
	
	
	
}
