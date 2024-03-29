package com.student.model.vo;

public class Student {
	private String name;
	private int grade;
	private int ban;
	private int number;
	private String address;
	private String phone;
	private Grade gradePoint;//객체 has a 관계!
	
	//기본 생성자 
	public Student() {}
	//매개변수있는 생성자
	public Student(String name, int grade, int ban, int number, String address, String phone) {
		this.name=name;
		this.grade=grade;
		this.ban=ban;
		this.number=number;
		this.address=address;
		this.phone=phone;
	}
	
	//getter/setter만들기
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setBan(int ban) {
		this.ban=ban;
	}
	public int getBan() {
		return ban;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setGradePoint(Grade grade) {
		this.gradePoint=grade;
	}
	public Grade getGradePoint() {
		return gradePoint;
	}
	
	public String information() {
		return name+" "+grade+" "+ban
				+" "+number+" "+address
				+" "+phone;
	}

	
	
	
	
	
	
	
	
	
	
	
}
