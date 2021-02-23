package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentManager;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
	//client에게 보여지는 화면을 담당하는 객체
	private StudentManager sm;
	//1.main 화면 
	public void mainMenu(StudentManager sm) {
		this.sm=sm;
		System.out.println("==== 학생관리 프로그램 v01 ====");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 전체학생 조회");
			System.out.println("3. 이름으로 조회");
			System.out.println("4. 성적등록하기");
			System.out.println("5. 학년으로 조회하기");
			System.out.println("6. 성적조회하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1 : this.sm.enrollStudent() ;break;
				case 2 : this.sm.searchAll();break;
				case 3 : this.sm.searchName();break;
				case 4 : this.sm.inputGrade();break;
				case 0 : System.out.println("프로그램을 종료합니다.");return;
			}
		}
	}
	
	//학생정보 입력받는 화면기능(메소드) -> 입력받은 것을 반환!
	public Student enrollStudent() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 학생등록 화면 ====");
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int ban=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("주소 : ");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		
		Student s=new Student(name,grade,ban,number,address,phone);
		
		return s;
	
	}
	
	//알람을 출력해주는 기능 추가
	public void printMsg(String msg) {
		System.out.println("====== 시스템 메세지 =====");
		System.out.println("알림 : "+msg);
		System.out.println();
	}
	
	//이름입력받는 기능
	public String inputName() {
		System.out.println("==== 이름 조회 ====");
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=scanner.nextLine();
		return name;
	}

	//student출력기능 만들기.
	public void printStudents(Student[] students) {
		for(Student s : students) {
			//System.out.println(s);
			if(s!=null) {
				System.out.println(s.information());
				if(s.getGradePoint()!=null) {
					System.out.println("성적 : "+s.getGradePoint().printGrade());
				}
			}
		}
	}
	
	//성적입력하는 기능
	public Grade inputGrade() {
		//성적을 입력받는 로직 구성
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 성적입력화면 =====");
		Grade g=new Grade();
		System.out.print("국어 : ");
		//int kor=sc.nextInt();
		g.setKor(sc.nextInt());
		System.out.print("영어 : ");
		//int eng=sc.nextInt();
		g.setEng(sc.nextInt());
		System.out.print("수학 : ");
		//int math=sc.nextInt();
		g.setMath(sc.nextInt());
		System.out.print("코딩 : ");
		//int coding=sc.nextInt();
		g.setCoding(sc.nextInt());
		//Grade grade=new Grade(kor,eng,math,coding);
		//grade=new Grade(eng,kor,coding,math);
		//return grade;
		//return new Grade(kor,eng,math,coding);
		return g;
		
	}
	
	
	
}












