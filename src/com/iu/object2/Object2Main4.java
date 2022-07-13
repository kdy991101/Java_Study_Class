package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Member member = new Member();
		
		member.name = "김";
		member.age =  1;
		member.mail = "gmali";
		
		
		Member member2 = new Member();
		member2.name = "도";
		member2.age =  2;
		member2.mail = "email";
		
		Member member3 = new Member();
		member3.name = "영";
		member3.age =  3;
		member3.mail = "daum";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 m4 = new Method4();
		m4.info(members);
		
		System.out.println(members.length);
		
		
		
		
		
		
	}

}
