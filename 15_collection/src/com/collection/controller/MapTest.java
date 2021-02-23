package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	
	
	public void mapTest() {
		
	//Map : 객체데이터를 보관하는 클래스
		//저장방식 : key : value 쌍으로 이루어짐								//클래스기 때문에 메소드를 이용하여 데이터 처리				
		//Map : list특성, set특성을 동시에 갖고 있음

		//key의 자료형 	  : Object;		 								//String, Integer로 많이 사용.
		//value의 자료형  : Object;								 		//모든 객체 사용
		//종류 : HashMap, TreeMap, LinkedHashMap

		//"Web"에서 프론트에 보내는 값을 key:value 형식으로 가져오게됨
		//request.getParameter("userId");key:value
		

	//1. 생성 : HashMap();
		HashMap map=new HashMap();
		
	//2. Map 값넣기 : put(key,value);
		map.put(1,"유병승");
		map.put(2,"김세민");
		map.put(3,"윤병현"); 
			
		//key, value에는 모든 객체가 들어갈 수 있음
		map.put("펭수", "남지선");
		map.put("admin",new Member("admin","1234","관리자",19));
		map.put(new Member("user01","1111","유저1",20),1);
		
	//3. Map 값출력 : get(key); 										// value값을 가져올 수 있음!!!!!
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","유저1",20)));
		
		
	//4. 모든 키를 Set에 담아 반환 : keySet(); 								//key는 중복 안됨 
		//key를 Set 방식으로 저장 											//둘다 iterator 사용
		
		//전체출력방법 1  :  keySet();
		//Map에 보관 중인 key 전체를 출력 : set을 받아 출력해야 함
		System.out.println("=== keySet으로 출력 ===");
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {										//iterator사용시 hasNext로 공간확인
			Object key=it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		//전체출력방법 2	 : Map.Entry(); 								//key/value 동시접근시 유용
		//Map.Entry 객체를 이용해서 한번에 key, value값을 출력 
		System.out.println("=== Map.Entry객체로 출력 ===");
		
		//entrySet();
		Set mapEntry=map.entrySet();
		Iterator it2=mapEntry.iterator();
		
		while(it2.hasNext()) {			
			Map.Entry entry=(Map.Entry)it2.next();					//Map.Entry객체에는 key값과 value값을 동시에 보관하고 있음
			
			//key값 : Map.Entry.getKey();
			//value값 : Map.Entry.getValue();
			
			//System.out.println(it2.next());
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());			
		}
		
		System.out.println("=== for each문으로 처리 ===");
		//키값가져오기
		for(Object o : map.keySet()) {
			System.out.println(o);
			System.out.println(map.get(o));
		}
		
		for(Object a : map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//map 객체에 저장하고 활용
		HashMap members=new HashMap();
		
		//member객체 3개
		members.put(1, new Member("prince","4444","유병승",19));
		members.put(2, new Member("seolseol","3215","설진호",29));
		members.put(3, new Member("rockrock","락락","강경록",19));
		
		//저장된 멤버의 id만 출력
		//1
		Set mp=members.keySet();
		Iterator it3=mp.iterator();
		
		while(it3.hasNext()) {
			//it3.next() -> key값
			Object o=members.get(it3.next());//value
			System.out.println(((Member)o).getId());
		}

		//2	
		Set memEntry=members.entrySet();
		it3=memEntry.iterator();
		
		while(it.hasNext()) {
			Map.Entry en=(Map.Entry)it3.next();
			Member m=(Member)en.getValue();
			System.out.println(m.getId());
		}
		
		//3
		for(Object o : members.keySet()) {
			//Member m=(Member)members.get(o);
			//System.out.println(m.getId());
			System.out.println(((Member) members.get(o)).getId());
			}
		
		//map은 key 값이 중복이 안됨.
		System.out.println(members.get(1));
		members.put(1,"이거는 어떻게 되니 ?");
		System.out.println(members.get(1));
	
		//map은 key 값이 중복이 되니?
		members.put(4,new Member("rockrock","락락","강경록",19));
		members.put(5,new Member("rockrock","락락","강경록",19));
		members.put(6,new Member("rockrock","락락","강경록",19));
		System.out.println(members);
		
		
	//5. map 객체갯수확인 : size();
		System.out.println(members.size());
		
	//6. containsKey()/contatinsValue() : key값이 있는지, value값이 있는지 확인
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("rockrock","락락","강경록",19)));
		
	//7. map에 있는 데이터 삭제 : .remove();
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("rockrock","락락","강경록",19));
		members.clear();
	}
	
}
