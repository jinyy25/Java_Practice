package com.method2.model.vo;

public class Student {

		private String name;
		private int grade;
		private int kor;
		private int math;
		private int eng;
		private int sum;
		private double avg;
		public Student() {
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int grade, int kor, int math, int eng, int sum, double avg) {
			super();
			this.name = name;
			this.grade = grade;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
			this.sum = sum;
			this.avg = avg;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public double getAvg() {
			return avg;
		}
		public void setAvg(double avg) {
			this.avg = avg;
		}
		
		
}
