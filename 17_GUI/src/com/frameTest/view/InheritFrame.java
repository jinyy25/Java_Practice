package com.frameTest.view;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	public InheritFrame() {
		//프레임이나 기본 container를 상속한 클래스는 생성자에서 모든 설정을 지정
				
		//프레임 기본설정 3가지
		//1. 프레임의 크기, 위치설정 : setBounds();
		//형식 : setBounds(x,y,width,height)				//위치(x,y) 크기(width,height)
		setBounds(100,100,300,400);
		
		//2. 창을 닫는 이벤트 : setDefaultCloseOperation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//3. 창보이기 : setVisible()
		//Frame Object는 기본적으로 안보이게 설정 되어있다.
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new InheritFrame();//프레임 하나 생성		
	}
}
