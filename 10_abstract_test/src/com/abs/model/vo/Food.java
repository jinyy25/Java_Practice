package com.abs.model.vo;

import java.util.Arrays;

public class Food {
	private String kind;
	private String foodName;
	private int foodNo;
	private String[] gredients;
	public Food(String kind, String foodName, int foodNo, String[] gredients) {
		super();
		this.kind = kind;
		this.foodName = foodName;
		this.foodNo = foodNo;
		this.gredients = gredients;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}
	public String[] getGredients() {
		return gredients;
	}
	public void setGredients(String[] gredients) {
		this.gredients = gredients;
	}
	@Override
	public String toString() {
		return "food [kind=" + kind + ", foodName=" + foodName + ", foodNo=" + foodNo + ", gredients="
				+ Arrays.toString(gredients) + "]";
	}
	
	
}
