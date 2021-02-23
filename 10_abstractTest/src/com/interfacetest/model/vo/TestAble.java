package com.interfacetest.model.vo;

public interface TestAble {
	
	//상수형 필드를 가질수 있음
	public static final int age=19;
	String name="유병승";
		
	//매소드는 추상메소드만 가질 수 있음 
	//Override를 위해 public 접근제한자를 설정
	//기본적으로 메소드 선언하면 추상메소드로 보기 때문에 public abstract는 생략이 가능.
	
	//추상메소드  
	//묵시적으로 abstract 							
	public void test();
	
	//추상메소드 public abstract
	String getStr(String a);
	
	//매소드 구현부를 선언할 수 있나???
	default void whatHell(String why) {
		System.out.println(why);
	}
}
