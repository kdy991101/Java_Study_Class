package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	Scanner sc;
	StudentController st;
	StudentService ss;
	StudentView sv;
	Student [] sts;
	public StudentController() {
		sc = new Scanner(System.in);
		sv = new StudentView();
		st = new StudentController();
		
	}
		public void start() {
//			1.학생 정보 조회
//			2.학생 정보 입력
//			3.학생 정보 검색
//			4.학생 정보 삭제
//			5.학생 정보 추가
//			6.프로그램 종료
			sc = new Scanner(System.in);
			sts = null;
			Student stss = null;
			Student fs = null;
			st = new StudentController();
			ss = new StudentService();
			sv = new StudentView();
			
			
			boolean b = true;
			while (b) {
				System.out.println("1.학생 정보를 입력해주세요");
				System.out.println("2.학생 정보 조회");
				System.out.println("3.학생 정보 검색");
				System.out.println("4.학생 정보 삭제");
				System.out.println("5.학생 정보 추가");
				System.out.println("6.프로그램 종료");
			
			System.out.println("번호를 입력하세요.");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				sts = ss.makeStudents();
			}else if (ch == 2)
			{
				sv.viewAll(sts);
				//sv.viewOne(stss);
			}else if (ch == 3)
			{
				Student studentForView =  ss.findStudent(sts);
	
				if(studentForView != null) {
					sv.viewOne(studentForView);
				} else {
					System.out.println("없는 학생");
				}
				
				System.out.println("3");
			}else if(ch == 4)
			{
				System.out.println("4");
				ss.addStudent(null);
			}else 
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}	
		
}
}
