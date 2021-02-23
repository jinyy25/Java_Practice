package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {

	public void doubleRepeatTest() {
		//구구단 출력하기
		for(int i=2;i<10;i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.print(i+"X"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//1 2 3
		//4 5 6
		//7 8 9
		int su=1;
		for(int i=0;i<3;i++) {
			System.out.println("하");
			for(int j=0;j<3;j++) {
				System.out.print((su++)+" ");
			}
			System.out.println();
		}
		
		//9 8 7
		//6 5 4
		//3 2 1
		
		for(int j=0;j<3;j++) {
			System.out.print("조현");
			for(int i=0;i<3;i++) {
				System.out.println("하");
			}
		}
		
		//이중반복문을 이용하여 중복값찾기
		String msg="apple";
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0
		for(int i=0;i<5;i++) {
			int count=0;
			//System.out.println(msg.charAt(i));
			for(int j=0;j<5;j++) {
				if(i!=j&&msg.charAt(i)==msg.charAt(j)) {
					count++;//1증가 count=count+1;
				}
				//System.out.println(i+" : "+j);
				//System.out.println(msg.charAt(i)
				//		+" : "+msg.charAt(j));
			}
			System.out.println(msg.charAt(i)+" : "+count);
			//count=0;
		}
		
		
		
	}
	
	public void breakTest() {
		//break문 활용하기
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==200) {
				break;
			}
		}
		Scanner sc=new Scanner(System.in);
		String msg="";
		//무한반복되는 메뉴를 종료시킬때
		while(true) {
			System.out.print("값입력 : ");
			String temp=sc.nextLine();
			if(temp.equals("끝")) {
				break;
			}else {
				msg+=temp;
			}			
		}
		//중첩반복문에서 break문 사용하기
		dinner:
		for(int i=2;i<10;i++) {
//			if(i%2==1) {
//				break;
//			}
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
				if(i%2==1) {
					break dinner;
				}
			}
		}
		
		//continue
		//로직에서 continue문을 만나면 continue문 아래있는 로직을 실행하지
		//않고 증가연산으로 가서 실행함.
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
	
	
	
}





