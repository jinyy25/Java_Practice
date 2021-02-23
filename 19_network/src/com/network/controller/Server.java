package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException{
		//서버생성하기
		//1. port번호를 선정하기
		//2. ServerSocket 생성
		//3. Server동작 구성하기	
		//4. 연결된 소켓을 이용하여 스트림열기
		//5. 성능향상을 위한 보조스트림 사용
		//6. 클라이언트가 보낸데이터 받기
		int port = 8888;
		ServerSocket server = new ServerSocket(port);
		while(true) {
			//client요청대기 : accept();
			Socket client=server.accept();
			InputStream clientInput=client.getInputStream();
			OutputStream clientOutput=client.getOutputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput));
			PrintWriter pw=new PrintWriter(clientOutput);		
		while(true) {
			String msg=br.readLine();			
			if(!msg.equals("exit")) {
				System.out.println(client.getInetAddress().getHostAddress()+" : ");
				pw.println("보낸 메세지 수신성공");
				pw.flush();
			}else {
				System.out.println("접속종료");
				break;
			}
		}
		//열린 스트림들 닫기
		br.close();
		pw.close();
		client.close();
		}
	}

}
