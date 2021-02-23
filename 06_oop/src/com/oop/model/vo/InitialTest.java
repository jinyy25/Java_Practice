package com.oop.model.vo;

//초기화 테스트
public class InitialTest {
	//멤버변수
	private String name="안녕";			//null
	private int size=180;				//0
	private int id;						//1순차적로 1더해서 부여
	
	//priavte : 외부에서 수정이 불가능
	private static int count;
		
	//초기화 블록을 설정하여 초기값을 변경하기 : 객체를 new연산자로 생성을 할때 실행되는 로직
	{
		this.name+="Rclass";
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("초기화블록실행!");
	}
	
	//static 초기화 블록 : 프로그램이 런타임될때, 1번만 실행
	//멤버변수, 멤버메소드의 호출 불가능
	static {
		//this.name="하하";
		InitialTest.count=100;
		System.out.println("static초기화블럭 실행!");
	}
	
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}

}
