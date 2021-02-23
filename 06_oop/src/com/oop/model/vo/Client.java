package com.oop.model.vo;

public class Client {
	
	//id, pw, email, 평점 -> 데이터 -> 변수 -> 자료형 변수명
	private String id;		//회원의 아이디 4 ~ 8글자로 설정
	private String pw;		//회원비밀번호 8글자이상
	private String email;	//회원 이메일주소
	private double point;	//좋아요 평균횟수
	
	//기본생성자 : 객체를 생성할때 필요한 생성자 작성	 
	
	//매개변수있는 생성자
	public Client(String id, String pw, String email, double point) {
		this.id=id;
		this.pw=pw;
		this.email=email;
		this.point=point;
	}
	
	//성적 제외 매개변수 생성자
	public Client(String id, String pw, String email) {
	//this생성자는 반드시 무조건 맨위에 선언
		this(id,pw,email,0);
//		this.id=id;
//		this.pw=pw;
//		this.email=email;
	}

	//framework에서 이용할 기본생성자로 생성을 한 다음 setter로 값을 대입함.
	public Client() {
		this("userId","1111","print");
		this.point=100.10;
//		this.id="userId";
//		this.pw="1111";
//		this.email="print";
//		this.point=0.0;
	}
	
	//getter/setter : 객체에 생성된 변수에 접근해서 값을 가져오고 값을 대입하는 기능
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}
}

