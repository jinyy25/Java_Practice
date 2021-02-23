package com.test;

import java.util.Scanner; 

public class ScannerTest {

	public static void main(String[] args) {
		//client 이름, 나이, 주소, 전화번호, 키
		Scanner sc=new Scanner(System.in);
		System.out.print("님 이름 : ");
		//String name=sc.next();
		String name=sc.nextLine();
		System.out.print("님 나이 : ");
		int age=sc.nextInt();
		
		//nextLine()값을 받기전에 
		//nextInt(), next(), nextDouble()로 이전에 값을 받아왔으면
		//입력 버퍼를 nextLine()비워주고 사용을 해야한다.!
		
		sc.nextLine();//버퍼를 비워줌..
		System.out.print("님 주소 : ");
		String address=sc.nextLine();
		
		
		System.out.print("님 전화번호 : ");
		String phone=sc.nextLine();
		System.out.print("님 키 : ");
		double height=sc.nextDouble();
		
		System.out.println(name+" "+age+" "+address+" "+phone+" "+height);
		
	}
	
	
}
