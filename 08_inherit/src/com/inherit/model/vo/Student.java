package com.inherit.model.vo;

public class Student extends Teacher {//있다.
	//이름 나이 주소 전화번호 학년 반 번호
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classRoom;
	private int number;
	
	//1. 기본생성자 만드는 단축키 : ctrl+space+enter
	public Student() {}
	
	//2. 매개변수있는 생성자 : alt+s+a+g
//	public Student(String name, int age, String address, 
//			String phone, char gender, int grade, int classRoom, int number) {
	public Student(int grade, int classRoom, int number) {
		
		//super();
	//3. 부모의 생성자를 호출
		//super();//부모의 기본생성자를 호출
		
		//super(name,age,address,phone,gender);//부모의 매개변수있는 생성자를 호출
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
		
//		if(name.length()>2) {
//			this.name = name;
//		}
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
	}
	
	//setter/geter만들기 : alt+s+r+a+r
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		if(name.length()>2) {
//			this.name = name;
//		}
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return "자식!";
	}
	
	
	
	//자식객체에서 부모객체 변수에 접근하기
	public String information() {
		
		
		//부모객체에 접근하는 방법 -> super.get변수()
		//부모변수의 접근제한자가 private 이면
		//getter/setter를 이용해서 접근해야함.							
		return super.getName()+" "+super.getAge()+" "+
					super.getAddress()+" "+super.getPhone()+" "+
					super.getGender()+" "
					+grade+" "+classRoom+" "+number;
	}
	
	
	
	
	
}
