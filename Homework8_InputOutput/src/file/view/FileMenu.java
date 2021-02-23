package file.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import file.controller.FileController;

public class FileMenu {
	Scanner sc=new Scanner(System.in);
	FileController fc=new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("**** My Note ****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : fileSave();break;
			case 2 : fileOpen();break;
			case 3 : fileEdit();break;
			case 9 : System.out.println("프로그램을 종료합니다.");break;	
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");return;
			}			
		}		
	}
	public void fileSave() {
		StringBuilder sb=new StringBuilder();
		sc.nextLine();
		while(true) {
		System.out.println("파일에 저장할 내용을 입력하세요\n ex끝it 이라고 입력하면 종료됩니다.");
		System.out.print("내용 : ");
		String n=sc.nextLine();	
		if(n.equals("ex끝it")) {
			break;
		}
		sb.append(n+"\n");
		}
		
	String file="";
	Loop:
		while(true) {
			System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			file=sc.next();
			if(fc.checkName(file)) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
				char ch=sc.next().charAt(0);
				switch(ch) {
				case 'y': case 'Y' : break Loop;
				case 'n': case 'N' : break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");break;
				}				
			}else {
				break;
			}			
		}
		fc.fileSave(file,sb);
		System.out.println("성공적으로 저장하였습니다");		
	}	
	
	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String file =sc.next();
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		}else {
			System.out.println("없는 파일입니다.");
		}		
	}
	
	public void fileEdit() {	
		System.out.println("수정할 파일 명 : ");
		String file = sc.next();
		if(fc.checkName(file)) {
			StringBuilder sb=new StringBuilder();				//수정
			sc.nextLine();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 라고 입력하면 종료됩니다.");
				String temp=sc.nextLine();
				if(temp.equals("ex끝it")){
					break;
				}
				sb.append(temp+"\n");
			}
			fc.fileEdit(file, sb);
			System.out.println("성공적으로 저장하였습니다.");
		}else {
			System.out.println("없는 파일입니다.");
		}
	}
	public int choice() {
		try {
			return sc.nextInt();			
		}catch(InputMismatchException e) {
			return 0;
		}
	}
	
	
}
