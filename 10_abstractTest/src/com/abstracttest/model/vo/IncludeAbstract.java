package com.abstracttest.model.vo;

//추상클래스
public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
		
	//★★★★추상메소드가 포함되어있으면 반드시 추상클래스로 선언	
	//추상메소드로 선언된 메소드를 자식객체에 강제시킴
	//추상메소드는 선언부만 선언함, 구현부가 없음		
	
	//추상메소드 : 접근제한자 abstract 반환형 메소드명(매개변수);
	public abstract double calulator(int a, int b);
	public abstract String combine(String a, String b);

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
