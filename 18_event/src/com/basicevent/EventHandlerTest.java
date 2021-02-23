package com.basicevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//3. 이벤트처리 외부 클래스
//MouseListener 인터페이스 활용
public class EventHandlerTest implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("외부핸들러를 이용한 이벤트처리!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}

}
