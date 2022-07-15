package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("시작");
			Scanner sc = new Scanner(System.in);
			Student[] stus = new Student[3];
			
			for(int i = 0; i <stus.length; i++)
			{
				Student stu = new Student();
				System.out.println("이름 입력");
				stu.setNames(sc.next());
				
				stus[i] = stu;
						
			}
			for (int i = 0; i<stus.length; i++)
			{
				System.out.println(stus[i].getNames());
			}
		
			System.out.println("종료");
	}

}
