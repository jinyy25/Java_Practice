package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		//client구성하기
		
		//1. 연결 요청할 서버의 포트
		//2. 연결할 서버의 주소,포트를 가지고 socket 생성
		//3. 연결 스트림열기
		//4. 서버에 보낼 문구입력 기능구성
		//5. 서버에 데이터를 전송
		//6. 서버에서 온 데이터 확인
		int port=8888;	
		BufferedReader br=null;
		PrintWriter pw=null;						//PrintWriter : 요청 즉시 출력
		Socket socket=null;		
		try {
			socket=new Socket("192.168.120.24",port);			
			if(socket!=null) {				
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				
				Scanner sc=new Scanner(System.in);
				System.out.println("대화입력");
				do {
					String msg=sc.nextLine();
					pw.println(msg);
					pw.flush();					
					if(msg.equals("exit")) {
						break;
					}
				System.out.println(br.readLine());
				}while(true);				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				pw.close();
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
