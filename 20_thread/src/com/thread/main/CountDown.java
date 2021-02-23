package com.thread.main;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame{
	
	private static final long serialVersionUID= 324234235136L;
	
	private JLabel count;
	private JLabel chopa1;
	private JLabel chopa2;
	private JLabel chopa3;
	int x1=20,x2=20,x3=20;//JLabel의 위치값
	private int second=10;
	
	public CountDown() {
		setTitle("카운트 다운");
		setBounds(100,100,600,600);
		setLayout(null);
		count = new JLabel("start");
		count.setFont(new Font("Serif",Font.BOLD,100));
		count.setBounds(20,0,200,100);
		add(count);	
		
		//Label추가
		chopa1=new JLabel();
		chopa1.setIcon(new ImageIcon("chopa.jpg"));
		chopa1.setBounds(20,80,200,100);
		
		chopa2=new JLabel();
		chopa2.setIcon(new ImageIcon("chopa.jpg"));
		chopa2.setBounds(20,180,200,100);
		
		chopa3=new JLabel();
		chopa3.setIcon(new ImageIcon("chopa.jpg"));
		chopa3.setBounds(20,280,200,100);
		
		add(chopa1);
		add(chopa2);
		add(chopa3);

		//countThread실행하기
		new CountThread().start();
		new Race().start();
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	//baby 움직이는 쓰레드 만들기 
	private class Race extends Thread{
		@Override
		public void run() {
			
			for(int i=0;second!=0;i++) {
				try {
					sleep(200);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				x1+=(int)(Math.random()*20);
				chopa1.setLocation(x1,80);	//label 위치변경
				x2+=(int)(Math.random()*20);
				chopa2.setLocation(x2,180);
				x3+=(int)(Math.random()*20);
				chopa3.setLocation(x3,280);
				
			}
		}
	}
	
	//countdown thread
	private class CountThread extends Thread{
		@Override
		public void run() {
			for(int i=10;i>=0;i--) {				
				try {
					sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			count.setText(""+i);
			second=i;
			}
		}
	}

	public static void main(String[] args) {
		new CountDown();
	}

}
