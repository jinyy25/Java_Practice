package music.model.compare;

import java.util.Comparator;

import music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	
	@Override
	public int compare(Music o1, Music o2){
		int aa=o1.getTitle().compareTo(o2.getTitle());
		if(aa==0) aa=o1.getSinger().compareTo(o2.getSinger());
		return aa;
	}
}
