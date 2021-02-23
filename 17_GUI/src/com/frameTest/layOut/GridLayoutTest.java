package com.frameTest.layOut;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {

	public GridLayoutTest() {
		
		//GridLayout
		setTitle("GridLayout");
		setBounds(100, 100, 500, 800);
		
		//GridLayout : 바둑판식 배치
		setLayout(new GridLayout(5,5,10,10));
		
		for(int i=0;i<15;i++) add(new JButton(i+"번"));
		Set number=new HashSet();									//HashSet활용
		while(number.size()!=25){
			number.add(String.valueOf((int)(Math.random()*25)+1));	//Random 적용
		}
		System.out.println(number);
		
		//generic활용
		Iterator<Integer> it=number.iterator();						//Integer 형태의 Iterator
		for(int i=0;i<25;i++) {
			this.add(new JButton(String.valueOf(it.next())));
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
