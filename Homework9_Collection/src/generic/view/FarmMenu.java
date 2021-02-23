package generic.view;

import java.util.Scanner;

import generic.controller.FarmController;

public class FarmMenu {
	Scanner sc=new Scanner(System.in);
	FarmController fc= new FarmController();
	
	public void mainMenu() {
		System.out.println("======= Kh 마트 ======");
		System.out.println("***** 메인 메뉴 *****");
		System.out.println("1. 직원메뉴");
		System.out.println("2. 손님메뉴");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : adminMenu(); break;
			case 2 : customerMenu(); break;
			case 9 : System.out.println("프로그램 종료"); return; 
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
			}
		}
	}
	public void adminMenu() {
		System.out.println("***** 직원 메뉴 *****");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 종류 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : addNewKind(); break;
			case 2 : removeKind(); break;
			case 3 : changeAmount(); break;
			case 4 : printFarm(); break;
			case 9 : mainMenu(); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	public void customerMenu() {
		System.out.println("***** 고객 메뉴 *****");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : buyFarm(); break;
			case 2 : removeFarm(); break;
			case 3 : printBuyFarm(); break;
			case 9 : mainMenu(); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	public void addNewKind() {}
	public void removeKind() {}
	public void changeAmount() {}
	public void printFarm() {}
	public void buyFarm() {}
	public void removeFarm() {}
	public void printBuyFarm() {}

	
}
