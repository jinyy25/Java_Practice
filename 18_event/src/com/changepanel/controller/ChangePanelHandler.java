package com.changepanel.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanelHandler extends MouseAdapter {
	
	private JFrame main;
	private JPanel prev;
	private JPanel next;
	
	public ChangePanelHandler(JFrame main, JPanel prev, JPanel next) {
		this.main=main;
		this.prev=prev;
		this.next=next;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//panel변경하기
		main.remove(prev);		//Panel제거
		main.add(next);
		
		next.revalidate();		//GUI 다시 그려줌 	
		main.repaint();
	}
	
}
