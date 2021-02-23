package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//setBounds(200,200,100,100);				
		setSize(400,300);
		setLocation(300,300);
		
		//Frame 제목설정
		setTitle("First Frame");
				
		//FrameIcon설정 : setIconImage(); 
		try {
		setIconImage(ImageIO.read(new File("cho.jpg")));
		}catch(IOException e) {
			e.printStackTrace();
		}		
		//Frame 크기고정 
		setResizable(false);
				
		//창에 끄고 여는 기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//창이 화면에 보이는 기능
		setVisible(true);
	}
}
