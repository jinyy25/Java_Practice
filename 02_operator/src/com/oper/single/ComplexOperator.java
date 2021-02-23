package com.oper.single;

import java.util.Scanner;

public class ComplexOperator {

	public static void main(String[] args) {
		//복합대입연산자
		//원하는 수를 지정한 변수에 산술연산 후 대입하는 연산자
		int account=100000000;
		//1. 입급
		account+=10;//account=account+10;
		System.out.println(account);
		//2. 인출 5000000
		account-=5000000;
		System.out.println(account);
		
		//입력받은 값의 합계를 구하는 프로그램 만드시오
		//3개입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int sum=sc.nextInt();
		System.out.print("정수입력 : ");
		sum+=sc.nextInt();
		System.out.print("정수입력 : ");
		sum+=sc.nextInt();
		System.out.println("합계 : "+sum);
		sc.nextLine();
		//사용자에게 문자를 3번 입력하게 하고 입력받은 문자를 
		//모두 출력하는 프로그램
		String msg="";
		System.out.print("메세지 입력 : ");
		msg+=sc.nextLine();//msg=msg+입력값;
		System.out.print("메세지 입력 : ");
		msg+=sc.nextLine();
		System.out.print("메세지 입력 : ");
		msg+=sc.nextLine();
		System.out.println("입력한 메세지 : "+msg);
		
		//국어, 영어, 수학, 코딩 성적을
		//입력받아 합계와 평균을 구하는 프로그램
		// * 국어,영어,수학,코딩 점수는 따로 보관할 필요가 없음
		int sum1=0;
		int count=0;
		System.out.print("국어 : ");
		//int kor=sc.nextInt();
		sum1+=sc.nextInt();
		count++;
		System.out.print("영어 : ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("수학 : ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("코딩 : ");
		sum1+=sc.nextInt();
		count++;
		System.out.println("합계 : "+sum1+" 평균 : "+((double)sum1/count));
		System.out.printf("합계 : %d 평균 : %.2f",sum1,(sum1/4.0));
	}
	
}




