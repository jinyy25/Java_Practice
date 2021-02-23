package practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {}
	public String afterToken(String str) {
		//공백을 토큰으로 처리한 문자열 반환
		StringTokenizer st=new StringTokenizer(str," ");
		str="";
		while(st.hasMoreTokens()) {
			str+=st.nextToken();
		}
		return str;		
	}
	public String firstCap(String input) {
		//첫 글자만 대문자로 바꾼 문자열 반환
		StringBuffer sb=new StringBuffer(input);	
		if(input.charAt(0)>='a'&&input.charAt(0)<='z') {				//첫글자
			sb.replace(0, 1,""+(char)(input.charAt(0)-32));				//유니코드활용
		}		
		return new String(sb);
	}
	public String allCap(String input) {
		StringBuffer sb= new StringBuffer(input);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
				sb.replace(i, i+1,"" +(char)(input.charAt(i)-32));
			}
		}
		return new String(sb);
	}
		
	public int findChar(String input,char one) {
		//문자열 안에 찾을 문자개수가 몇 개 들어가있는지 반환
		int count = 0;												//개수를 찾는 것이므로
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one){
				count++;
			}
		}
		return count;	
	}
	
}
