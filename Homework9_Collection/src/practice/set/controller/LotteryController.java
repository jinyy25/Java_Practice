package practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import practice.set.model.compare.SortedLottery;
import practice.set.model.vo.Lottery;

public class LotteryController {

	HashSet<Lottery> win= new HashSet<Lottery>();
	HashSet<Lottery> lottery= new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.contains(l))return false;
		lottery.add(l);
		return true;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result=true;
		try {
		lottery.remove(l);
		if(result==true&&win!=null&&win.contains(l)) {
			win.remove(l);
			}
		}catch(Exception e) {
		return false;
		}
		return true;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> r=new ArrayList<Lottery>(lottery);
		if(lottery.size()>=4) {
			while(true) {
				if(win.size()<4) {
					win.add(r.get((int)(Math.random()*lottery.size())));
				}else return win;		
			}
		}
		return null;		
	}
	public TreeSet<Lottery> sortedWinObject() {	
		if(win!=null) {
			TreeSet<Lottery> winSort=new TreeSet<Lottery>(new SortedLottery());
			winSort.addAll(win);
			return winSort;
		}
		return null;
	}
	public boolean searchWinner(Lottery l) {
		if(!win.contains(l)) return false;
		return true;
	}
	
	
}
