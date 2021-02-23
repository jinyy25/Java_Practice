package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		int arr[][]= new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print("("+i+", "+j+")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int arr[][]=new int[4][4];
		
		int a=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(a+++" ");
			}
			System.out.println();
		}		
	}
	
	public void practice3() {
		int arr[][]=new int[4][4];
		
		int a=16;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(a--+" ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int arr[][]=new int[4][4];
		
		int sv=(int)(Math.random()*10)+1;
		for(int i=0;i<arr.length-1;i++) {	
			for(int j=0;j<arr.length-1;j++) {		
				System.out.print(sv);
			}			
			System.out.println();	
		}		
	}	
	
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("행 크기 : ");
		int n1=sc.nextInt();
		System.out.print("열 크기 : ");
		int n2=sc.nextInt();
		
		int su=0;
		do{
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n2;j++) {
					System.out.println();
				}
				System.out.print(su+++" ");
			}
			
			
		}while(n1<0&&n1>10||n2<0&&n2>10);
		
		
	}
	
		
	
	
	
	
}
