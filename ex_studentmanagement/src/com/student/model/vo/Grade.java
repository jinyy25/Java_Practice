package com.student.model.vo;

public class Grade {

	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	public Grade() {}
	
	public Grade(int kor, int eng, int math, int coding) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.coding=coding;
	}
		
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCoding() {
		return coding;
	}

	public void setCoding(int coding) {
		this.coding = coding;
	}

	public String printGrade() {
		return ""+kor+" "+eng+" "+math
				+" "+coding
				+" "+(kor+eng+math+coding)
				+" "+(kor+eng+math+coding)/4.0;
	}
	
}






