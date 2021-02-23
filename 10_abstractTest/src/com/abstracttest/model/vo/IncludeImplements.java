package com.abstracttest.model.vo;

//IncludeAbstract 상속
public class IncludeImplements extends IncludeAbstract{	
	//상속한 객체의 추상메소드가 있으면 반드시 Override해줘야함.
	//안해주면 사용을 못하게 됨.
	
	@Override
	public double calulator(int su, int su2) {
		return su/(double)su2;
	}

	@Override
	public String combine(String a, String b) {
		return null;
	}
	
	
}
