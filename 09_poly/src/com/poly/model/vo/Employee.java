package com.poly.model.vo;

public class Employee extends Person{

	private String deparment;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, int age, String address, String deparment, String job, int salary) {
		super(name, age, address);
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}



	public Employee(String deparment, String job, int salary) {
		super();
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String getName() {
		return "내가 누구게?";
	}
	
	@Override
	public String toString() {
		//return "Employee 부서 "+deparment+" 직책 "+job+" 월급 "+salary;
		return getName()+getAge()+getAddress()+deparment+job+salary;
	}
	
	@Override										//Object와 Employee를 동등비교 시켜 상속시킴
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;				//e변수 설정
			
			
			if(super.getName().equals(e.getName())	//e.getName과 상속한getName을 비교	
					&&this.salary==e.salary) {		//위와 동일하게 salaty비교
				return true;						//같다면 true로 반환
			}
		}
		return false;
	}
	
	@Override
	public Employee clone() {
		//깊은복사
		return new Employee(getName(),getAge(),getAddress(),
							deparment,job,salary);
	}
	
}
