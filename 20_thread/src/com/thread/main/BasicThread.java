package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {

	public static void main(String[] args) {
	
		//상속받은 쓰레드 활용하기
		InheritThread t1=new InheritThread();

		//메소드를 호출하여 쓰레드를 실행시킴 
		//1. 번갈아가면서 움직임 : start();
		t1.start();
		
		//2. 동시에 움직임 : run();
		//Thread는 별도의 저장공간이 할당되어야 한다.
		//t1.run();
				
		//3. Runnable 구현한 객체로 쓰레드 활용하기
		InterThread it=new InterThread();
		Thread t2=new Thread(it);
		t2.start();
		
		try {
		//t1 쓰레드 종료하고 실행 : join();
			t1.join(8000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		//쓰레드 실행시키는 방법
		for(int i=0;i<10;i++) {
			System.out.println("main"+i+"번");
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
			}
			System.out.println("메인쓰레드 종료!");
	}
}
