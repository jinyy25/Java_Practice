package com.method2.controller;

import java.util.Scanner;

import com.method2.model.vo.Student;

public class StudentController {	
		Scanner sc=new Scanner(System.in);
	
	//InsertStudent기능 Student 객체 이용 
	public Student insertStudent() {
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("학년: ");
		int grade=sc.nextInt();
		System.out.print("국어: ");
		int kor=sc.nextInt();
		System.out.print("수학: ");
		int math=sc.nextInt();
		System.out.print("영어: ");
		int eng=sc.nextInt();
		
		//Student 객체를 받아와서  s변수에 저장/대입
		Student s=new Student(name,grade,kor,math,eng,(kor+math+eng),(kor+math+eng)/3.0);		
		return s;		
	}
}
