package com.poly.silsub1.shape.model;

public class Circle /*extends Shape*/implements IShape{
	private double radius;
	
	public Circle() {}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return (radius*radius*Math.PI);
	}

	@Override
	public double perimeter() {
		return (2*Math.PI*radius);
	}
	
	
}
