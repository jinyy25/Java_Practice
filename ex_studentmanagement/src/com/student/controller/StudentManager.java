package com.student.controller;

import com.student.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentManager {
	
	private StudentDB db=new StudentDB();
	
	//서비스별 학생등록, 시작화면출력, 데이터저장
	public void mainView() {
		//시작화면으로 연결해주는 기능
		new MainView().mainMenu(this);
	}
	
	
	//학생 등록 서비스
	public void enrollStudent() {
		//Student객체를 만들어서 저장해놓음
		//Student에 들어갈 각 정보를 입력 -> client가 입력! -> 화면을 보여줘야함.
		
		Student s=new MainView().enrollStudent();
		System.out.println(s.information());
		
		//입력받은 데이터를 저장소에 저장
		boolean result=db.saveStudent(s);//DB에 저장하기
		System.out.println(result);
		
		new MainView().printMsg(result?"입력성공":"입력실패");
		
	}
	
	
	//이름으로 조회 서비스 구현
	public void searchName() {
		//이름으로 조회
		String name=new MainView().inputName();
		Student s=db.searchName(name);
		if(s==null) {
			new MainView().printMsg("조회결과가 없습니다!");
		}else {
			System.out.println("조회결과 : "+s.information());
		}
		
	}
	//전체학생조회서비스
	public void searchAll() {
		Student[] students=db.searchAll();
		new MainView().printStudents(students);
	}
	
	
	//성적등록 서비스
	public void inputGrade() {
		//성적을 등록하는 기능
		//한명학생을 선택하여 성적을 입력하는 서비스
		searchAll();//전체회원조회!
		String name=new MainView().inputName();
		Student s=db.searchName(name);
		if(s!=null) {
			//성적등록할 학생이 있음!
			//성적등록화면으로 이동
			Grade g=new MainView().inputGrade();
			s.setGradePoint(g);
			
		}else {
			//성적등록할 학생이 없음!
			//없다는 알림메세지 출력
			new MainView().printMsg("등록된 학생이 아닙니다!");
		}
	}
	
}












