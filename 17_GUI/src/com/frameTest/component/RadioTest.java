package com.frameTest.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioTest {
	
	public static void main(String[] args) {
		
		//JFrame 및 제목생성 : JFrame
		JFrame f=new JFrame("RadioButton");
		
		//JFrame 크기조절 : setSize(,);
		f.setSize(300,150);
		
		//Panel생성 및 Panel이름 : JPanel
		JPanel top=new JPanel();
		JLabel title=new JLabel("어떤 크기를 원하세요?");
		top.add(title);
		
		//North방향에 Panel위치시킴
		f.add(top,"North");
		
		//JPanel 크기조절
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("Small");
		JRadioButton medium=new JRadioButton("Medium");
		JRadioButton large=new JRadioButton("Large");
		
		//묶어주기 : ButtonGroup
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//JLabel
		//이미지 파일을 넣어서 구성 : ImageIcon
//		Image icon=new ImageIcon("cho.jpg").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("cho.jpg"));
		
		//ComboBox
		String[] names= {"유병승","설진호","조현","이세현","강경록"};
		JComboBox<String> com=new JComboBox<String>(names);
		
		//미리 선택 해놓는 기능 : setSelectedIndex(); 
		com.setSelectedIndex(3);								
		content.add(com,"South");
		com.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> com=(JComboBox<String>)e.getSource();
				System.out.println(com.getSelectedItem());
				
			}
		});
		
//		com.addItemListener(new ItemListener(){
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//			System.out.println("변경했누");
//			String text=(String)e.getItem();
//			System.out.println(text);
//			content.add(new JLabel(text));
//			content.revalidate();
//			}
//		});

		content.add(imageLa,"West");		
		f.add(content,"Center");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
