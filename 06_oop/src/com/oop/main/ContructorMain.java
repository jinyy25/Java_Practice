package com.oop.main;

import com.oop.model.vo.Member;

public class ContructorMain {

	public static void main(String[] args) {
		//��ü����
		
		//�⺻�����Ͱ� ���� ���� : �⺻������ ȣ��
		Member m=new Member();		
						  //m.setMemberId("admin");
							m.setMemberPw("1234");
							m.setName("������");	
							m.setPhone("01036446259");
							m.setPersonNo("010224-1234567");
		
		System.out.println(m.getMemberNo()
							+" "+m.getMemberId()
							+" "+m.getMemberPw()
							+" "+m.getName()
							+" "+m.getPhone()
							+" "+m.getPersonNo());
		
		//�Ű������ִ� ������
		Member m2=new Member("user01","4444","�̼���","01012341234","94042612341");		
		System.out.println(m2.getMemberNo()
							+" "+m2.getMemberId()
							+" "+m2.getMemberPw()
							+" "+m2.getName()
							+" "+m2.getPhone()
							+" "+m2.getPersonNo());
					
		//�Ϻθ� �ʱ�ȭ�ϴ� �������̿�
		Member m3=new Member("user02","0987");
		System.out.println(m3.getMemberNo()
							+" "+m3.getMemberId()
							+" "+m3.getMemberPw()
							+" "+m3.getName()
							+" "+m3.getPhone()
							+" "+m3.getPersonNo());
	}
	
}