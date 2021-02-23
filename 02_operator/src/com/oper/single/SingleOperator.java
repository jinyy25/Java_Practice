package com.oper.single;

import java.util.Scanner;

public class SingleOperator {

	public static void main(String[] args) {
		//단항연산자 활용하기
		//부정연산자 활용하기
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!!flag);
		//부정연산은 논리변수에 드물게 사용하고, 비교연산, 논리연산과 함께 
		//많이 사용
		int age=19;
		//if(!(age>19&&id.equals("admin")))
		
		//증가, 감소연산
		//++, --
		int su=19;
		su++;//su=su+1
		su++;
		su++;
		System.out.println(su);
		su--;
		su--;
		System.out.println(su);
		//증가, 감소연산시 
		//전위, 후위연산이랑 개념!
		//전위 연산 : 변수앞에 연산자를 작성 ++su
		//후위연산 : 변수뒤에 연산자를 작성 su++
		//다른 연산자와 연산이될때 차이가 발생함.
		//전위연산 -> 먼저 증/감연산을 처리하고 다른 연산 실행
		//후위연산 -> 다른 연산을 먼저 처리하고 증/감연산
		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1;
		su1=29;
		su3=su1++;
		System.out.println("su2 : "+su2);
		System.out.println("su3 : "+su3);
		System.out.println("su1 : "+su1);
		
		//전위, 후위든 단독으로 사용을 하게되면 변경사항없음!
		
		//증가/감소연산사용??
		//1. 반복문에 자주 많이 사용!
		//for(int i=0;i<10;i++)/for(int i=100;i>10;i--)
		//2. 특정한값의 갯수를 셀때
		//count++;
		int su4=30;
		int su5=0;
		//su5=su4+++20;//50
		su5=++su4+20;//51
		System.out.println(su5);
		
		//산술연산자 활용하기
		//기본적인 더하기, 빼기, 나누기, 곱하기, 나머지값구하기
		//숫자연산을 하는것,  더하기는 문자연산도 가능
		//정수 두개 선언 후 7, 10값 넣기
		int su6=7;
		int su7=10;
		//더하기
		System.out.println(su6+su7);//변수에 대입/출력해야지 에러나지 않음
		System.out.println(su6+20);
		System.out.println(5+10);
		//연산의 결과를 변수에 대입
		int result=su6+su7;
		//byte result2=su6+su7;
		System.out.println(result);
		//빼기
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		//곱하기
		System.out.println(su6*su7);
		result=su6*su7;
		System.out.println(result);
		//나누기 *자료형에 주의를 해야함. 
		System.out.println((double)su6/su7);//정상적으로 나오려면???
		//result=(double)su6/su7;
		double result2=(double)su6/su7;
		System.out.println(result2);
		
		//나머지구하기
		System.out.println(su6%su7);
		System.out.println(5%3);
		
		//짝수를 구하세요~ 홀수, 배수
		//입력받은 수가 짝수인지 확인
		//입력받기! 키보드로
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su8=sc.nextInt();
		
		String msg=sc.nextLine();
		
		System.out.println(su8%2);

//		if(su8%2==0) {
//			System.out.println("짝수!");
//		}	
		
				
		
	}
	
}
