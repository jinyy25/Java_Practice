package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;

public class InterfaceTest {
	
	//1. Interface : 다중상속
	public static void main(String[] args) {
		
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
			
	//2. 인터페이스에서 선언한것은 상수로 다른값 대입이 안됨.
		//TestAble.age=20;
		//TestAble.name="이거는?";
		
		Test t=new Test();
			 t.test();
		System.out.println(t.getStr("여러분 이제 거의끝나가요!!"));
		
	//3. 인터페이스는 참조형자료형으로 사용 가능
		TestAble test;
		test=new Test("유병승",19);
		
		//필수적인 기능만 보이도록 설정됨.
		//인터페이스가 강제한 메소드만 보임.
		System.out.println(test.getStr("곧곧 정리시간!!"));
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];				//변수들!
		arrTest[0]=new Test();
			
	//4. 인터페이스는 클래스와 달리 다중구현가능							//default예약어를 사용하여 구현부가 있는 메소드를 인터페이스 내부에서 선언이 가능하게됨.
		arrTest[0].whatHell("이건 뭐냐,, 또 외워야해");
		
	}
	
}







