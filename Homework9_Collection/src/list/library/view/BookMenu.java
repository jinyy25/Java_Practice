package list.library.view;

import java.util.List;
import java.util.Scanner;

import list.library.controller.BookController;
import list.library.model.vo.Book;

public class BookMenu {
	Scanner sc=new Scanner(System.in);
	BookController bc= new BookController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("== Welcome KH Librarry ==");
		System.out.println("***** 메인 메뉴 *****");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		int ch=Integer.parseInt(sc.next());
		switch(ch) {
		case 1 : insertBook(); break;
		case 2 : selectList(); break;
		case 3 : searchBook(); break;
		case 4 : deleteBook(); break;
		case 5 : ascBook(); break;
		case 9 : System.out.println("프로그램을 종료합니다.");return;
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	}	
	}
	
	//1. 새 도서 추가용 view 메소드
	public void insertBook() {
		System.out.println("=== 새 도서 추가 ===");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("저자명 : ");
		String author=sc.nextLine();
		
		System.out.print("장르 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int catNo=sc.nextInt();
		String[] category={"","인문","자연과학","의료","기타"};
		System.out.print("가격 : ");
		int price=sc.nextInt();	
		
		bc.insertBook(new Book(title,author,category[catNo],price));
	}
	//2. 도서 전체용 view 메소드
	public void selectList() {
		System.out.println("=== 도서 전체 조회 ===");
		List<Book> list=bc.selectList();
		if(list==null) System.out.println("존재하는 도서가 없습니다.");
		else System.out.println(list);
	}
	//3. 도서 검색용 view 메소드
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.println("검색 키워드 : ");
		sc.nextLine();
		String keyword=sc.nextLine();
		List<Book> searchList=bc.searchBook(keyword);
		if(searchList==null) System.out.println("검색 결과가 없습니다.");
		else System.out.println(searchList);
	}
	//4. 도서 삭제용 view 메소드
	public void deleteBook() {
		System.out.println("==== 도서 삭제 ====");
		System.out.print("삭제할 도서 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author=sc.nextLine();
		Book bk=bc.deleteBook(title, author);
		if(bk==null)System.out.println("성공적으로 삭제되었습니다.");
		else System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
	//4. 도서명 오름차순 정렬용
	public void ascBook() {
		if(bc.ascBook()!=1)System.out.println("정렬에 성공하였습니다.");
		else System.out.println("정렬에 실패하였습니다.");
	}

}
