package com.collection.model.vo;

import java.util.Objects;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	//1. 비교가능한지 동등비교 설정
	@Override							
	public boolean equals(Object obj) {					//Id 기준
		if(obj instanceof Member) {						//Member객체가 Object에 들어갈 수 있다면
			Member m=(Member)obj;						//m변수 설정
			if(this.id.equals(m.id)) {					//주소값이 같다면
				return true;							//true로 반환
			}
		}
		return false;
	}
	
	//2. Objects.hash(변수);
	//Set,Map에서 객체를 동일하게 보려면 주소값도 일치시켜야 한다.     		☆☆☆☆☆
	//값을 출력해주며 Mapping 되어 있음							//hashCode도 오버라이딩 할것
	@Override
	public int hashCode() {						
			return Objects.hash(id,age);				
	}
	
	
	
	
	
	
	
	
}
