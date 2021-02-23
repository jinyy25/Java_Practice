package com.inherit.model.vo;


//상속을 이용하여 필요한부분만 구현을 하고 다른것은 다른 객체에서 가져와쓸 수 있음
public class Teacher extends Person{
	//이름, 나이, 주소, 전화번호, 과목, 전공
	private String subject;
	private String major;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
