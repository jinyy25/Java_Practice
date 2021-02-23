package com.abs.controller;

import java.util.ArrayList;
import java.util.List;

import com.abs.model.vo.Food;
import com.abs.model.vo.meth;
import com.abs.model.vo.school;

public class absmain {
	public static void main(String[] args) {
		school s= new meth();
		
		System.out.println(s.grade(2, 22));
		
		int n=1; int sum=0;
		for(int i=1;i<100;i++) {
			if((i%3)==0||(i%5)==0) sum+=i;			
		}
		System.out.println(sum);
	
		
		List food = new ArrayList();
		food.add(new Food("중식","짜장",1,new String[5]));
		food.add(new Food("양식","스파게티",2,null));
		food.add(new Food("중식","짬뽕",3,null));
		
		
		for(Object o : food) {			
			if(o instanceof Food) {
				Food f=(Food)o;
				if(f.getKind().equals("양식")) {
					System.out.println(f);
				}
			}
		}
		
		String test="안녕하세요. 제 이름은 윤진영 입니다.";
		System.out.println(test.substring(0,6));
		String no="1234";
		System.out.println(Integer.parseInt(no));
		
		
	}
}
