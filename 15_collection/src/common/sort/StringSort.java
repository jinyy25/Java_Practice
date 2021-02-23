package common.sort;

import java.util.Comparator;

//generic : <>비교할 자료/참조형
public class StringSort implements Comparator<String>{	
	
	//String 대소비교
	//compare 							단축키 : art + s + v 
	
	//문자열 비교(내림차순정렬 ) : Comparator 이용
	@Override
	public int compare(String o1, String o2) {
	return o2.compareTo(o1);	
	}

}
