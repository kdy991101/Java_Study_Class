package com.iu.object2;

public class Method3 {
//		sal 메서드 명
//		 월급 계산
//		급여-(급여*0.033)
	public void sal(int salary) {
	
		System.out.println("월급 계산");
		System.out.println(salary-(salary*0.033));
		salary = 20;
		
		
	}
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
//	info : 이름 나이 이메일 주소를 받아서 출력하는 메서드
	
	public void info(String name, int age, String mail)
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + mail);
	}
	public void info2(Member member)
	{
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.mail);
		member.age = 100;
		
	}
}
