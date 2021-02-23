package com.generic.model.vo;

public class Student {

	private String name;
	private int grade;
	private int calssRoom;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int grade, int calssRoom) {
		super();
		this.name = name;
		this.grade = grade;
		this.calssRoom = calssRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCalssRoom() {
		return calssRoom;
	}

	public void setCalssroom(int calssRoom) {
		this.calssRoom = calssRoom;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", calssRoom=" + calssRoom + "]";
	}
	
	
}
