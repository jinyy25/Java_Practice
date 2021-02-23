package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		
		//try ~ catch구문으로 예외처리
		Scanner sc=new Scanner(System.in);
		
		//입력받은 문자열의 3번쨰값을 출력
		for(int i=0;i<3;i++) {
			System.out.println("문자입력 : ");
			String name = sc.nextLine();
			
			//1.try{오류 구문
			try {
				System.out.println(name.charAt(2));					
			//2.catch(오류이유){오류출력}
				}catch(StringIndexOutOfBoundsException e){			
					//e.printStackTrace();
					return;
			//3.Anyway 결과
				}finally {											
					System.out.println("프로그램 종료");						
				}
				System.out.println("계속 go :)");
			}		
		fileTry();
	}
	
	
	public static void fileTry() {
		File f=new File("test.txt");
		FileInputStream fis=null;	
		try {								    //finally 무조건 써야함
			fis=new FileInputStream(f);		    //stream을 닫아줘야하기 때문에
			fis.read();							//IOException;			
		}catch(FileNotFoundException e) {		//범위가 작은것부터 큰것으로/부모exception이 다 잡아서,			
		}catch(IOException e) {
		}catch(Exception e) {					//제일 상위인 Exception으로 해결하려면 다음과 같이
			//e.printStackTrace();				//단: 어떤 Exception이 발생했는지 차후에 구분하여 처리하기 힘듬
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {				
//			}			
		}finally {
			try{
			//스트림닫기 : close();	
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void trywithresourceTest() {
		//try with resource : 객체를 반환해줘야하는 구문을 자동으로 생성해서 처리
		//try{   
		//	}catch(예외클래스 e){    				
		//	}finally{try.....}
		
		//try(반환객체를 선언/생성){    
		//	}catch(예외클래스 e){    }
		
		File f=new File("test.txt");
		//닫아주는 구문 포함
		try(FileInputStream fis=new FileInputStream(f);			   
			BufferedInputStream bis=new BufferedInputStream(fis);){
			bis.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}
