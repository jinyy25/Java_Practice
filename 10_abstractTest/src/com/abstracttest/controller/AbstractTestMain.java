package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplement2;
import com.abstracttest.model.vo.IncludeImplements;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;

public class AbstractTestMain {
	
	//1. Abstract : 단일상속
	public static void main(String[] args) {
		//Food f=new Food("중식","짜장면","한국",1,0);
		//System.out.println(f);
		
		Test t=new Test("한식","돈까스","한국",1,5);
		System.out.println(t);
		System.out.println(t.getName());
		
				
	//2. 추상클래스는 참조형과 자료형사용이 가능
		//Food f=new Food();					
		Food f=new Test();							//upcasting
			 f=new Recipe();
		
		//Food 자료형의 변수에는 Food를 상속받은 객체만 대입가능
		//f=new String();
		//Food 객체의 Recipe객체의 cooking method
		((Recipe)f).cooking();						//downcasting

		
		IncludeAbstract ia=new IncludeImplements();
		System.out.println(ia.calulator(10, 20));
						ia=new IncludeImplement2();
		System.out.println(ia.calulator(10, 20));
		System.out.println(ia.getA());
		System.out.println(ia.combine("안녕", "하세요!"));
	}
}



