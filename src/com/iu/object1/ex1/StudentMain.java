package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
//		StudentController의 start메서드 호출
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (true) {
		StudentController st = new StudentController();
		st.start();
		
		System.out.println("번호를 입력하세요.");
		int ch = sc.nextInt();
		if(ch == 1)
		{
			System.out.println("1");
		}else if (ch == 2)
		{
			System.out.println("2");
		}else if (ch == 3)
		{
			System.out.println("3");
		}else if(ch == 4)
		{
			System.out.println("4");
		}else 
		{
			System.out.println("프로그램을 종료합니다");
			break;
		}
		

		System.out.println("종료");
		}
	}

	}


