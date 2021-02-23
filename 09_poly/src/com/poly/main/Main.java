package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {

	public static void main(String[] args) {
		//다형성 활용하기
		//부모타입으로 설정되어있는 변수에 
		//자식타입의 객체가 대입될 수 있는 것!
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		Animal ani2;
		
		ani=new Cat();//다형성!
		System.out.println(ani);
		ani=new Duck();//다형성!
		System.out.println(ani);
		ani=new Lion();//에러?? 상속관계가 없기 때문에! 다형성이 적용이 안됨.
		System.out.println(ani);
		//상속관계가 전제 조건이 됨!
		
		//부모는 자식타입의 변수에 들어갈 수 있니?????
		//tom=new Animal();//부모타입은 자식타입에게 대입될수없다!
		
		//다형성에 의해 자식객체가 부모타입으로 대입되면,
		//부모객체의 내용만 볼 수 있게 설정됨(업캐스팅)
		Person p=new Employee("설진호",48,"포천","개발팀","연구원",100);
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDeparment());//부모가 가지고 있는 데이터만 볼 수 있음
		//자식의 내용은 볼 수 없게됨.
		//Employee e=(Employee)p;
				
		//부모타입으로 대입된 자식객체의 데이터에 접근을 하려면
		//강제형변환을 해야함.
		System.out.println(((Employee)p).getDeparment());
		p=new Singer("김세민",32,"남양주","너만보인단말이야~",2,"밴드");
		
		//Singer s=(Singer)p;
		
		//functional객체에서 지원하는 출력메소드 이용 객체출력하기
		Employee e=new Employee("설진호",48,"포천","개발팀","연구원",100);
		Singer s=new Singer("김세민",32,"남양주","너만보인단말이야~",2,"밴드");		
		
		new Functional().print(e);//매개변수 employee
		new Functional().print(s);//매개변수 Singer
		new Functional().print(new Person());
		
		//p에는 Singer가 있음
		//사실 p는 Person인데 실제 들어가 있는 객체를 확인
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//부모객체를 이용한 여러 자식객체보관하기
		//객체배열로 보관하기
		Person[] persons=new Person[5];
		//본인Person포함한 자식객체가 모두 들어갈 수 있음
		persons[0]=new Singer("김세민",27,"경기도 남양주","너만보인단말이야",4,"가요");
		persons[1]=new Employee("유다해",22,"서울","개발팀","연구원",100);
		persons[2]=new Person("설진호",32,"지역차별");
		persons[3]=new Singer("조현",28,"서울","깡",10,"힙합");
		persons[4]=new Employee("이세현",27,"서울","연구팀","연구원",20);
		
		//프로그램에 현재등록되어있는 가수의 수는?
		//프로그램에 현재등록되어있는 가수와 사원수는?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("가수는 "+singerCount+"명 있음");
		System.out.println("사원은 "+empCount+"명 있음");
		
		//Object -> 모든클래스 부모, 최상위 객체
		Object obj=new Person();
		System.out.println(obj);//Person객체
		obj=new Employee();
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//모든 클래스는 Object가 가지고 있는 매소드를 사용할 수 있다.
		System.out.println(obj);//Employee객체
		
		System.out.println(persons[0]);
		
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Employee) {
				Employee ee=(Employee)persons[i];
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()
				+ee.getDeparment()+ee.getJob()+ee.getSalary());
			}else if(persons[i] instanceof Singer) {
				Singer ss=(Singer)persons[i];
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			}else if(persons[i] instanceof Person) {
				Person pp =persons[i];
				System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
			}
		}
		System.out.println("===동적바인딩을 이용한 출력====");
		//동적바인딩을 이용하면 알아서 변수에 들어가 있는 객체의 오버라이딩되어있는 메소드를 호출하게되어
		//형변환 없이 변수에 들어가 있는 객체의 매소드를 이용할 수있다.
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object.toString매소드를 호출함
		}
		System.out.println("====동적바인딩 재설명 ====");
		Person person=new Person("이순신",44,"거북선");
		System.out.println(person.getName());
		person=new Employee("유병승",19,"경기도시흥시","자바학부","강사",100);
		System.out.println(person.getName());
		
		
		//toString() -> 참조변수를 System.out.println() 매개변수로 넣으면
		//참조형변수의 내용을 출력해야하는데 주소가 들어가 있으니 있는 그대로 주소를 출력하는게 아니고
		//보기 쉽게 출력하기 위해 자동으로 toString()매소드를 호출하여 출력
		//모든객체에 반영되기 위해 Object객체에 선언
		Date d=new Date();
		String str=new String("안녕");
		System.out.println(str);
		System.out.println(d);
		Animal ani1=new Animal();
		System.out.println(ani1.toString());
		System.out.println(ani1);
		Object obj2=ani1;
		System.out.println(obj2.toString());
		
		
		//객체의 동등비교
		Person jo=new Person("조현",28,"서울");
		Person jo2=new Person("조현",28,"인천");
		System.out.println(jo==jo2);
		//객체를 비교할때? how?? equals String....
		System.out.println(jo.equals(jo2));
		//객체의 동등성을 비교할때는 object에 있는 equals()매소드를 
		//Override하여 사용한다.
		System.out.println(jo.equals("하하하하"));
		
		//객체 복사 clone() Override하기
		Employee emp=new Employee("강경록",30,"수원","개발팀","팀장",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
		Person po=new Employee();
		//po.to
		System.out.println(po.toString());//???
		//1. Person  2. Employee
		
		
		
		
		
		
	}

}
