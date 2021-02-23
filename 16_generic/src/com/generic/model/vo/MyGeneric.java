package com.generic.model.vo;

public class MyGeneric<T,E> {
	
	private T testValue;
	private E value2;
	
	public MyGeneric() {
		// TODO Auto-generated constructor stub
	}
	
	public MyGeneric(T testValue) {
		super();
		this.testValue = testValue;
	}

	public T getTestValue() {
		return testValue;
	}

	public void setTestValue(T testValue) {
		this.testValue = testValue;
	}

	@Override
	public String toString() {
		return "MyGeneric [testValue=" + testValue + "]";
	}
	
	
	
	
}
