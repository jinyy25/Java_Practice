package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {

		//Employee내용을 출력하는 기능	
		//public void print(Employee e) {
			//System.out.println(e.getName()+e.getAge()+e.getAddress());
		//}

		//Singer내용을 출력하는 기능
		//public void print(Singer s) {
			//System.out.println(s.getName()+s.getAge()+s.getAddress());
		//}		
	
	//다형성을 이용하면 오버로딩을 줄일 수 있음									
	//1. 오버로딩 : 클래스 내에 같은 이름의 메소드
	public void print(Person p) {						 			//Person 객체를 p로 받아옴

	//2. 동등비교 : instanceof type 비교									//String에서 equals()매소드와 비슷한 역할						
			if(p instanceof Employee) {								//Employee객체와 Person객체 비교

			//employee 모든 정보출력
			System.out.println(p.getName()+p.getAge()				//p의 getter 불러옴
					+p.getAddress()+((Employee)p).getDeparment()	//자료형이 Empoyee의 Person객체이며
					+((Employee)p).getJob()							//상속관계이므로 다음과 같이 자료형을 나타냄
					+((Employee)p).getSalary());					
			
			//singer 모든정보출력			
			}else if(p instanceof Singer) {							//Person객체에 Singer객체가 존재하는가?
			System.out.println(p.getName()+p.getAge()
						+p.getAddress()+((Singer)p).getTitle()
						+((Singer)p).getYear()+((Singer)p).getGenre());
			}else if(p instanceof Person) {							//Person객체와 p가 같다면 다음과 같이 출력
			System.out.println("person이야!");
		}	
	}
}





