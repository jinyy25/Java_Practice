package com.basicevent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseAdapterTest extends MouseAdapter{
	
	//등록해두고 쓸것
	private JTextField text;
	private JPanel p;
	public MouseAdapterTest(JTextField text,JPanel p) {
		this.text=text;
		this.p=p;
	}
	
	//사실 MouseEvent에 다 구현되어 있다.
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("이벤트! 발생 !!");
		JButton btn=(JButton)e.getSource();
		text.setText("안녕!"+btn.getText());
		
		JLabel label=new JLabel("이건 외부에서 추가한 문구");
		p.add(label);
		p.revalidate();		//변경시 다시 그리기 : validate(), repaint();
	}
}
