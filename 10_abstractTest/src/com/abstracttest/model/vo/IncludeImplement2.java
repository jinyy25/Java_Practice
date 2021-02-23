package com.abstracttest.model.vo;

//IncludeAbstract로부터 상속
public class IncludeImplement2 extends IncludeAbstract{
	
	//상속받은 부모메소드 재작성
	@Override 									
	public double calulator(int a, int b) {
		return a*b;
	}

	@Override
	public String combine(String a, String b) {
		return null;
	}	

}
