package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {
	
	//mainŬ����
	public static void main(String[] args) {
		
		//�����ϰ��ִ� ��ü����(student,employee,teacher)
		//�̸��� 2�����̻� �� �� �ְ� �ϴ� ���
		Teacher t=new Teacher();
				t.getName();
				t.getAge();
				t.setName("��");
				
				Student s=new Student();
				s.setName("��");
				
				Employee e=new Employee();
				e.setName("��");
				
		//�����ϰ� �ִ� ��ü ��ü�� �����߰�	
				e.setGender('��'); 
				s.setGender('��');
				t.setGender('M');
				
				s=new Student();
				System.out.println(s.information());
				s=new Student(3,1,2);
				System.out.println(s.information());
		
				//s.Person();
				s.getName();
				
		//��� ��ü�� Object�� �ļ�
		//�ڹٿ��� Object�� �ֻ�����ü
				ObjectTest test=new ObjectTest();

		//test.
		//s.
		//Object obj;
		
		
	}

}




