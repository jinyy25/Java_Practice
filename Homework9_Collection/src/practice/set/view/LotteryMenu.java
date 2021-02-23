package practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import practice.set.controller.LotteryController;
import practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	Scanner sc=new Scanner(System.in);
	LotteryController lc=new LotteryController();

	public void mainMenu() {
		while(true) {
		System.out.println("**** 메인 메뉴 ****");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		
		int ch=choice();
		
		switch(ch) {
		case 1 : insertObject(); break;
		case 2 : deleteObject(); break;
		case 3 : winObject(); break;
		case 4 : sortedWinObject(); break;
		case 5 : searchWinner(); break;
		case 9 : System.out.println("프로그램 종료");return;
		default : System.out.println("잘못 입력했습니다. 다시 입력해 주세요"); break;
		}		
		}	
	}
	public void insertObject() {
		int n=0;
		while(true) {
		System.out.print("추가할 추첨 대상 수 : ");
		n=choice();
		if(n>0) break;
		System.out.println("0보다 큰 정수를 입력하세요");
		}
		
		for(int i=0;i<n;) {
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone=sc.nextLine();
		boolean result = lc.insertObject(new Lottery(name,phone));
		if(result==false) {
		System.out.println("중복된 대상입니다. 다시 입력하세요");
		}else i++;
		}
		System.out.println(n+"명 추가 완료 되었습니다.");
	}
	public void deleteObject() {
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone=sc.nextLine();
		
		boolean result = lc.deleteObject(new Lottery(name,phone));
		if (result==false)System.out.println("존재하지 않는 대상입니다.");
		else System.out.println("삭제 완료 되었습니다.");
	}
	public void winObject() {
		for(Object o : lc.winObject()) {
			System.out.println((Lottery)o);
		}
	}
	public void sortedWinObject() {
		Iterator<Lottery> it=lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void searchWinner() {
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone=sc.nextLine();
		
		boolean result = lc.searchWinner(new Lottery(name,phone));
		if(result==false)System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		else System.out.println("축하합니다. 당첨 목록에 존재합니다.");		
	}	
	public int choice() {
		try {
			return Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			return -1;
		}
	}

}
