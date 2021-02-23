package com.exception.controller;

public class MyException extends Exception{
	
	//프로그램에서 사용하는 예외 만들기.
	//일반클래스에 Exception객체 중 하나를 상속받으면  Exceptoin 객체가 됨.
	public MyException() {}
	
	public MyException(String msg) {
		super(msg);
	}

	
	
}
