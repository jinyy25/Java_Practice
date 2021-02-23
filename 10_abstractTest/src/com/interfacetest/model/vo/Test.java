package com.interfacetest.model.vo;

import java.io.Serializable;

//Interface의 다중상속!
public class Test  implements TestAble, TestAble2, Serializable{
					//interface는 다중구현이 가능하다(override 필수)
	
	private String name;
	private int age;
	
	public Test() {}
		
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Override를 통한 재정의
	//TestAble3의 기능
	@Override
	public double calculator(double a, double b) {
		return (a*b+a+b/2)*0;
	}
	//TestAble기능
	@Override
	public void test() {
		System.out.println("구현된 테스트!");
	}
	@Override
	public String getStr(String a) {
		return a+" BS";
	}
	//TestAble2기능
	@Override
	public void testable2(String a, int b) {
		System.out.println("이름은 "+a+"나이는"+b);
	}
	
	//기본 매소드
	public void otherMethod() {
		System.out.println("난 달라!");
	}
	public void otherMethod2() {
		System.out.println("나도 달라!");
	}

	//get/set 구문
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
