package com.first;
//패키지 이름을 반드시 2가지 폴더 이상으로 만들기
//com폴더.first폴더

//외부 패키지에 있는 클래스를 이용하는 방법
//import로 외부에 있는 클래스 불러 옴
import com.second.SecondTest;
//외부 클래스 활용하기
//패키지 이름.클래스 이름까지

public class FirstTest {
	
	public static void main(String[] args) {
		System.out.println("안녕 내가 처음만든 코드!");
		
		//외부 클래스 기능(매소드)이용하기
		new SecondTest().printTest();
		
	}

}
