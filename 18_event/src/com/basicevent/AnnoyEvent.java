package com.basicevent;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnnoyEvent {
	

	public static void main(String[] args) {
		
		//1. 익명클래스를 이용해서 이벤트 적용
		AnnoyEvent an=new AnnoyEvent();
		
		//Frame 및 Panel
		JFrame f=new JFrame();
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();
		f.add(p);
		
		JButton btn=new JButton("이벤트 실습!");
		JLabel str=new JLabel();	
		
		p.add(btn);
		p.add(str);
				
		//버튼에 이벤트연결
		//Override 활용
		btn.addMouseListener(new MouseListener() {
			
			//Mouse클릭시
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//setText : 버튼 클릭시 내용 저장
				System.out.println("버튼클릭 :)");
				str.setText("버튼눌림");
				
				//event 발생한 객체를 가져옴 : getSource();
				System.out.println(e.getSource());
				//JButton btn=(JButton)e.getSource();
				btn.setText("버튼 클릭!");
				
				//Background 및 Foreground color 적용
				btn.setBackground(Color.blue);
				btn.setForeground(Color.white);
				System.out.println(e.getX()+" : "+e.getY());				
			}
			//Mouse를 누르고 있을시
			@Override
			public void mousePressed(MouseEvent e) {
				//눌렀을때 특정 이벤트 발생
				System.out.println("마우스눌림");
			}
			//Mouse를 땔시
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스눌림해제");
			}
			//Mouse를 올려놓을시
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스들어옴");
				JButton btn=(JButton)e.getSource();			
				btn.setBackground(Color.CYAN);				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스나감");
				btn.setBackground(Color.MAGENTA);
			}			
		});
		
		//text 쓸수 있는 공간 확보
		JTextField text=new JTextField(10);					
		p.add(text);
		
		//외부객체를 이용한 event처리
		str.addMouseListener(new EventHandlerTest());
	
		//event 연결하기
		//내부 event handler 클래스를 이용하여 처리
		text.addKeyListener(an.new TextEventHandler());
		JButton btn2=new JButton("버튼하기");
		btn2.addMouseListener(new MouseAdapterTest(text,p));
		p.add(btn2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
		
	
	//2. 이벤트처리 내부클래스 
	//KeyListener 인터페이스 활용
	private class TextEventHandler implements KeyListener{
			
		//키보드에 이벤트 연결
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("키보드 치고 있음");
			System.out.println(e.getKeyChar());
		}
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("키보드누름");			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("키보드뗌");	
			
			//System.out.println(e.getKeyChar());
			JTextField text=(JTextField)e.getSource();
			
			if(text.getText().length()>5) {
				System.out.println("문자 5개이상 입력 :>");
			}			
		}
	
	}	
}
