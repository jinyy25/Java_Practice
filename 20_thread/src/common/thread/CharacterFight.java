package common.thread;

import com.thread.model.vo.Character;

public class CharacterFight extends Thread  {

	private Character ch;
		
	public CharacterFight(Character ch) {
		super();
		this.ch = ch;
	}

	@Override
	public void run() {
		while(true) {
			int attack=(int)(Math.random()*30)+1;
			ch.setHp(ch.getHp()-attack);
			System.out.println(ch.getName()+"님이 공격을 받았습니다.");
			System.out.println(ch.getName()+"체력이"+attack+"만큼 감소하였습니다!");
			
			if(ch.getHp()<0) {
				System.out.println(ch.getName()+"님이 전사하였습니다.");
				break;
			}
			System.out.println(ch.getName()+"님 체력이"+ch.getHp()+"남음");
			try {
			//sleep : 속도 저하
				sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
	
}
