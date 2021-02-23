package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sport;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {

	public void arrayListTest() {
		
	//1. list : 인터페이스		
		//특징 : 배열과 유사한 자료구조를 가지고 있음 
		//인덱스 값을 가짐, 순서가 있음, 중복값 저장 가능
		//종류 : ArrayList, LinkedList, Vector
				
	//2. ArrayList : 객체를 보관하는 데이터 보관용 클래스 
		//Object[] 방식으로 보관 				활용방식은 배열과 비슷 : 배열은 출력, 대입 []를 이용
		
		//클래스를 생성 (instance화)하여 활용
		ArrayList list = new ArrayList();
		
		//list객체이기 때문에 메소드를 이용해서 처리.
		//list에 값을 넣는 방법 : add(객체/인덱스)메소드를 이용
		list.add("윤진영"); 					//0
		//add method를 넣으면 순차적으로 0번 인덱스부터 값이 대입됨
		list.add("조현크우아아ㅏㅏ"); 			//1
		
		//list는 다양한 객체를 보관할 수 있음
		list.add(new GregorianCalendar()); 	//2
		list.add(new Scanner(System.in)); 	//3
				
		//list에 저장된 객체 출력하기 : get(index) method를 이용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list.get(00)로 불러옴  => 변수명  => 객체의 주소	
		//객체형으로 저장하기 때문에 형변환을 사용 
		System.out.println(((String)list.get(0)).charAt(0));			//윤

		//반복문을 활용해서 데이터에 접근하여 처리할 수 있음
		int [] a=new int[10];											//int 배열 형성
				
		//list길이  :  list.size(); 										//실제 데이터만 출력  //length와 다른점 
		System.out.println(list.size());//list에 대입되어 있는 객체의 수를 출력
		
		//ex) list데이터 중 GregorianCalender객체면의 년도 출력
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i) instanceof GregorianCalendar) { 
			//instanceof list.size는 object로 반환 대기 때문에
			
			GregorianCalendar gc=(GregorianCalendar)list.get(i);
			System.out.println(gc.get(Calendar.YEAR));			
			}
		}		
		List sports = new ArrayList();									//java의 List interface를 구현한 것이 ArrayList기 때문에 가능
		
		//내가 좋아하는 스포츠 4개를 대입 //규칙생략
		sports.add(new Sport("구기종목","축구",11,new String[5]));
		//sports.get(0)=new Sport("구기종목","축구",11,new String[5]);
		sports.add(new Sport("구기종목","야구",9,null));
		sports.add(new Sport("기구운동","헬스",1,null));
		sports.add(new Sport("물","수영",8,null));
		
		// for문을 이용해서 전체출력하기
		//for(int i=0;i<list.size();i++) {
			//System.out.println(sports.add(i));
		//}
		
	//3. forEach문 이용한 출력
		for(Object o : sports) {
			System.out.println(o);
		}
				
		//종목이 구기종목인 스포츠만 출력	- 축구				//forEach문 이용
		for(Object o : sports){
			if(o instanceof Sport) { 				//변수o가 Sport에 대입된다면  
				Sport s=(Sport)o;					//변환을 통해
				if(s.getType().equals("구기종목")) {	//getType에 구기종목이 있는지 확인후
				System.out.println(s);				//출력
				}
			}
		}
		//두번째 방법				- 수영				//for문 이용
		for(int i=0;i<sports.size();i++) {
			if(sports.get(i) instanceof Sport) {
				Sport s=(Sport)sports.get(i);
				if(s.getType().equals("물종목")) {
					System.out.println(s);
				}
				
			}
		}	
		
	//4. list는 원하는 위치에 데이터 넣기 : .add(index,data); 
		System.out.println("=== 원하는 위치에 값넣기 ===");
		System.out.println(sports.get(2));			//2번째 list에 있는 자료를 불러옴
		
		sports.add(2,new Sport("구기종목","농구",5,null));//2번에 새로운 값을 넣음
		System.out.println(sports.get(2));			//사이즈가 자동으로 증가됨
		System.out.println(sports.get(3));			//2번이 3번으로 밀림
		
	//5. list 특정위치의 값 변경 : set(index,data);
		System.out.println("=== 특정위치 값 변경하기 ===");
		System.out.println(sports.get(sports.size()-1));	//맨마지막에 있는 값 (수영)
		
		
		System.out.println(sports.get(sports.size()-2));	//(헬스)
		sports.set(sports.size()-2,"오늘 비오나?");				//-2인덱스에 문구 입력
		
		System.out.println(sports.get(sports.size()-2));	//(오늘 비오나?)
		System.out.println(sports.get(sports.size()-1));	//(축구)
		
		System.out.println(sports);							//전체출력 - override출력
		
			
	//6. 데이터를 한번에 지움 : .clear(index);	
		
	//7. list에 데이터가 있는지 확인 : .isEmpty();							
		//if(sports.size()>0) {
		if(!sports.isEmpty()) {								//isEmpty
			System.out.println("데이터 있음");					//isBlank null값 체크시 이용
		}else {
			System.out.println("데이터 없음");
		}
		
	//8. 원하는 데이터,객체 삭제 : .remove(index);
		System.out.println(sports.size());
		
		sports.remove(3);									//3번 값 지움
		System.out.println(sports.size());
		System.out.println(sports.get(3));
		//System.out.println(sports.get(5));				//5번 값 없음
		
		System.out.println("지우기 전 갯수");					//원하는 객체를 삭제 	
		System.out.println(sports.size());
		sports.remove(new Sport("구기종목","축구",11,new String[5]));
	
		
		//실제 들어가는 값 동등비교 : @Override equals() 
		System.out.println("지운 후 갯수");
		System.out.println(sports.size());
		System.out.println(sports.get(0));
		
		
	//9. list내부에서 특정객체를 찾을 매소드 : .contains() true/false로 출력
		System.out.println(sports.contains(new Sport("물","수영",8,null)));
		System.out.println(sports.contains(new Sport("구기종목","축구",11,new String[5])));
		
		
		//list 중복값 저장 
		list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add("진영");
		}
		for(Object n : list) {
			System.out.println(n);
		}
	}
	
		
		//list자료 정렬
		public void listSort() {
			//list에는 인덱스를 기준으로 순서가 존재
			List nums=new ArrayList();
			
			for(int i=0;i<10;i++) {
				nums.add((int)(Math.random()*30)+1);
			}
			//for(Object o : nums){						//아래 메소드 이용
				//System.out.println(o);
			//}	
			
	//10. 정렬 오름차순 : Collections.sort(변수);
			Collections.sort(nums);						
			System.out.println("=== 오름차순 정렬 후 ===");
			printList(nums);							//printList 객체에 nums 매개
					
			//정렬 내림차순									
			//1. 내림차순을 위한 객체 생성 -> Comparator 인터페이스
			//2. 객체 내부에 정렬 순서를 정함 -> Comparable 인터페이스
			
	//11. compare()/compareTo()매소드 구현 
			Collections.sort(nums,new NumberSort());
			System.out.println("=== 내림차순 정렬 후 ===");
			System.out.println(nums);
			nums.clear();		
			
			//문자열 정렬하기 
			nums.add("남지선");
			nums.add("강수정");
			nums.add("황진호");
			nums.add("설진호");
			nums.add("김다희");
			nums.add("유병승");
			System.out.println("==== 문자열 정렬  ====");
			printList(nums);
			
			//오름차순 정렬
			Collections.sort(nums);
			System.out.println("=== 문자열 오름차순 정렬  ===");
			printList(nums);
			
			System.out.println("=== 문자열 내림차순 정렬 ===");
			Collections.sort(nums,new StringSort());
			System.out.println(nums);		
			
			//객체가 들어가 있는 list 정렬하기
			nums.clear();
			nums.add(new Sport("구기종목","축구",11,null));
			nums.add(new Sport("구기종목","농구",5,null));
			nums.add(new Sport("헬스","헬스",1,null));
			nums.add(new Sport("구기종목","테니스",2,null));
			nums.add(new Sport("구기종목","골프",2,null));
			
			System.out.println("==== 정렬전 ====");
			printList(nums);
			//Collections.sort(nums);
			Collections.sort(nums,new SportPlayerSort(true));
			
			printList(nums);
			Collections.sort(nums,new SportPlayerSort(false));
			
			System.out.println("==== 정렬 후 ====");
			printList(nums);
						
			//정렬 익명클래스를 이용해서 정렬				//한번만 사용할때 쓰는 임시 클래스									
	//12. 람다식을 이용해서 정렬				 
			Collections.sort(nums,new Comparator() {
				
				@Override
				public int compare(Object o1, Object o2) {
					return ((Sport)o1).getPlayer()-((Sport)o2).getPlayer();
				}
			});
			printList(nums);
			
			//람다식을 이용해서 한줄로 정렬
			Collections.sort(nums,(o1,o2)  ->  (((Sport)o2).getPlayer()-((Sport)o1).getPlayer()));
			printList(nums);
			
		}
		
	
		
		private void printList(List list) {
			for(Object o : list) {
				System.out.print(o+" ");
			}
			System.out.println();
		}
											
		
	//inkedList가 더 빠름 - 만들고 지우고 바로 가능
		//ArrayList는 더 수정삭제가 힘듬						//일렬로 저장되는 형태기 때문
		public void linkedList() {						//linkedList가 더 빠름 - 만들고 지우고 바로 가능
			//LinkedList ArrayList와 비슷한 저장방식			//즉 ,, 수정이 더 간편 - 중간에 수정가능
			LinkedList list=new LinkedList();			//자유로운 전자 형태기 때문 
			
			//값 대입
			list.add("윤진영");
			list.add("윤정윤");
			
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			
			list.add(1,"박현우");
			list.remove(1);			
		}	
	
}
