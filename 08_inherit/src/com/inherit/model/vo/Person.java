package com.inherit.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String phone;
	private char gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, 
			String address, String phone,char gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {						//Setter가 저장문 이므로
	
		if(name.length()>1) {								//객체 내에 조건문 형성 
			this.name = name;
		}else {
			System.out.println("이름은 두글자이상 작성해야합니다.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	
}
