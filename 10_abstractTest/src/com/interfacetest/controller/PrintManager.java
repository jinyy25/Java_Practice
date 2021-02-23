package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//interface활용시 유지&보수 용이
	//private Hpprinter  print=new Hpprinter();
	//private SamPrinter print=new SamPrinter();
	//private Lgprinter  print=new Lgprinter();
	private PrinterDriver driver;
	
	//매개변수있는 생성자
	public PrintManager(PrinterDriver driver) {
		this.driver=driver;
	}
	
	public void print() {
		//print.printHp();
		//print.Samprinter("삼성인쇄기가");
		//print.printLg();
		driver.print();				
	}
	
}
