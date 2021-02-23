package com.abs.model.vo;

public class meth extends school {
	
	@Override
	public double grade(int no, int no2) {
		return no/(double)no2;
	}

	@Override
	public double cal(int no, int no3) {
		return 0;
	} 
	
}
