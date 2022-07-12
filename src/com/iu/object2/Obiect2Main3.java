package com.iu.object2;

import java.util.Scanner;

public class Obiect2Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 m3 = new Method3();
//		월급 입력받음
		int salary = 5000000;
		m3.sal(salary);
//		m3.hap(10, 20);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("이메일을 입력하세요");
		String mail = sc.next();
		m3.info(name, age, mail);
//		=========================================
		Member member = new Member();
		member.name = "kdy";
		member.age = 24;
		member.mail = "kdy991101@gmail.com";
		m3.info2(member);
		System.out.println(member.age);
			
	}
	
	

}
