package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // "sc"는 reperence타입
		Student [] stus = new Student[3];
		
		for(int i = 0; i<stus.length; i++)
		{
			Student st = new Student();
			stus[i] = st;
			System.out.println("이름 입력");
			stus[i].names = sc.next(); 
//			st.names = sc.next(); 위에랑 같음
		}

	}

}
