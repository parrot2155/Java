package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.Circle;
import com.poly.silsub1.shape.model.IShape;
import com.poly.silsub1.shape.model.Rectangle;
import com.poly.silsub1.shape.model.Shape;
import com.poly.silsub1.shape.model.Triangle;

public class ShapeController {
	public void calcShape() {
		IShape s = null;
		//ctrl + shift + o : import관련해서 뜸. 바로 import할 수 있다.
		
		s = new Circle(10);
		System.out.println("면적 : "+s.area());
		System.out.println("둘레 : "+s.perimeter());
		
		s = new Triangle(10,5);
		System.out.println("면적 : "+s.area());
		System.out.println("둘레 : "+s.perimeter());
		System.out.println("======================================");
		
		IShape[] arr = new IShape[5];
		
		arr[0] = new Circle(13.2);
		arr[1] = new Rectangle(11.3,21.5);
		arr[2] = new Triangle(12.3,11.2);
		arr[3] = new Circle(5.12);
		arr[4] = new Triangle(22.1,10.5);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Triangle) { //i번째거가 삼각형인가?
				System.out.println("[삼각형]");
			}else if(arr[i] instanceof Rectangle) {
				System.out.println("[사각형]");
			}else if(arr[i] instanceof Circle) {
				System.out.println("[동그라미]");
			}
		
			System.out.println("면적 : "+arr[i].area());
			System.out.println("둘레 : "+arr[i].perimeter());
			System.out.println();
			
		}
		
	}
}
