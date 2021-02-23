package com.method2.main;

import com.method2.controller.StudentController;
import com.method2.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		
		//StudentController 객체 생성
		StudentController con=new StudentController();		
		
		//Student 객체에 con의 insertStudent 기능을 s변수에 저장
		Student s=con.insertStudent();
		
		//String result 변수에 Student객체의 name,grade,점수들을 저장
		String result = "이름: "+s.getName()+"학년: "
						+s.getGrade()+"국어: "+s.getKor()+"수학: "+s.getEng()
						+"총점: "+s.getSum()+"평균: "+s.getAvg();
		
		System.out.println(result);
	}
}
