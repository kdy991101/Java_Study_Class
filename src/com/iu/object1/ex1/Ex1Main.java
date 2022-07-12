package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student stu = null;
		Student[] stus = new Student[3];
		for(int i = 0; i < 3; i++)
		{
			stu = new Student();
			System.out.println("시작");
			System.out.println("이름 입력");
				stu.names = sc.next();
			System.out.println("번호 입력");
				stu.number = sc.nextInt();
			System.out.println("국어 점수 입력");
				stu.k = sc.nextInt();
			System.out.println("영어 점수 입력");
				stu.e = sc.nextInt();
			System.out.println("수학 점수 입력");
				stu.m = sc.nextInt();
			
		
			System.out.print("성함 : " + stu.names);
			System.out.println(" 학생번호 : " + stu.number);
			System.out.print("국어 점수 : " + stu.k);
			System.out.print(" 영어 점수 : " + stu.e);
			System.out.println(" 수학 점수 : " + stu.m);
			System.out.println("총점은 : " + (stu.k + stu.e + stu.m) + "점 입니다");
			System.out.println("평균은 : " + ((stu.k + stu.e + stu.m)/3) + "점 입니다");
			stus[i] = stu;
			System.out.println(stus[i]);
		}
			
			System.out.println("종료");
	}

}
