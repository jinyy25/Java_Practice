package com.abs.model.vo;

public class computing extends school{
	@Override
	public double cal(int no2, int no1) {
		return no2*no1;
	}

	@Override
	public double grade(int no1, int no2) {
		return 0;
	}

}
