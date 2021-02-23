package com.oop.main;

import java.util.Scanner;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

public class MethodMain {

	public static void main(String[] args) {
		
		
		
		//1. 반환형x, 매개변수 x 매소드 호출
			Functional fun=new Functional();
		
		//2. 반환형x, 매개변수 o 매소드호출
			int su=10;
			int su2=20;
			fun.calculator2(10,20,new String[] {"*","/"});
		
		//3. 반환형 o, 매개변수 x 매소드호출
			//System.out.println(fun.calculator3());
			
			//int result=fun.calculator3();
			//System.out.println(result*100); //10;
				
		//4. 반환형o, 매개변수o 매소드 호출
			//result=fun.calculator4(20,20);
			//System.out.println(result);
		
			//두번째문제 호출
			//int res=fun.printer(2, 10);
			//System.out.println(res==0?"":res);
			
			//세번째 문제 호출
			Scanner sc=new Scanner(System.in);
			System.out.print("문자입력 : ");
			//System.out.println(fun.checkChar(sc.next().charAt(0)));
		
		//객체, 배열 참조형자료형 매개변수, 리턴으로 작성해보기
		//객체, 배열같은 참조형자료형은 가지고 있는 주소를 전달하기 때문에
		//배열의 얕은복사와같은 개념으로 사용되어 원본값이 수정되는 결과를 가져온다.
//		int[] nums= {1,2,3,4};
//		System.out.println("==== 수정전 ====");
//		for(int a : nums) {
//			System.out.print(a+" ");
//		}
//		System.out.println();//개행표시
//		
//		fun.updateArray(nums);//배열있는 값을 수정하는 로직
//		
//		System.out.println("==== 수정 후 ====");
//		for(int a : nums) {
//			System.out.print(a+" ");
//		}
//		System.out.println();//개행표시
//		
//		System.out.println("수정 전 : "+su);
//		//fun.basicUpdate(su);
//		su=fun.basicUpdate();
//		System.out.println("수정 후  : "+su);

		
		
		//student객체를 만들고 그객체를 수정하는 기능의 매소드만들고 객체를 생성 후 수정결과를 확인
//		Student s=new Student("유병승",3,1,10,180.5,65.5);

		//fun.studentUpdate(s);
//		s=fun.studentUpdate();
//		System.out.println(s.getName()+s.getGrade()+s.getClassRoom()
//					+s.getClassNo()+s.getHeight()+"cm "+s.getWeight());
		
		Member1 m=new Member1();
		fun.insertMember(m);
		System.out.println(m.getId()+" "+m.getPw()+" "+m.getName()
							+" "+m.getEmail()+" "+m.getAddress());
			
		String result = fun.client();
		System.out.println(result);
		
	}

}








