package practice.token.run;

import java.util.Scanner;

import practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc=new Scanner(System.in);
	TokenController tc= new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int ch=sc.nextInt();		
			switch(ch) {			
			case 1 :	tokenMenu(); break;
			case 2 : 	inputMenu(); break;
			case 9 :	System.out.println("프로그램을 종료합니다.");return;
			default : 	System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");			
			}			
		}		
	}
	
	public void tokenMenu() {
		String str= "J a v a P r o g r a m";		
		//토큰 처리 전 글자,개수
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 글자 개수 : "+str.length());
		str=tc.afterToken(str);
		//토큰처리 후 글자,개수,대문자 변환
		System.out.println("토큰 처리 후 글자 : "+str);
		System.out.println("토큰 처리 후 글자  개수 : "+str.length());
		System.out.println("모두 대문자로 변환 : "+tc.allCap(str));		
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		sc.nextLine();
		String input=sc.nextLine();
		
		input=tc.firstCap(input);
		System.out.println("첫 글자 대문자 : "+input);
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one =sc.nextLine().charAt(0);
		int result=tc.findChar(input, one);
		System.out.println(one + "문자가 들어간 개수 : "+result+"\n");
		
		
		
	}
}
