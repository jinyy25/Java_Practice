package com.abstracttest.model.vo;

public class Recipe extends Food{
	
	public Recipe() {}
	
	public Recipe(String kind, String name, String nation, int portion, int calory) {
	//부모생성자를 호출
	super(kind, name, nation, portion, calory);
	}
	
	public void cooking() {
		System.out.println("요리중 ... 지지고 볶고....");
	}

}
