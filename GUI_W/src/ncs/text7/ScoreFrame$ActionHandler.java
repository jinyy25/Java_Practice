package ncs.text7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ScoreFrame$ActionHandler implements ActionListener {
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame$ActionHandler(JTextField javaScore, JTextField sqlScore, JTextField total, JTextField average,
			JButton calcBtn) {
		super();
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.total = total;
		this.average = average;
		this.calcBtn = calcBtn;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		int n1 = Integer.parseInt(javaScore.getText());
		int n2 = Integer.parseInt(sqlScore.getText());
		int tt = n1+n2;
		int avr = tt/2;
		
		total.setText(""+tt);
		average.setText(""+avr);		
	}
	
}
