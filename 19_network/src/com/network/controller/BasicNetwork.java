package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetwork {

	public static void main(String[] args) throws UnknownHostException{
		
		//IP로 특정 정보확인
		
		//InetAddress
		InetAddress localIp=InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());		//내 아이피주소
		System.out.println(localIp.getHostName());			//내 컴퓨터이름
		
		//naver Ip address HostName
		InetAddress naver=InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		
		
		
		
	}

}
