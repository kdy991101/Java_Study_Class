package com.iu.object4;

public class Resume {//이력서
//	이름, 전화번호, 나이, 군대여부, 주소

	String name;
	String num;
	int age;
	String address;
	
	boolean check;//이력서 합격 여부
	
//	생성자 선언 문법 (constructor)
	public Resume()  // 매개 변수가 없으면 기본 생성자 또는 빈생성자
	{
		System.out.println("Resume에 Object 생성");
	}
}
