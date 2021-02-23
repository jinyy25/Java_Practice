package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	public void basicArray() {
		//기본 배열 선언과 할당하기
		int[] intArr=new int[3];
		//double 배열선언하기
		double[] doubleArr=new double[3];
		//String배열 선언하기
		String[] strArr=new String[3];
		//char 배열 선언하기
		char[] chArr=new char[3];
		
		//디폴트값확인
		System.out.println(doubleArr[0]);//0.0
		System.out.println(strArr[0]);//null
		System.out.println(chArr[0]);// 
		
		//값을 대입 / 출력하기
		intArr[0]=20;
		//intArr[1]="저녁";
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
//		int a;
//		System.out.println(a);
		
		
		//String 5개를 저장할 수 있는 공간을 확보하고
		//자신이 좋아하는 과일을 5개변수에 저장하고 출력하기!
		String[] fruits=new String[5];
		//인덱스 번호 : 0 1 2 3 4
		fruits[0]="수박";
		fruits[1]="망고";
		fruits[2]="망고스틴";
		fruits[3]="구아바";
		fruits[4]="샴";//조....현.....으...으....
		//출력하기
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		
		//for문을 이용하여 출력하기
		for(int i=0;i<5;i++) {
			//System.out.println(i);
			System.out.println(fruits[i]);
		}
		fruits=new String[3];
		System.out.println("[3]"+fruits.length);
		fruits=new String[100];
		System.out.println("[100]"+fruits.length);
		
		//for문을 이용하여 값 대입하기
		//for(int i=0;i<5;i++) {
		for(int i=0;i<fruits.length;i++) {
			fruits[i]="수박";
		}
		/////////////////////////////////////
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		//정수 5개를 저장할 수 있는 공간을 확보하고
		//각 공간에 1~5까지 값을 대입하기
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//이름을 입력받고 출력 프로그램 만들기
		//1. client로 부터 몇명이름을 입력할지 입력받고
		//2. 그 수 만큼 배열을 만들어 이름을 입력받아 저장하고
		//3. 배열을 출력하기
		Scanner sc=new Scanner(System.in);
		System.out.print("몇명입력 : ");
		int su=sc.nextInt();
		String[] names=new String[su];
		for(int i=0;i<names.length;i++) {
			System.out.print("이름입력 : ");
			names[i]=sc.next();	
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//배열을 선언할때 
		//선언과 동시에 초기화
		int age=19;
		int[] numbers={1,2,3,4,5};
		System.out.println(numbers[2]);
		String[] nn= {"김대욱","인하준","이하영","오수완"};
		System.out.println(nn[0]);
		//names= {"원빈","송중기","공유","홍석천"};
		names=new String[]{"원빈","송중기","공유","홍석천"};
		System.out.println(names[0]);
		
	}
	
	//배열에 값을 넣는 기능
	public void inputArray(String[] temp) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<temp.length;i++) {
			System.out.print("입력 : ");
			temp[i]=sc.nextLine();
		}
	}
	
	public void printArray(String[] t) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	
	public void arrayCopy() {
		//얕은복사==주소값을 복사해서 생성된 배열변수를 같이 쓰는것!
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs;
		chs[0]='나';
		copyCh[copyCh.length-1]='다';
		
		System.out.println("==== chs원본값 ===");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("=== 복사된 값 ===");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+" : "+copyCh);
		
		//깊은 복사
		//heap영역에 배열공간 추가적으로 만들어서 값을 복사하는것!
		String[] str= {"집","에","가","자"};
		String[] str2=new String[str.length];
		//for문을 이용한 복사
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}
		str[0]="공부";
		str2[str2.length-1]="지말자";
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]);
		}
		System.out.println();
		
		//System.arraycopy매소드 이용 복사하기
		//원하는 위치의 값을 원하는 위치에 복사할 수 있음
		String[] str3=new String[str.length];
		//System.arraycopy(str, 0, str3, 0, str.length);//전체
		System.arraycopy(str,2,str3,2,2);
		
		//배열을 직접 할당해서 할당한 배열변수에 값을 복사하는 것
		
		//for(int i=0;i<str.leng,,,,)
		//for each문을 사용해보자!
		//배열이나, collection객체의 값에 접근할 때 사용
		//for(배열자료형의 변수 : 배열 OR collection객체){ 로직  }
		System.out.println();
		for(String v : str) {//공부 에 가 자
			System.out.print(v);
		}
		System.out.println();
		for(String v : str3) {
			System.out.print(v);
		}
		System.out.println();
		
		//Arrays.copyOf(), clone() 배열변수만 선언하고 대입해주면 됨. * 할당은 필요없음!
		
		//Arrays.copyOf()매소드 이용해서 복사
		//배열을 할당하지 않고 변수만 선언한 후 복사함
		String[] str4;
		str4=Arrays.copyOf(str, str.length);
		str4[0]="곧 퇴근!";
		for(String temp : str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		
		//Arrays.copyOf();
		String[] str5;
		//System.out.println(str5);//아무것도 없는상태
		str5=Arrays.copyOf(str,2);//Arrays.copyOf생성한 배열을 대입!
		System.out.println(str5);
		for(String v : str5) {
			System.out.println(v);
		}
		//clone() -> 객체를 복사하는 기능를 하는 매소드
		//배열변수명.clone();
		str5=str.clone();
		for(String v : str5) {
			System.out.println(v);
		}
		
		
	}
	
	public void arrayTest() {
		int[] nums= {1,2,3,4,5};
		//nums=new int[5];
		//nums[0]=1;
		//nums[1]=2;
		//nums[2]=3;
		//nums[3]=4;
		//nums[4]=5;
		nums= new int[]{4,5,6,7,8};		
	}
	
	
	//이차원 배열 사용하기
	public void doubleArray() {
		//이차원배열 선언하기
		int[][] numbers=new int[3][3];
		//이차원배열에 값 대입하기
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//이차원배열 출력하기
		System.out.println(numbers[1][1]);
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		//이차원배열의 선언과 동시에 초기화!
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4];
		numbers=new int[][]{{10,20},{50}};
		numbers=new int[2][];
		numbers[0]=new int[10];
		numbers[1]=new int[2];
		
		//for문을 이용하여 이차원배열 처리하기!
		//numbers출력해보자
		//for(int i=0;i<3;i++) {
			//for(int j=0;j<3;j++) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				//System.out.println(i+" : "+j);
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		//
		
		
		
		
	}
	
}







