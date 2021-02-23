package com.oper.single;

import java.util.Scanner;

public class ThridOperator {
	public static void main(String[] args) {
		//삼항연산자 활용하기
		int sum=30;
		int sum2=20;
		System.out.println(sum>sum2?"크다":"작다");
		//이름을 입력받고 그 이름이 설진호면 같습니다 출력, 아닙니다!를 출력하는
		//프로그램작성
		Scanner sc=new Scanner(System.in);
		System.out.print("내가 누군지 맞춰봐 : ");
		String name=sc.nextLine();
		String msg=name.equals("설진호")?"맞아요!":"아닙니다!";
		System.out.println(msg);
		
		//티켓이 있고, 나이가 19초과면 들어오세요! 아니면 입장불가!
		//티켓번호 : 333
		//티켓번호, 나이를 입력받아 처리
		System.out.print("티켓번호 입력 : ");
		int ticket=sc.nextInt();
		System.out.print("당신의 나이 : ");
		int age=sc.nextInt();
		String result=ticket==333&&age>19?"들어오세요!":"입장불가!";
		System.out.println(result);
		//int plus=age>19?age++:age--;
		//System.out.println(plus+" "+age);
		
		//화면구현 간단한 조건으로 분기처리할때 이용
		/* <input type='text' value='age>19?"안녕":""' > */
		
		//삼항연산 내부에 삼항연산자 넣기
		//나이가 19이상이면 성년입니다. 출력
		//아니고 17이상 18이하면 고등학생
		//아니면 14이상 16이하면 중학생
		//아니면 초등학생
		System.out.println(age>19?"성년입니다.":
									age>=17?"고등학생":
										age>=14?"중학생":"초등학생");
		
		
	}
}







