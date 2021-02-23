package com.inherit.main;

import com.override.model.vo.Animal;
import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Dog;

public class OverrideTest {
	
	//main클래스 변수
	public static void main(String[] args) {
		
		Dog d=new Dog("개과","뽀삐",'F',"잡식");
		Cat c=new Cat("고양이과","톰",'M',"잡식");
		Chicken ch=new Chicken("조류", "교촌", 'F', "잡식");
		
		System.out.println(d.bark());
		System.out.println(c.bark());
		System.out.println(ch.bark());
		
		//new Animal().info();
		d.info();
		
	}

}






