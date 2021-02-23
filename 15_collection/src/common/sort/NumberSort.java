package common.sort;

import java.util.Comparator;


//Comparator 여러 기준 재정렬
public class NumberSort implements Comparator{

	//숫자비교 : 내림차순
	@Override
	public int compare(Object o,Object o1) {				//o, o1값 비교
		//반환값이 정해져 있음	 양수, 0, 음수 -> 1, 0, -1
		
		//return 값이 양수면 두개 값을 변경함.						//내림차순
		//return 값이 음수면 두개 값 변경 xx
		//return 값이 0이면  두개 값 변경 xx
		if(o instanceof Integer && o1 instanceof Integer) {	//o, o1에 Integer 대입
			Integer su=(Integer)o;
			Integer su2=(Integer)o1;

			//if(o>o1)
//			if(su>su2) return -1;					
//			else if(su<su2) return 1;
//			else return 0;			
			return su2-su;
		}
		return 0;
	}	
}
