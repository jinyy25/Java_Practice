package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {
	
	//main클래스
	public static void main(String[] args) {
		
		//관리하고있는 객체들의(student,employee,teacher)
		//이름은 2글자이상만 들어갈 수 있게 하는 방법
		Teacher t=new Teacher();
				t.getName();
				t.getAge();
				t.setName("한");
				
				Student s=new Student();
				s.setName("한");
				
				Employee e=new Employee();
				e.setName("한");
				
		//관리하고 있는 전체 객체에 성별추가	
				e.setGender('남'); 
				s.setGender('여');
				t.setGender('M');
				
				s=new Student();
				System.out.println(s.information());
				s=new Student(3,1,2);
				System.out.println(s.information());
		
				//s.Person();
				s.getName();
				
		//모든 객체는 Object의 후손
		//자바에서 Object는 최상위객체
				ObjectTest test=new ObjectTest();

		//test.
		//s.
		//Object obj;
		
		
	}

}





