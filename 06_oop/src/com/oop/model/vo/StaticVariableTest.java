package com.oop.model.vo;

//static(클래스)변수 테스트
public class StaticVariableTest {
	//멤버변수에 static예약어를 사용하면 static변수, 클래스변수로 활용됨.
	
	//1. 클래스변수 : 프로그램 시작과 동시에 메모리공간(static)에 할당됨
	//			      변수접근 -> 클래스명.변수명
	private static String name;
	
	
	//2. 멤버변수 : 클래스가 new연산자를 통해 객체화(생성) 됐을때 할당(HEAP)
	//		     Stack영역은 데이터를 읽을때 마다 쓰고 닫는 역할
	private int su;

	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	//static변수에 접근하기 위한 getter/setter
	public static String getName() {
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//this.name=name;
		//StaticVariableTest.name=name;
	}
	
	
	
}
