package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {

		public void setTest() {
			
			//Set : 객체방식으로 .. 메소드를 호출해서 저장, 호출
			//특징 : 순서가 없음, 데이터를 구분할 수 있는 구분자가 없음, 중복값 저장이 불가능
			//종류 : HashSet, TreeSet
			HashSet set=new HashSet();
		
			//1. add(값)매소드를 사용 : 데이터 대입			
			set.add("윤진영");
			set.add("조현");
			set.add("강경록");
			set.add("이세현");
			set.add("황진호");
	
			//2. Iterator : 모든 자료를 불러오는 object					// 봉지에서 하나를 끄집어 내는 느낌	
			//set에 저장된 데이터는 데이터를 구분할 수 있는 구분자가 없기 때문에 나름의 방식이 무작위처럼 비춰짐
							
			Iterator it=set.iterator();						    // 모든 객체를 트레이(set)으로 넘겨준다. 
			//while(it.hasNext()) {								// 트레이 밑에 자료가 있다면
				//System.out.println(it.next());				// 출력
				//System.out.println(it.next());				// set.add가 5개 인데 짝수기 때문에 
																// 2개씩 빼면 에러가 난다.
				//while(it.hasNext()) {
				//	Object o=it.next();							// 2개씩 빼고 싶다면 다음과 같이 이용
				//	System.out.println(o);
//				}
					
			// hasNext() : 현재 위치에서 다음 데이터가 있나요 ? => True /False
			// Next() : 다음데이터를 가져오겠습니다. 		=> 다음 데이터를 가져옴

			//set에 저장된 이세현 찾기
			//Iterator it2=set.iterator();						// 재활용 불가능 
			it=set.iterator();									// 다음과 같이 다시사용 
			while(it.hasNext()) {
				Object o=it.next();
				if(o.equals("이세현")) {
					System.out.println(o);
				}			
			}													

			System.out.println("==== forEach이용 ====");
			
			//forEach문 사용 : set에 있는 전체 객체를 조회			
			for(Object o : set) {								// set에 저장되어 있는 것들을 o에 대입하여 출력
				System.out.println(o);
			}
			
			//set은 중복값 저장이 안됨
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("조현");
			set.add("설진호");
			set.add("설진호");
			set.add("설진호");
			set.add("설진호");
			
			//전체출력
			Iterator it3 = set.iterator();
			while(it3.hasNext()) {
				System.out.println(it3.next());
			}

			//Lotto중복값
			HashSet lotto=new HashSet();
			
			
//			for(int i=0;i<7;i++) {
//				lotto.add((int)(Math.random()*44)+1);
//			}
			
			while(true) {											//무한루프 활용 - 중복값빼고 다시 실행하는 구문
				lotto.add((int)(Math.random()*44)+1);				
				if(lotto.size()==7) {								//7개 차면 멈춤
					break;
				}
			}
				
			//중복값을 저장하지 않음
			for(Object o : lotto) {									
				System.out.print(o + " ");
			}
			System.out.println();
		
			
			//3. size() : set에 있는 데이터 확인
			lotto.clear();
			if(lotto.size()==0) {
				System.out.println("데이터 없음");
			}
			
			//set에 내가 만든 객체넣기
			//Member 클래스 만들고 id,pw,name,age
			//id가 같으면 들어가지 않게 넣기
			//1. admin,1234,관리자,19
			//2. user01,1111,유저1,20
			//3. user02,2222,유저2,21
			//4. user03,3333,유저3,22
			//5. admin,1234,관리자,19	
		}
		
		public void Mem() {
			Set hs=new HashSet();
			Iterator it=hs.iterator();	
			
			hs.add(new Member("admin","1234","관리자",19));
			hs.add(new Member("user01","1111","유저1",20));
			hs.add(new Member("user02","2222","유저2",21)); 
			hs.add(new Member("user03","3333","유저3",22));
			hs.add(new Member("admin","1234","관리자",19));
			
			for(Object o : hs) {
				System.out.println(o);
			}
			
			
			//4. remove(객체) : 삭제(전체삭제, 일부삭제)								//Override 동등비교를 기준으로
			hs.remove(new Member("user01","5555","유병승",18));
			System.out.println("=== 삭제 후 ===");
			
			//반복 2가지 방법 	for문-iterator
//			for(Object o : hs) {
//				System.out.println(o);
//			}

			System.out.println("=== iterator는 재활용 불가능 ===");
			
			//iterator를 다시 활용하려면 재할당								//iterator : 무언가를 반복하고자 할때  
			it=hs.iterator();
			System.out.println(it.next());
			
			
			//5. Set <--> List로 서로 호환
			//Set, List Collection 
			ArrayList list=new ArrayList();
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(2);
			list.add(3);
			System.out.println(list);
			
			Set temp=new HashSet(list);
			list=new ArrayList(new HashSet(list));			
			System.out.println(list);			
		}
	
}
