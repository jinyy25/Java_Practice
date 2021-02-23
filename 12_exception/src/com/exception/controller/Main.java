package com.exception.controller;

import java.io.IOException;

public class Main {

	public static void main(String[] args)	throws Exception{
		
		//System.out.println("이거 실행 되누?");
		//new ThrowsTest().exceptionTest();
		//System.out.println("Exception 아래 실행");
		
		try {
			throw new MyException("에러!! 내꺼야 ㅎㅎㅎ");
			}catch(MyException e) {
			//printStackTrace : 오류 출력 메소드 
			  e.printStackTrace();
			  System.out.println(e.getMessage());
			}
		}
	}
