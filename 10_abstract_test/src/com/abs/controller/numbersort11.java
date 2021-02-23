package com.abs.controller;

import java.util.Comparator;

public class numbersort11 implements Comparator{
	
	@Override
	public int compare(Object o, Object o1) {
		if(o instanceof Integer && o1 instanceof Integer) {
			
			Integer su=(Integer)o;
			Integer su1=(Integer)o1;		
			return su1-su;
		}
		return 0;
	}
	

}
