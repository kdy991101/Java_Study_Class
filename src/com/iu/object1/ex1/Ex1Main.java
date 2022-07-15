package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student stu = null;
		Student[] stus = new Student[3];
		
		int i = 0;
		for(i = 0; i < 3; i++)
			System.out.println(i);
		{
			System.out.println(i);
			stu = new Student();
			System.out.println("시작");
			System.out.println("이름 입력");
				stu.setNames(sc.next());
			System.out.println("번호 입력");
				stu.setNumber(sc.nextInt());
			System.out.println("국어 점수 입력");
				stu.setK(sc.nextInt());
			System.out.println("영어 점수 입력");
				stu.setE(sc.nextInt());
			System.out.println("수학 점수 입력");
				stu.setM(sc.nextInt());
			
		
			System.out.print("성함 : " + stu.getNames());
			System.out.println(" 학생번호 : " + stu.getNumber());
			System.out.print("국어 점수 : " + stu.getK());
			System.out.print(" 영어 점수 : " + stu.getE()); 
			System.out.println(" 수학 점수 : " + stu.getM());
			System.out.println("총점은 : " + (stu.getK() + stu.getE() + stu.getM()) + "점 입니다");
			System.out.println("평균은 : " + ((stu.getK() + stu.getE() + stu.getM())/3) + "점 입니다");
			stus[i] = stu;
			System.out.println(stus[i]);
		}
			
			System.out.println("종료");
	}

}
