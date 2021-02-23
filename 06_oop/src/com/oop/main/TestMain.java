package com.oop.main;

import com.oop.model.vo.Client;

public class TestMain {

	public static void main(String[] args) {
		//회원3명의 정보를 저장하는 객체를 만들고 출력하기
		Client c=new Client();
		c.setId("user01");
		c.setPw("1234");
		c.setEmail("prince0324@naver.com");
		c.setPoint(100);
		
		Client c1=new Client("user02","4567","user02@user.com");
		Client c2=new Client("user03","9876","0303@03.com",10.5);
		
		System.out.println(c.getId()+" "+c.getPw()+" "+c.getEmail()+" "+c.getPoint());
		System.out.println(c1.getId()+" "+c1.getPw()+" "+c1.getEmail()+" "+c1.getPoint());
		System.out.println(c2.getId()+" "+c2.getPw()+" "+c2.getEmail()+" "+c2.getPoint());
			
		
		
	}

}
