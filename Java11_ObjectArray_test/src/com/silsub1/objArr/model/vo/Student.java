package com.silsub1.objArr.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	public Student () {}
	public Student(int grade, int classrom, int number, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.name = name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String information() {
		return grade+"학년 "+classroom+"반 "+number+"번 "+name;
	}
	
}
