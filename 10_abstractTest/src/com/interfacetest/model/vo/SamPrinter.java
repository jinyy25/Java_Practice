package com.interfacetest.model.vo;

public class SamPrinter implements PrinterDriver{

	
	public void Samprinter(String msg) {
		System.out.println("삼성프린터 작동!!"+msg+"출력중 ...");
	}
	
	@Override
	public void print() {
		Samprinter("삼성프린터 작동!!");
	}
	
}
