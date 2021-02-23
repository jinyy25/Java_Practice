package com.frameTest.layOut;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest extends JFrame{
	
	public CardLayoutTest() {
		
		//CardLayout
		setTitle("cardLayout");
		setBounds(100,100,200,200);
		
		//CardLayout설정
		CardLayout card=new CardLayout();
		setLayout(card);
		
		JPanel card1=new JPanel();
		JPanel card2=new JPanel();
		JPanel card3=new JPanel();

		//색상설정
		card1.setBackground(Color.red);
		card2.setBackground(Color.black);
		card3.setBackground(new Color(255,0,255));
		
		//JLabel생성
		card1.add(new JLabel("card1"));
		card2.add(new JLabel("card2"));
		card3.add(new JLabel("card3"));
		
		//Button 크기조절
		JButton btn= new JButton("크기조절");
		btn.setSize(300,300);
		btn.setLocation(20,20);
		card1.add(btn);
		
		//Frame에 판넬추가
		add(card1);
		add(card2);
		add(card3);
		
		
		//Listener : Mouse 클릭시 event 적용
		card1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
			}
		});
		card2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card2.getParent());
				}
			}
		});
		card3.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card3.getParent());
				}
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
