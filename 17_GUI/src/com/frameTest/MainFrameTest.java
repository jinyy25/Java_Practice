package com.frameTest;

import javax.swing.JFrame;

public class MainFrameTest {

	public static void main(String[] args) {
		
		//Frame -> window 창 한개
		JFrame f=new JFrame();
		
		//창 위치, 크기설정
		f.setBounds(100,100,300,400);
		
		//닫힘버튼설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//생성된 프레임을 보이게 하는 속성
		f.setVisible(true);				
		
		
	}

}
