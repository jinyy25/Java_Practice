package com.override.model.vo;

//ValueObject/DTO Data Trasfer Object
public class Animal {
	
	private String category;
	private String name;
	private char gender;
	private String diet;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	// atl+s+a+g
	public Animal(String category, String name, char gender, String diet) {
		super();
		this.category = category;
		this.name = name;
		this.gender = gender;
		this.diet = diet;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}
	
	//메소드의 final예약어는 Override를 불허함.
	//public final String bark() {
	public String bark() {
		return "니가 뭔줄알고 짖어!";
	}
	
	protected String info() {
		return category+" "+name+" "+gender+" "+diet;
	}
	
	public double calculator(int a, int b) {
		return a+b;
	}
	
	
}





