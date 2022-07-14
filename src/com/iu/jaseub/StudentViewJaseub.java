package com.iu.jaseub;

import com.iu.object1.ex1.Student;

public class StudentViewJaseub {
	//문자열을 받아서 그 문자열을 출력
	public void view(String message) {
		System.out.println(message);
	}
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void view(StudentJaseub student) {
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.total);
		System.out.println(student.avg);
	}
	//학생들의 정보를 받아서 모든 정보를 출력
	public void view(StudentJaseub [] students) {
		for(int i = 0; i<students.length; i++)
		{
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].kor);
			System.out.println(students[i].eng);
			System.out.println(students[i].math);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
		}
		
	}
}
