package com.override.model.vo;

public class Dog extends Animal{
	
	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	

	//오버라이딩처리  : 변경 재정의	
	//매소드 선언부는 부모의 매소드와 동일하게 작성
	//구현부 각 객체에 맞게 로직을 구성
	
	//매소드선언부 위에 어노이테션 Override
	@Override
	public String bark() {
		return "에프에프에프";
	}
	@Override
	public String info() {
		return "재정의";
	}
	
//	@Override 
//	public double calculator(int su,int su2, int su3) {
//		return su*su2;
//	}
	
}






