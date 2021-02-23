package com.interfacetest.model.vo;

public class Hpprinter implements PrinterDriver{
	
	
	public void printHp() {
		System.out.println("hp프린터작동!! 인쇄중.....");
	}

	@Override
	public void print() {
		printHp();
	}
	
}
