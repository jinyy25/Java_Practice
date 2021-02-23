package com.first;
//외부패키지에 있는 클래스를 이용하는 방법
//import로 외부에 있는 클래스를 불러옴

import com.second.SecondTest;

public class FirstTest {
	
	public static void main(String[] args) {
		//주석을 통해서 설명이나 기록사항을 남김
		//한줄만 주석을 하는 경우
		/* 
		  여러줄을 주석하는 경우
		  여러줄
		  여러줄!!!!
		 */
		//안녕
		System.out.println("안녕 내가 처음만든 코드!");
		
		System.out.println("이것도 출력해봐야지!");
		
		//외부클래스 기능(메소드)이용하기
		new SecondTest().printTest();//실행
		
		int[][] nums= new int[3][4];
		int count=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=count++;
			}
		}
		
		for(int[] t : nums) {
			for(int v : t) {
				System.out.printf("%2d ",v);
			}
			System.out.println();
		}
		
		System.out.printf("%2d %s",nums[0][1],"안녕");
		
	}
	
	
}
