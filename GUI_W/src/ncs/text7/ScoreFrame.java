package ncs.text7;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn; 
	
	public ScoreFrame() {
			setSize(600,600);
			setLocation(600,300); 
			setTitle("문제 7");		

			JPanel jp=new JPanel();
			jp.setLayout(null);
			jp.setBounds(600,600,600,300);
			
			JLabel su=new JLabel("점수를 입력하세요");
			su.setBounds(150, 20, 600, 50);
			su.setFont(new Font("맑은고딕",Font.BOLD,35));
			
			JTextField javaScore = new JTextField("");			
			javaScore.setBounds(150,150,100,30);
			
			JLabel	j=new JLabel("자바:");
			j.setBounds(90, 155, 50, 20);
		
			JTextField sqlScore = new JTextField("");
			sqlScore.setBounds(380,150,100,30);
			
			JLabel	s=new JLabel("SQL:");
			s.setBounds(320, 155, 50, 20);
			
			JLabel	t=new JLabel("총점:");
			t.setBounds(90, 365, 50, 20);

			JTextField total = new JTextField();
			total.setBounds(150,360,100,30);
						
			JLabel	a=new JLabel("평균:");
			a.setBounds(320, 365, 50, 20);
			
			JTextField average = new JTextField();
			average.setBounds(380,360,100,30);
			
			JButton calcBtn = new JButton("계산하기");
			calcBtn.setBounds(240,250,100,40);
			calcBtn.addActionListener(new ScoreFrame$ActionHandler(javaScore, sqlScore,total,average, calcBtn));
			
			
			add(jp);
			jp.add(s); jp.add(su); jp.add(t); jp.add(a); jp.add(j);
			jp.add(average);
			jp.add(sqlScore);
			jp.add(calcBtn);
			jp.add(javaScore);
			jp.add(total);
			
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
}
