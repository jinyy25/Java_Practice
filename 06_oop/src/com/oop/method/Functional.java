package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

//기능제공용 클래스 : 메소드 다수 구현
public class Functional {

	//매개변수있는 생성자가 있으면 기본생성자가 자동생성이 안됨
	//public Functional() {}//기본생성자
	
	//계산기 
	//1. 매개변수 x, 반환형 x 메소드 : system.out로 출력
		public void calculator() {
		Scanner sc=new Scanner(System.in);
			System.out.println("==== 계산기 프로그램 ====");
			System.out.print("정수 : ");
			int su=sc.nextInt();
			System.out.print("정수 : ");
			int su2=sc.nextInt();
			System.out.println(su+"+"+su2+"="+(su+su2));		
		//System.out.print("연산자(+,-,*,/)");
		//char op=sc.next().charAt(0);
		//int result=0;
		//switch(op) {
			//case '+': 
		//}	
		}
	
	//2. 반환형 x, 매개변수 o 메소드 : 계산하는 기능 구현 이항연산 두개 값이 정수 
	//연산이 변경되려면, 연산도 매개변수로 받아야함.
	public void calculator2(int su, int su2, String[] operation) {
		System.out.println("==== 계산기 프로그램 ====");
		System.out.println("정수 : "+su);
		System.out.println("정수 : "+su2);
		double result=0;
		//for(String op : operation) {//for each문 
		//	switch(op) {
		for(int i=0;i<operation.length;i++) {
			switch(operation[i]) {
				case "+" : result=su+su2;break;
				case "-" : result=su-su2;break;
				case "*" : result=su*su2;break;
				case "/" : result=(double)su/su2;break;
			}
			//System.out.println(su+op+su2+"="+(result));
			System.out.println(su+operation[i]+su2+"="+(result));
		}
	}
	
	//3. 반환형 o, 매개변수 x 메소드 : 리턴은 단 한개의 자료형만 가능
	//두개의 수를 더하고 그 결과를 반환하는 기능
	public int calculator3() {
		System.out.println("==== 계산기 프로그램 ====");
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int su=sc.nextInt();
		System.out.print("정수 : ");
		int su2=sc.nextInt();
		return su+su2;
	}
	
	//4. 반환형 o,  매개변수 o 매소드
	public int calculator4(int su, int su2) {
		return su+su2;
	}

	//입력받은 두수의 사이를 값을 더한 결과를 출력할것
	public int printer(int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("에러출력!");
		}else {
			for(int i=second;i<=first;i++) {
				result+=i;
			}
		}
		return result;
	}
	
	//문자 한개를 전달받아 영문자인지 확인하고 결과를 리턴
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||('A'<=check&&check<='Z');
	}
	
	//배열을 매개변수로 받는 매소드 생성 : 배열을 입력받는 값으로 초기화
	public void updateArray(int[] nums) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== 배열 수정하기 ====");
		for(int i=0;i<nums.length;i++) {
			System.out.print("수정값 : ");
			nums[i]=sc.nextInt();
		}
	}
	
	//기본자료형을 매개변수로 받고 수정
	//public void basicUpdate(int su) {
	public int basicUpdate() {
		//su=200;
		return 200;
	}
	
	//student업데이트 기능
	public void studentUpdate(Student s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== 학생정보수정 ====");
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classRoom=sc.nextInt();
		System.out.print("번호 : ");
		int classNo=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		
		//전달된 매개변수 값을 수정
		s.setName(name);
		s.setClassRoom(classRoom);
		s.setGrade(grade);
		s.setClassNo(classNo);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//두번째 학생정보 수정하는 로직
	public Student studentUpdate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== 학생정보수정 ====");
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classRoom=sc.nextInt();
		System.out.print("번호 : ");
		int classNo=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		
		Student s=new Student(name,grade,classRoom,classNo,height,weight); 
		return s;
	}
	
	public String client() {
		Scanner sc=new Scanner (System.in);
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		String age=sc.nextLine();
		System.out.print("전화번호 : ");
		String num=sc.nextLine();
		
		String result = name+age+num;
		return result;
	}
	
	public void insertMember(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("id : ");
		String id=sc.nextLine();
		System.out.print("pw : ");
		String pw=sc.nextLine();
		System.out.print("name : ");
		String name=sc.nextLine();
		System.out.print("email : ");
		String email=sc.nextLine();
		System.out.print("address : ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
	}
}


