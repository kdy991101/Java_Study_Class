package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
//		StudentController의 start메서드 호출
		StudentController sc = new StudentController();
//		new StudentController(); StudentConrroller() 는 대문자로 시작하지만 클래스가 아닌 메서드이다
		sc.start();
		

		System.out.println("종료");
		}
	}



