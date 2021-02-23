package com.exception.controller;

import java.util.Date;

public class UnCheckedException {
	
		public static void main(String[] args) {
			
			//UncheckedException : 코드상에서 개발자가 처리하지 않아도 되는 Exception
			
			//1. ArithmeticException
				int a=0;
				int b=10;
				//System.out.println(b/a);
			
			//2. NullpointerException 발생	
				String name=null;
				//System.out.println(name.charAt(0));
				
			//3. NegativeArraySizeException 	
				//int num[]=new int[-3];
				
			//4. ArrayIndexOutOfBoundsException 	
				//int[] num=new int[2];
				//System.out.println(num[3]);
			
			//예외처리 방법
			//try-catch문
//				int[] num=new int[2];
//				Scanner sc=new Scanner(System.in);
				
//				while(true) {
//					System.out.println("선택");
//					int cho=sc.nextInt();
//					if(cho==0) break;
//					try{
//						System.out.println(num[3]);
//					//}catch(ArrayIndexOutOfBoundsException e) {
//						num=new int[num.length+5];
//						System.out.println("해결함");	
//					//}
//				}
			
			//5. ClassCastException 발생
				Object obj=new Date();
				//Calendar c=(Calendar)obj;
				
			//throw문
				//예외를 강제로 발생시킬 수 있음
				//throw예약어를 이용해서 Exception을 발생시킴
			throw new NullPointerException("에구.. 에러 ?");
			
			
			
			
			
			
		}

		
}
