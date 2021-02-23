package com.oop.model.vo;

//멤버변수의 접근테스트
public class FieldAccessTest {
	
	//접근제한자 예약어 자료형 변수명[= 값];
	//public static String name;
	//public int publicInt;
	private int publicInt=20;				//default : 0
	//protected char protectedChar;
	private char protectedChar='A';			//default : ' '
	//String defaultString;
	private String defaultString="오호~";		//default : null
	private double privateDouble=180.5;		//default : 0.0
	//public int age;
	private int age=180;
	
	//필드의 자료형은 자바에서 사용하는 모든 자료형 사용가능
	private int[] intArr=new int[10];
	//private DefaultTest test=new DefaultTest();
		
	{
		publicInt=200;
		protectedChar='중';
		defaultString="이거!";
		privateDouble=180.5;
	}
	
	//변수에 접근해서 데이터를 가져가고, 변수의 값을 수정할 수 있는 메소드 
	//변수는 1:2로 만들어져야함 getter(가져가는것)/setter(데이터 대입)
	
	
	//접근제한자 변수자료형(반환형)
	//||void get변수명(){    } 
	//|| set변수명(변수자료형 변수명){     }
	
	//getter : 변수값을 가져오는 기능
	public int getAge() {
		return this.age;//멤버변수호출
	}
	//setter : 변수에 값을 넣는 기능
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
	}
	

	
}





