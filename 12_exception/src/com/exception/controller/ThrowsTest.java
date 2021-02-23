package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ThrowsTest {

	public void exceptionTest2() throws FileNotFoundException{		
			throw new FileNotFoundException();
		}
		
	public void exceptionTest3() throws EOFException{
			throw new EOFException();
		}
		
	//예외처리도 상속관계 존재	
	public void exceptionTest() throws FileNotFoundException,EOFException {

		//checkedException : 반드시 처리 구문을 작성
		
		//throw new IOException();			
			  exceptionTest2();
		      exceptionTest3();
		}
		
}
