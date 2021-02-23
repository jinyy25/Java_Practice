package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.MyGeneric;
import com.generic.model.vo.Student;

public class GenericTest {

	//제네릭 : 클래스 설계시에 자료형을 정하지 않고 생성시에 자료형을 확정짓는 방법
	//한가지 객체만 저장하도록 설정함으로 다른 타입이 저장되지 못하게 하려고  
	//멤버변수, 메소드 반환형, 매소드매개변수 자료형 선언 
	//Collection에서  적용
	
	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList();    //학생객체만 저장		
		students.add(new Student("유병승",3,1));
		students.add(new Student("유다해",2,22));
		students.add(new Student("박현우",2,33));
		//students.add(new Date());						//날짜가 저장되다니!	
														//막아버리자
		
		students.get(0).getName();	//본래 형변환 했어야 하지만
									//generic 이후 Bye
	
		ArrayList<String> names=new ArrayList();
		names.add("유병승");
		names.add("강경록");
		
		
		Set<Integer> number=new HashSet<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		//number.add
		Set<Student> s=new HashSet<Student>(students);
		
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
		//학생이름만 출력
			System.out.println(it.next().getName());
		}
		
		
		HashMap<String,Student> studentsMap=new  HashMap();
		studentsMap.put("1", new Student("김다희",3,1));
		studentsMap.put("2", new Student("정로희",3,2));
		studentsMap.put("3", new Student("이세현",2,1));
		studentsMap.put("4", new Student("남지선",3,1));	
		
		
		//순회하기! 학년이 3학년인 사람의 이름만 출력
		//1
		Set<String> key=studentsMap.keySet();
		Iterator<String> it1=key.iterator(); 
		
		while(it1.hasNext()) {
			Student s1=studentsMap.get(it1.next());				//if문사용
			if(s1.getGrade()==3) {
				System.out.println(s1.getName());
			}	
		}
		
		//2
		Set<Map.Entry<String, Student>> entry=studentsMap.entrySet();
		Iterator<Map.Entry<String, Student>> it2=entry.iterator();
				
			while(it2.hasNext()) {
					Map.Entry<String, Student> e=it2.next();	//e변수선언 :다음 트레이 사용
					System.out.println(e.getKey());
					System.out.println(e.getValue());
				}
		
		//3		
		for(Map.Entry<String, Student> e : studentsMap.entrySet()) {
			if(e.getValue().getGrade()==3) {					// forEach문사용
				System.out.println(e.getValue().getName());
				}
			}
		
		MyGeneric<String,Integer> g=new MyGeneric();
		
		g.setTestValue("안녕");
		System.out.println(g.getTestValue());
		
		MyGeneric<ArrayList<Integer>,HashMap> arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		
		//arr.getTestValue().add(new Student());
		
		
		
		
	}
}