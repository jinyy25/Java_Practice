package com.collection.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public void propertiesTest() {
		
		//Properties : key = value 형식으로 데이터를 저장하는 클래스			//문자열 자료를 저장하는 클래스
		//key:String, value:String
		
		//장점 : 파일과 연동하여 처리 가능
		//파일을 저장하고, 가져올 수 있음
		//프로그램의 주요 설정파일, 환경데이터 등을 저장하고 불러올 때 많이 사용
		
		//1. 생성해서 사용 : Properties
		Properties prop=new Properties();

		//2. 객체에 데이터 대입 : setProperty(key, value)
		prop.setProperty("name", "설진호");
		prop.setProperty("age","29");
				
		//3. 파일에 저장 : store(문자저장 스트림)매소드 이용
//		try {
//			prop.store(new FileWriter("prop.properties"),"사람");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		//4. 파일에 저장된 내용 불러오기 : load(문자열 부르는 스트림)
		try {
			//prop.load(new FileReader("prop.properties"));
			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//5. properties에 있는 값 출력 : getProperty(키값);
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("password"));
		
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));		
//		System.out.println(prop.getProperty("nickName"));
				
	}

}
