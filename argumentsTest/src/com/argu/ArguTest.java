package com.argu;

public class ArguTest {
	//application 시작과 동시에 외부에서 값이 필요할때
	//Run tap -> Run Configurations -> arguments tap -> variables -> string_promt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		for(String a : args) {
			System.out.println(a);
		}
	}

}
