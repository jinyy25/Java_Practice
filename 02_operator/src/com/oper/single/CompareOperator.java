package com.oper.single;

import java.util.Scanner;

public class CompareOperator {

	//public static void main(String[] args) {
	public void compareTest() {
		//비교연산활용하기
		//비교는 값에 대한 대소(숫자), 동등비교가 가능함
		//비교연산의 결과는 true/false가 나옴
		//비교연산 조건문에 많이 사용을 함.
		//1. 동등비교 == 같니? 어!같아!(true)/아니 달라!(false)
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1);
		System.out.println(su==su3);
		double dsu=180.5;
		double dsu1=190.2;
		double dsu3=180.5;
		System.out.println(dsu==dsu1);
		System.out.println(dsu==dsu3);
		char ch='A';
		char ch1='B';
		char ch3='A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch3);
		//String 문자열
		System.out.println("==== 문자열 동등비교 ====");
		String str="조현";
		String str1="김세민";
		String str3="조현";
		System.out.println(str==str1);
		System.out.println(str==str3);
		//문자열은 == 으로 비교하면 안됨!
		String str2=new String("김세민");
		System.out.println(str1==str2);
		Scanner sc=new Scanner(System.in);
		System.out.print("이름입력 : ");
		String name=sc.nextLine();
		System.out.println("str1 : "+str1+" name : "+name);
		System.out.println(str1==name);
		//문자열은 객체로 동등비교를 하려면 equals()기능을 이용해야함
		//문자열변수명.equals(비교문자열);
		System.out.println("==으로 비교 "+(str1==str2));
		System.out.println("equals로 비교"+str1.equals(str2));
		System.out.println("입력받은값비교 : "+str1.equals(name));
		//입력받은 값이 유병승 이니?
		System.out.println("유병승".equals(name));
		System.out.println(name.equals("유병승"));
		
		//!= 일치하지 않은것 비교
		System.out.println(su==su1);
		System.out.println(su!=su1);
		//문자열이 다르냐고 물어볼때????
		//부정연산이용
		System.out.println(str.equals(str1));
		System.out.println(!str.equals(str1));
		System.out.println("===== 대소비교 ====");
		//대소비교
		//>, <, <=, >=
		su=20;
		su1=30;
		su3=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char형은 대소비교가 가능한가????
		//char 대소비교가 가능함
		//char 실제값 = 정수 / 65-> A
		ch='A';
		ch1='B';
		System.out.println(ch<ch1);
		System.out.println(ch++);
		System.out.println(ch);
		
		System.out.println(ch>'a');
		
		//비교연산의 결과는 boolean형
		boolean flag=ch<'Z';
		
		//10은 1보다 크고 20보다 작니?
		//1<10<20-> X
		//대소비교 두개를 연결 논리연산 논리연산
		
	}
	
	
}
