package music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import music.model.compare.AscTitle;
import music.model.vo.Music;

public class MusicController {
		
	List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		try {
			list.add(music);
		}catch(NullPointerException e) {
			return 0;
		}
		return 1;
	}
	public int addAtZero(Music music) {
		try {
			list.add(0,music);
		}catch(NullPointerException e) {
			return 0;
		}
		return 1;
	}
	public List<Music> printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.equals(new Music(title, ""))) return m;
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(Music m: list) {
			if(m.equals(new Music(title,""))) {
				Music r=m;
				list.remove(m);
				return r;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(new Music(title,""))) {
				list.remove(i);
				list.add(i,music);
				return music;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		try{
			Collections.sort(list, new AscTitle());
		} catch(NullPointerException e) {
			return 0;
		}
		return 1;
	}
	public int descSinger() {
		try {
			Collections.sort(list);
		}catch(NullPointerException e) {
			return 0;
		}
		return 1;
	}
	
	
	
}
