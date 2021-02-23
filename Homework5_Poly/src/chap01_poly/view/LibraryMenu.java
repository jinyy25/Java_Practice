package chap01_poly.view;

import java.util.Scanner;

import chap01_poly.controller.LibraryController;
import chap01_poly.model.vo.Book;
import chap01_poly.model.vo.Member;

public class LibraryMenu {
	Scanner sc=new Scanner(System.in);
	LibraryController lc=new LibraryController();
	public void mainMenu() {
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("성별 : ");		
		char gender=sc.next().charAt(0);
		lc.insertMember(new Member(name,age,gender));
		while(true) {			
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지 : ");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : System.out.println(lc.myInfo());break;
			case 2 : selectAll();break;
			case 3 : searchBook();break;
			case 4 : rentBook();break;
			case 9 : System.out.println("프로그램을 종료합니다.");return;	
			default: System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");break;
			}
			}	
		}
	public void selectAll() {	
		for(int i=0;i<lc.selectAll().length;i++) {
			System.out.println(i+"번 도서"+(lc.selectAll()[i]));
		}		
	}
	public void searchBook() {
		sc.nextLine();
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine().trim();
		Book[] b=lc.searchBook(keyword);
		for(int i=0; i<b.length;i++) {
			if(b[i]==null) {
				continue;
			}
			System.out.println(b[i]);
		}
	}
	public void rentBook() {	
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		switch(result) {
		case 0 : System.out.println("성공적으로 대여되었습니다.");break;
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다.");break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");break;
		}
	}
	
}
