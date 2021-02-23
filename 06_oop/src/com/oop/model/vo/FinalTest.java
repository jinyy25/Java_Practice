package com.oop.model.vo;


//final테스트 
public class FinalTest {
	//final : 상수 한번 값을 대입하고 변경할수 없은 변수 상수
	//final은 반드시 초기화를 해줘야함.
	public final int ID;
	public static final int ID2;
	
	//초기화 블럭
//	{
//		ID=200;
//	}
	
	//static 초기화블럭으로 초기화
	static {
		ID2=200;
	}
	
	//생성자로 초기화
	public FinalTest() {
		ID=300;
		//ID2=200;
	}
	
	
	
}
