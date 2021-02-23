package com.oop.model.vo;

//데이터 보관용 클래스
public class Student {
	
	private String name;
	private int grade;
	private int classRoom;
	private int classNo;
	private double height;
	private double weight;
	
	public Student() {}
	
	public Student(String name, int grade, int classRoom, 
			int classNo, double height, double weight) {
		this.name=name;
		this.grade=grade;
		this.classRoom=classRoom;
		this.classNo=classNo;
		this.height=height;
		this.weight=weight;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom=classRoom;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassNo(int classNo) {
		this.classNo=classNo;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	
	
}








