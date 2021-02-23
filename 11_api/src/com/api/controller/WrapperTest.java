package com.api.controller;

public class WrapperTest {

	public static void main(String[] args) {
		
		//Wrapper클래스 : 자동으로 형변환하여 기본자료형으로 변경
		//기본자료형도 필요에 따라 자동으로 Wrapper클래스로 변경가능
			int age=19;
			Integer ageW=age;
			System.out.println(ageW);
		
			int su=ageW;
			printTest(su);	
				
			double height=180.5;
			Double dheight=height;
			System.out.println(dheight);
			printTest(height);
			
			
		//wrapper클래스의 유용한 메소드		
		//1. 숫자형식의 문자값을 숫자형으로 변경 : wrapper클래스명.parse wrapper클래스명(변경할문자);
			String test="2020";
			//test문자를 int형으로 변경
			int year = Integer.parseInt(test);					
			System.out.println(year);			
				
			test="65.5";
			double weight=Double.parseDouble(test);							//test문자를 double형으로 변경	
			System.out.println(weight);					
			
			//Integer.valueOf();
			//int a=Integer.valueOf(test);
			//System.out.println(a);
		
			
		//2. 다른 자료형을 문자형으로 변경 : String.valueOf();
				test=String.valueOf(age);
				System.out.println(test);									//test의 int를 다시 문자형으로 변경
				
				test=String.valueOf(height);	
				System.out.println(test);
	}
	
	//Ingeger의 부모는 Object
	public static void printTest(Object obj) {
		System.out.println(obj instanceof Integer);
	}

}
