package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	
	Scanner sc=new Scanner(System.in);
	EmployeeController ec=new EmployeeController();

	Employee e=new Employee(0,null,(char)0,null,null,0,0);
	
	public EmployeeMenu() {	
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : insertEmp();break;
			case 2 : updateEmp();break;
			case 3 : deleteEmp();break;
			case 4 : printEmp();break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;			
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");break;
			}
		}
	}
	public void insertEmp() {	
			System.out.print("사원 번호 : ");
			int empNo=sc.nextInt();
			e.setEmpNo(empNo);
			System.out.print("사원 이름 : ");
			String name=sc.nextLine();
			e.setName(name);
			sc.nextLine();
			System.out.print("사원 성별 : ");
			char gender=sc.nextLine().charAt(0);
			e.setGender(gender);
			System.out.print("전화 번호 : ");
			String phone=sc.nextLine();
			e.setPhone(phone);
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n)");
			char choice=sc.nextLine().charAt(0);
			
			while(true) {
				switch(choice) {
				case 'y': case 'Y' :
				System.out.println("사원 부서 : ");
				String dept=sc.nextLine();
				System.out.println("사원 연봉 : ");
				int salary=sc.nextInt();
				System.out.println("보너스 율 : ");
				double bonus=sc.nextDouble();
				ec.add(empNo, name, gender,phone,dept,salary,bonus);return;
				
				case 'n':case 'N': ec.add(empNo, name, gender, phone);return;
				
				default : System.out.println("잘못 입력하셨습니다.");break;
				}
			}	
	}
	public void updateEmp() {	
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.\n 사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int choice =sc.nextInt();
		while(true) {
			switch(choice) {
			case 1 : System.out.println("수정할 전화번호 : ");
					 String phone = sc.nextLine();
					 ec.modify(phone); break;
			case 2 : System.out.println("수정할 연봉 : ");
					 int salary=sc.nextInt();	
					 ec.modify(salary); break;
			case 3 : System.out.println("수정할 보너스 : ");
				     double bonus=sc.nextDouble();
				     ec.modify(bonus); break;
			case 9 : System.out.println("메인메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다"); break; 
			}
		}
	}
	public void deleteEmp() {
		sc.nextLine();
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		String ch=sc.nextLine();
		if(ch.equals("y")||ch.equals("Y")) {
			ec.remove();
		if(e.getName()==null) {
			System.out.println("데이터 삭제에 성공하였습니다.");
		}else {System.out.println("삭제에 실패하였습니다.");
		}
		}else System.out.println("잘못 입력하셨습니다.");
	}
	
	public void printEmp() {
		if(e.getName()==null)  System.out.println("사원 데이터가 없습니다."); 
		else System.out.println(ec.inform());
	}
	
	
}
