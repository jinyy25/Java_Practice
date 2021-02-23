package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		
		//String객체 	: 불변
		//String은 String에 있는 값을 수정, 삽입, 삭제가 불가능
		  String name= "윤진영";
				
		//hashCode() : 주소값
		System.out.println(name+" : "+name.hashCode());
		name+="천재";													//주소값이 다름
		System.out.println(name+" : "+name.hashCode());

		
		//String 객체에서 유용한 메소드
		//1. 문자열에 있는 문자 찾기 : contains();
		String test="가나다라마바사아차카";
//		for(int i=0;i<test.length();i++) {
//			if(test.charAt(i).equals())
//		}
		System.out.println(test.contains("마"));
		System.out.println(test.contains("하"));
		test="설진호 화이팅! 공부 열심히 하세요. 노트북이랑 그만 싸우고!";
		System.out.println(test.contains("황진호"));					//없음
		System.out.println(test.contains("공부"));					//있음
		
		
		//2. 특정문자의 위치를 찾아주는 메소드 : indexOf(문자);
		//찾은 문자의 인덱스를 반환해줌. 못찾으면 -1반환 
		System.out.println(test.indexOf("설"));
		System.out.println(test.indexOf("노트북"));
		System.out.println(test.indexOf("황진호"));
		System.out.println(test.indexOf(" "));
		char ch='a';
		int ich=ch;
		
		//중복값이 있을때 두번째 값 찾기
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));
		test="ttt.file.txt";
		
		
		//3. 시작을 뒤에서 부터 찾음 : lastIndexOf()
		System.out.println(test.lastIndexOf("."));
			
		
		//4. 문자열을 변경해주는 메소드 : replace();
		test.replace("txt", "hwp"); 									// 원본값이 변경되지 않음
		String test2=test.replace("txt", "jpg");						// 다른 변수로 받아야함
		System.out.println(test2);
		System.out.println(test);
		
		
		//5. 문자열 공백을 제거해주는 메소드 : trim();
		test="      조 현    ";
		test2="조현";
		System.out.println(test.trim().replace(" ",""));
		System.out.println(test.trim().equals(test2));
		System.out.println(test);
//		if(id.equals(dbid)) {}		
		
		
		//6. 문자열을 원하는 만큼 잘라내는 메소드 : substring();	
		test="식사시간 저녁시간 저녁메뉴 디너타임!";
		//substring(시작인덱스,끝인덱스) 									
		System.out.println(test.substring(0,2));
		//substring(인덱스)			//끝인덱스 x			
		System.out.println(test.substring(9));
		
		//substring() indexOf()연결하여 사용
		System.out.println(test.substring(test.indexOf("저녁메뉴"),test.indexOf("뉴")+1));
		
		//파일에 대한 확장자만 짤라내기
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
		
		
		//7. 배열만들어주는 메소드 : split	
		test="유병승,조션,설진호,정로희,김다희,유다해";		
		//특정 구분자를 기준으로 
		String[] names=test.split(",");
		System.out.println(names[3]);

		//문자열 	  -> 문자열배열 : split();
		//문자열배열   -> 문자열 : join();
		for(String v : names) {
			System.out.println(v);
		}
		String returnStr=String.join("*^.~",names);
		System.out.println(returnStr);
		
		
		//8. StringBuffer : 문자열을 저장하는 객체
		//가변 : 저장된 문자열을 변경하는 것이 가능
		//객체 -> 수정, 삭제, 삽입 매소드를 통해 이루어짐
		//safty 기능이 있어 버퍼가 느려짐
		StringBuffer sb=new StringBuffer("윤진영");
		
		//StringBuffer 출력
		System.out.println(sb+" : "+sb.hashCode());			//toString();오버라이딩 되어있어 :)
		
		//StringBuffer 값 수정  								
		//8-1 문자열 추가하기(뒤에다가 덧붙힘): append()
		sb.append("선생님");									//원본값이 수정됨. String +=
		System.out.println(sb+" : "+sb.hashCode());
				
		//8-2. insert(,) : 원본값의 특정위치에 값넣기
		sb.insert(3,"아부지");
		System.out.println(sb);
				
		//8-3. delete() : 특정위치의 문자열을 삭제
		sb.delete(1, 3);
		System.out.println(sb);
				
		//8-4. replace( , , ) : 특정위치의 문자를 변경
		sb.replace(3, 6, "천재");
		System.out.println(sb);
		
		String str=new String(sb);
		System.out.println(str);
		sb=new StringBuffer(str);
		
		
		//9. StringBuilder
		//safty 기능이 없으므로 빠름
		StringBuilder sbu=new StringBuilder("윤진영");
		sbu.append("하하하");
		System.out.println(sbu);
		
		stringTokenTest();				
	}
	
	//10. StringTokenizer클래스 : 문자열을 특정 구분자로 분리하는 객체
	public static void stringTokenTest() {
			
		String str="java,oravle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		
		StringTokenizer st=new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
//			if(temp.contains("c")) {
				System.out.println(temp);
//		}
//			if(st.nextToken().contains("c")) {
//				System.out.println(st.nextToken());
//			}
			}
		}

	
}
