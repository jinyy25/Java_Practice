package com.frameTest.layOut;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		
		//BorderLayout
		//Layout : Component배치를 설정하는것
		
		//setTitle("창 이름");
		setTitle("Border레이아웃");						
		setBounds(100,100,800,500);
		
		//Layout 설정
		setLayout(new BorderLayout());
		//레이아웃을 설정하지 않으면 기본 Borderlayout이 설정됨.
		
		//JButton("이름")	;
		JButton btn=new JButton("왼쪽");
		JButton btn1=new JButton("오른쪽");				
		JButton btn2=new JButton("위");
		JButton btn3=new JButton("아래");
		JButton btn4=new JButton("중앙");
		
		//생성된 Component BorderLayout에 맞춰 배치
		add(btn,"West");								//add(변수,"자리");
		add(btn1,"East");								//첫글자는 대문자!
		add(btn2,"North");
		add(btn3,"South");
//		add(btn4,"Center");
		add(new LoginPanel(),"Center");
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
}
