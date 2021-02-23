package map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import map.model.vo.Member;

public class MemberController {
	Map<String,Member> map=new HashMap<String,Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) return false;
		else map.put(id, m);
		return true;
	}
	
	public String login(String id, String password) {	
		if(map.containsKey(id)) {
			Member m=map.get(id);
			if(m.getPassword().equals(password)) return m.getName();
		}
		return null;
	}
	
	public boolean changePassword(String id,String oldPw , String newPw) {
		if(map.containsKey(id)) {
			Member m=map.get(id);
			if(m.getPassword().equals(oldPw)){
				m.setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {	
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	}
	
	public TreeMap<String,String> sameName(String name) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		Set<String> s=map.keySet();
		for(String v:s) {
			String str=map.get(v).getName();
			if(str.equals(name)) tm.put(v,str);
		}
		return tm;
	}
	
}
