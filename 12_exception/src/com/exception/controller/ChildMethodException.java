package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildMethodException extends MethodOverrideTest{
	
	//throws 예외처리
	@Override
	public void exceptionOverride() throws FileNotFoundException,EOFException,IOException{
		
	}
}
