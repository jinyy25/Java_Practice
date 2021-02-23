package com.interfacetest.controller;

import com.interfacetest.model.vo.CannonPrinter;
import com.interfacetest.model.vo.Hpprinter;

public class Run {
	public static void main(String[] args) {
		
		//new PrintManager(new Hpprinter()).print();		//인쇄기능실행!
		  new PrintManager(new CannonPrinter()).print();	//인쇄기능실행!
		//new PrintManager().print();						//nullpoint err
		
	}

}
