package com.changepanel.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.changepanel.controller.ChangePanelHandler;

public class SubPanel extends JPanel {
	private JFrame main;
	private JPanel prev;
	
	public SubPanel(JFrame main,JPanel prev) {
		this.main=main;
		this.prev=prev;
		
		setSize(300,200);
		JButton btn=new JButton("메인으로 이동");
		
		setBackground(Color.ORANGE);
		btn.addMouseListener(new ChangePanelHandler(main,this,prev));
		
		add(btn);
		
	}
}
