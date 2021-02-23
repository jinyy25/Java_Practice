package com.frameTest.layOut;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
	
		//FlowLayOut
		setTitle("FlowLayOut");
		setBounds(100,100,400,500);
		
		//정렬기능
		//setLayout(new FlowLayout());						//default 중앙정렬
		//setLayout(new FlowLayout(FlowLayout.LEFT));		//왼쪽정렬
		setLayout(new FlowLayout(FlowLayout.RIGHT));		//오른쪽정렬
		
		for(int i=0;i<20;i++) {
			if(i%2==0)add(new JButton(i+"번"));				//Button에 이름추가
			else add(new Label("빈자리            "));				//Button간 빈자리 형성
		}
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
