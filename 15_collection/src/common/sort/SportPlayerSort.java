package common.sort;

import java.util.Comparator;
import com.collection.model.vo.Sport;

public class SportPlayerSort implements Comparator<Sport>{
	
	//주소값을 생성하기 위해
	private boolean flag;
	
	//호출을 위해
	//위의 멤버변수를 매개변수로 받음												
	public SportPlayerSort(boolean flag) {			
		//true -> 오름차순
		//false -> 내림차순
		this.flag=flag;
	}
	
	//오름차순 내림차순 동시에 
	@Override
	public int compare(Sport o1, Sport o2) {		
		return flag? o1.getPlayer()-o2.getPlayer()	//삼항연산자 활용
				:
					o2.getPlayer()-o1.getPlayer();
	}
	
}
