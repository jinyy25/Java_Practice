package com.abs.controller;

import java.util.ArrayList;
import java.util.List;

import com.abs.model.vo.Food;

public class testSYS {

	public static void main(String[] args) {
			
		
		int sum=0;
		for(int i=0;i<100;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;				
			}						
		}
		System.out.println(sum);

		
		List food= new ArrayList();
		food.add(new Food("Áß½Ä","Â¥Àå",1,null));
		food.add(new Food("Áß½Ä","Â«»Í",1,null));
		food.add(new Food("¾ç½Ä","Â«»Í",1,null));
		
		for(Object o:food) {
			if(o instanceof Food) {
				Food f=(Food)o;
				if(f.getKind().equals("¾ç½Ä")) {					
					System.out.println(f);
				}
			}
		}
		
		
		}
		
	}
	
	
	

