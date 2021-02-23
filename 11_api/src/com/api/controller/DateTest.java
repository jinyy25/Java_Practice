package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//Gregorian과 Calendar만 상속관계

public class DateTest {

	public static void main(String[] args) {
				
		// 날짜를 활용 클래스 : Date, Calendar, GregorianCalendar
		//1. 현재날짜와 시간 : Date	
			Date today=new Date();										
			System.out.println(today);
			
			today=new Date(1234567851155L);
			System.out.println(today);		
			
		//2. Calendar객체 
		//Calendar birthDay=new Calendar();
		Calendar birthDay=Calendar.getInstance();
		System.out.println(birthDay); 				//따로 필드에 접근해서 출력을 해야함.
	
		//3. 정보출력 : get()
		System.out.println("년 "+birthDay.get(Calendar.YEAR));
		System.out.println("월 "+(birthDay.get(Calendar.MONTH)+1));
		System.out.println("일 "+birthDay.get(Calendar.DATE));
		System.out.println("시 "+ birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 "+ birthDay.get(Calendar.MINUTE));	
		System.out.println("시 "+ birthDay.get(Calendar.SECOND));
			
		//변수정의활용
		int year=birthDay.get(Calendar.YEAR);
		int month=birthDay.get(Calendar.MONTH);
		int date=birthDay.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(new Date(birthDay.getTimeInMillis()));
				
		//4. 날짜지정 : set()
		birthDay.set(1992,11,25);
		System.out.println(new Date (birthDay.getTimeInMillis()));
			
		//5. 필드를 이용한 날짜지정 : GregorianCalendar
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc);
		
		printDate(gc);
//			int year1=gc.get(Calendar.YEAR);
//			int month1=gc.get(Calendar.MONTH)+1;
//			int date1=gc.get(Calendar.DATE);
//			System.out.println(year1+"년 "+month+"월 "+date1+"일 " );	
		gc=new GregorianCalendar(1993,8-1,28);
//			year1=gc.get(Calendar.YEAR);
//			month1=gc.get(Calendar.MONTH);
//			date1=gc.get(Calendar.DATE);
//			date1++;
//			System.out.println(year1+"년"+month1+"월 "+date1+"일");	
		printDate(gc);
		
			gc.set(1,2020);
			gc.set(Calendar.MONTH,9-1);
			printDate(gc);
			Date birth2=new Date(gc.getTimeInMillis());
			System.out.println(birth2);
			
		//6. 날짜를 형식에 맞게 포멧팅 : SimpleDateFormat
			//00년 0월 0일
			//0000년 00월 00일
			//00.00.00/00-00-00
	
		//SimpleDateFormat sf=new SimpleDateFormat("yyyy년 MM월 dd일");
		//SimpleDateFormat sf=new SimpleDateFormat("yy.MM.dd");	
		  SimpleDateFormat sf=new SimpleDateFormat("yyyy년 MM월 dd일 E a hh:mm:ss");		
		  
		 //매개변수는 date만 가능 
		//String strDate=sf.format(birth2);
		  String strDate=sf.format(gc.getTimeInMillis());
	   	  System.out.println(strDate);		
	}
	
	private static void printDate(Calendar c) {
			int year1=c.get(Calendar.YEAR);
			int month1=c.get(Calendar.MONTH)+1;
			int date1=c.get(Calendar.DATE);
			
			System.out.println(year1+"년 "+month1+"월 "+date1+"일 " );		
	}

	
	
}
