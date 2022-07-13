package com.iu.object1.ex1;

public class StudentView {
	
//		viewMessage
//		문자열을 받아거 그 문자열을 출력
		public void viewMeassage(Student fs) 
		{
			System.out.println("입력하신 번호와 일치하는 학생이 없습니다.");
		
		}
	
//		viewOne
//		학생 한명의 정보를 받아서 모든 정보를 출력하는 메서드
	public void viewOne(Student stss) {
		System.out.println("학생 이름은 : " + stss.names);
		System.out.println("학생 번호는 : " + stss.number);
		System.out.println("학생 국어 점수는 : " + stss.k);
		System.out.println("학생 영어 점수는 : " + stss.e);
		System.out.println("학생 수학 점수는 : " + stss.m);
		System.out.println("학생 총점은 : " + stss.avg);
		System.out.println("학생 평균은 : " + stss.aver);
		
	}
	public void viewAll(Student[] sts) {
		
		for(int i = 0; i< sts.length; i++)
		{
			System.out.println("학생 이름은 : " + sts[i].names);
			System.out.println("학생 번호는 : " + sts[i].number);
			System.out.println("학생 국어 점수는 : " + sts[i].k);
			System.out.println("학생 영어 점수는 : " + sts[i].e);
			System.out.println("학생 수학 점수는 : " + sts[i].m);
			System.out.println("학생 총점은 : " + sts[i].avg);
			System.out.println("학생 평균은 : " + sts[i].aver);
		}
	}
	//viewAll
//	학생들의 정보를 받아서 출력
		
		
}
