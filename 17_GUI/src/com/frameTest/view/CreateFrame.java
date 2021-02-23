package com.frameTest.view;

import javax.swing.JFrame;

public class CreateFrame {
	
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setBounds(100,200,200,200);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
