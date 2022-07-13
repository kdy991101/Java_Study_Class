package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
//	검색하고싶은 학생의 번호를 입력받는다
//	일치하는 학생을 1명만 리턴.
	//없으면 null을 리턴
	public Student findStudent(Student[] students) {
	Scanner sc = new Scanner(System.in);
	System.out.println("검색할 학생의 번호를 입력해주세요.");
	int num = sc.nextInt();
	
	Student student = null;
	
	for(int i = 0; i < students.length; i++) {
		if(students[i].number == num) {
			student = students[i];
			break;
		}
	}
	
	return student;
	
	}
	

	//makeSutdents
	//학생수를 입력받고, 수만큼 정보를 입력받는다
	//학생들 리턴
	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student[] sts = new Student[count];
				for(int i = 0; i<count; i++)
				{		Student st = new Student();
						sts[i] = st;
						System.out.println("이름을 입력하세요");
						sts[i].names = sc.next();
						System.out.println("번호를 입력하세요");
						sts[i].number = sc.nextInt();
						System.out.println("국어 점수를 입력하세요");
						sts[i].k = sc.nextInt();
						System.out.println("영어 점수를 입력하세요");
						sts[i].e = sc.nextInt();
						System.out.println("수학 점수를 입력하세요");
						sts[i].m = sc.nextInt();
						sts[i].avg = sts[i].k + sts[i].e + sts[i].m;
						sts[i].aver = sts[i].avg/3;
				}
				return sts;
	}
}
