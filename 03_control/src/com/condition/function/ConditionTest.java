package com.condition.function;

import java.util.Scanner;

public class ConditionTest {

	public void basicIfTest() {
		//기본 if문 사용하기
		//if(조건식(결과 :true/false)){ if문에 해당하는 지역 }
		//조건식이 true가 되면 {}부분을 실행, 아니면 if문 무시함.
		
		//입력받은 값이  양수면 "양수입니다." 를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		//조건에 따라 양수입니다 출력을 할지말지 결정할때 if문을 사용
		if(su>0) {
			System.out.println("양수입니다.!");
		}else {
			System.out.println("음수입니다.!");
		}
		//티켓번호를 입력받고 티켓번호가 777이면 인증되었습니다, 
		//입장하세요 문구출력
		System.out.print("티켓번호 : ");
		int ticket=sc.nextInt();
		int count=0;
		if(ticket==777 /*&& age > 19 && height>180 &&*/) {
			System.out.println("인증되었습니다.");
			System.out.println("입장하세요!");
			//모든 연산자. 변수선언/사용 이 다 가능함.
			count++;
			int su1=100;
			int su2=200;
			int result=su1+su2;
			System.out.println(result);
		}
		//if(ticket!=777) {
		else {
			System.out.println("인증실패되었습니다.");
			System.out.println("들어갈 수 없습니다!");
		}
		//System.out.println(su1+" "+su2+" "+result);
		
		System.out.println("입장수 : "+count);
		
		//if~else문에서 else만 사용할 수 있을까?
		boolean falg=true;
		if(falg) {
			
		}
		else {
			
		}
		
		//홀수면 홀수, 짝수면 짝수 출력하는 프로그램작성
		System.out.print("정수입력 : ");
		int su4=sc.nextInt();
		if(su4%2==1) {
			System.out.println("홀수다!");
		}else {
			System.out.println("짝수다!");
		}
		
		
	}//메소드(기능)
	
	//국어, 영어, 수학 점수를 입력받아 합계, 
	//평균을 계산하고 합계가 250점 이상이면 
	//"우수생입니다" 를 출력
	
	//A,B,C연봉을 입력받고 연봉이 5000이상이면 
	//"00은 고액연봉자 입니다." 출력
	
	//국어,영어, 수학 점수를 정수형으로 입력받아 
	//총점과 평균을 가지고 합격여부를 처리, 세과목점수가
	//각각 40점 이상이면서, 평균이 60점 이상이면 합격
	//아니면 불합격을 출력하기
	public void testA() {

	}
	public void testB() {
		
	}
	public void testC() {
		Scanner input=new Scanner(System.in);
		System.out.print("국어 : ");
		int kor=input.nextInt();
		System.out.print("영어 : ");
		int eng=input.nextInt();
		System.out.print("수학 : ");
		int math=input.nextInt();
		double avg=(kor+eng+math)/3.0;
		//각 과목의 점수가 40점 이상이고 평균이 60점이상
		//kor>=40/eng>=40/math>=40/avg>=60
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void ifElseifTest() {
		//if ~ else if ~ else
		//성적 등급 산출 프로그램
		//100점 ~ 90점 이상 A
		//89 ~ 80점 이상 B
		//입력받은 점수를 기준으로 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("점수입력 : ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//성적에 대한 등급산출
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {//jumsu<90 &&
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");
		
		//만약에 else없이 if문으로만 작성한다면???
		if(jumsu>=90) {
			grade='A';
		}
		if(jumsu<90&&jumsu>=80) {//jumsu<90 &&
			grade='B';
		}
		if(jumsu<80&&jumsu>=70) {
			grade='C';
		}
		if(jumsu<70&&jumsu>=60) {
			grade='D';
		}
		if(jumsu<60) {
			grade='F';
		}
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");
	}
	
	//계산기 만들기
	//정수 두개 입력받고 연산자(*,+,-,/)를 입력받아
	//계산결과 출력하기
//    출력 예) 입력 5 
//		     입력 6 
//		     연산자 : +
//		   5+6=11

	public void calc() {
		//계산기 만들기
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		System.out.print("정수입력 : ");
		int su2=sc.nextInt();
		System.out.print("연산자입력(+,-,*,/) : ");
		char op=sc.next().charAt(0);
		double result=0;
		if(op=='+') {
			result=su+su2;
		}else if(op=='-') {
			result=su-su2;
		}else if(op=='*') {
			result=su*su2;
		}else if(op=='/') {
			result=(double)su/su2;
		}
		System.out.println((op=='/'?""+su+op+su2+"="+result
							:""+su+op+su2+"="+(int)result));
	}
	
	//성인만 입장할 수 있는 클럽 
	//성인이면 메뉴를 출력하여 고르게하고 아니면 집에가세요! 라고출력
	//1. 양주, 2. 소주, 3. 막걸리
	//1 고르면 양주는 비싸
	//2 소주는 써
	//3 막걸리는 머리아파
	
	public void ifinif() {
		Scanner sc= new Scanner(System.in);
		System.out.print("당신의 나이는? " );
		int age=sc.nextInt();
		//if(msg.equals("성인"))
		if(age>19) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 양주?");
			System.out.println("2. 소쥬?");
			System.out.println("3. 막걸리?");
			System.out.print("번호입력 : ");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("양주는 비싸!");
			}else if(choice==2) {
				System.out.println("소주는 써!");
			}else if(choice==3) {
				System.out.println("막걸리는 머리아파!");
			}
		}else {
			System.out.println("집에가세요!");
		}
	}
	
}





