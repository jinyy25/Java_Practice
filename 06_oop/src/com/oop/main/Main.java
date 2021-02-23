package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
import com.oop.model.vo.Member1;
//import com.oop.model.vo.DefaultTest;//not visible -> 접근제한자에 의해 접근 제한됐을때 나오는 에러
//import com.oop.model.vo.ABCTest;
import com.oop.model.vo.StaticVariableTest;

public class Main {
	
	
	//객체 접근가능여부 확인 : 생성 가능한지 확인
	public static void main(String[] args) {
		
		//객체생성구문 : new com.oop.model.vo.AccessTest();
		new AccessTest();
		
		//접근제한자가 default클래스 생성 : new DefaultTest();
		
		//필드 접근테스트 : FieldAccessTest클래스를 객체화 -> heap공간에 저장공간을 확보 -> 확보한 공간의 주소를 반환
		FieldAccessTest fct=new FieldAccessTest();
//		FieldAccessTest fct1=new FieldAccessTest();
//		FieldAccessTest fct3=new FieldAccessTest();
		
		//public : 다른 패키지에서 직접접근이 가능
		//fct.publicInt=100;	
		
		//protected : 자손객체, 같은패키지, 같은클래스
		//fct.protectedChar='남';			
		
		//default : 같은패키지, 같은 클래스
		//fct.defaultString="이건접근??";		
		
		//private : 같은클래스
		//fct.privateDouble=180.5;			
		
	
		//캡슐화는 하는 이유
		//음수가 있으면 될까??
		//fct.age=19;
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		//fct.setAge(19);						 //fct에 있는 age변수에 19 대입
		//System.out.println(fct.getAge());	     //fct에 있는 age변수 값 가져오기
		fct.setAge(-19);
		System.out.println(fct.getAge());
		
		
		//static변수, 클래스변수
		//System.out.println(StaticVariableTest.name);
		//StaticVariableTest.name="유병승";
		//System.out.println(StaticVariableTest.name);
		//com.oop.model.vo.DefaultTest.a;
		
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("유병승");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		
		svt2.setName("svt2변경!");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());
		System.out.println(svt2.getSu());
		
		
		//상수 이용하기 : final
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
		System.out.println("=== 초기화 블록 ===");
		
		//초기화 블록 설정
		InitialTest it=new InitialTest();
					System.out.println("it id : "+it.getId());
					System.out.println(it.getName());
					System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
					System.out.println("it2 id : "+it2.getId());
					System.out.println(it2.getName());
					System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) System.out.println("for문 id : "+ new InitialTest().getId());		
		
	}
	
}







