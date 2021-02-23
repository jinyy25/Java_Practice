package com.abstracttest.model.vo;

public class Test extends Food{
	//기본생성자
	public Test() {}
	
	public Test(String kind, String name, String nation, int portion, int calory) {
	//부모생성자 호출
	super(kind, name, nation, portion, calory);
	}
	
	
}
