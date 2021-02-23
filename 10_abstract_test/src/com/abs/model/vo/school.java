package com.abs.model.vo;

public abstract class school {
	private String student;
	private String teacher;
	private int point;
	private int total;
	
	public abstract double grade(int no1, int no2);
	public abstract double cal(int no, int no3);
//	public abstract double cal1(int nom int nit);
	
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "school [student=" + student + ", teacher=" + teacher + ", point=" + point + ", total=" + total + "]";
	}
	

			
	
}
