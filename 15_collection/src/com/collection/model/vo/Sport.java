package com.collection.model.vo;

import java.util.Arrays;

public class Sport /*implements Comparable<Sport>*/{

	
	private String type;
	private String name;
	private int player;
	private String[] rule;
	
	public Sport() {
		// TODO Auto-generated constructor stub
	}

	public Sport(String type, String name, int player, String[] rule) {
		super();
		this.type = type;
		this.name = name;
		this.player = player;
		this.rule = rule;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public String[] getRule() {
		return rule;
	}

	public void setRule(String[] rule) {
		this.rule = rule;
	}

	@Override
	public String toString() {
		return "Sport [type=" + type + ", name=" + name + ", player=" + player + ", rule=" + Arrays.toString(rule)
				+ "]";
	}
		
	//객체가 같은지 판단
	@Override													
	public boolean equals(Object obj) {
	
		if(obj instanceof Sport) {
			Sport s=(Sport)obj;
			
			if(this.name.equals(s.name)
				&&this.type.equals(s.type)
				&&this.player==s.player){
			
				return true;
			}
		}
		return false;
	}
	
	//comapreTo 한개 기준 정렬
	/*@Override*/
		public int compareTo(Sport s) {
		
		//compareTo	: compare메소드와 마찬가지로 기준값을 갖고 0, 양수, 음수를 반환
			
		//오름차순 정렬 : 이름기눚ㄴ
		//return this.name.compareTo(s.name);					
			
		//내림차순 정렬(역정렬)
		//return s.name.compareTo(this.name);					
		
			
		//인원수를 기준으로 정렬
		return this.player-s.player;
		
		
//		if(this.name.compareTo(s.name)==0) {
//			return this.player.s.player;
//			
//		}else if()	return s.player-this.player;
		
	}
	
	
	
}
