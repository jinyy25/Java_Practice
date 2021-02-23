package com.abs.controller;

import java.util.Comparator;

public class NumberSort implements Comparator {

	@Override
	public int compare(Object o, Object o1) {
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su=(Integer)o;
			Integer su2=(Integer)o1;
			return su2-su;
		}
		return 0;
	}
	
}
