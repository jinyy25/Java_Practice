package com.oop.model.vo;

class DefaultTest {
	//default 접근제한자 사용 : default는 같은 패키지 내에서만 객체 활용이 가능	
	
	//public static int a;
	
	//멤버변수(인스턴스) 초기화블록
	//같은 패키지에서 멤버변수 직접접근하기
	{
		FieldAccessTest fct=new FieldAccessTest();
//		fct.publicInt=200;
//		fct.protectedChar='여';
//		fct.defaultString="이건?";
//		fct.privateDouble=180.5;	
	}
}
