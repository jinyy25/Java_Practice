package com.interfacetest.model.vo;

//implements : 시행하다
public class CannonPrinter implements PrinterDriver {

	@Override
	public void print() {
		System.out.println("캐논 프린터 작동!! 인쇄중..");
	}
	
}
