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
		System.out.println("학생 이름은 : " + stss.getNames());
		System.out.println("학생 번호는 : " + stss.getNumber());
		System.out.println("학생 국어 점수는 : " + stss.getK());
		System.out.println("학생 영어 점수는 : " + stss.getE());
		System.out.println("학생 수학 점수는 : " + stss.getM());
		System.out.println("학생 총점은 : " + stss.getAvg());
		System.out.println("학생 평균은 : " + stss.getAver());
		
	}
	public void viewAll(Student[] sts) {
		
		for(int i = 0; i< sts.length; i++)
		{
			System.out.println("학생 이름은 : " + sts[i].getNames());
			System.out.println("학생 번호는 : " + sts[i].getNumber());
			System.out.println("학생 국어 점수는 : " + sts[i].getK());
			System.out.println("학생 영어 점수는 : " + sts[i].getE());
			System.out.println("학생 수학 점수는 : " + sts[i].getM());
			System.out.println("학생 총점은 : " + sts[i].getAvg());
			System.out.println("학생 평균은 : " + sts[i].getAver());
		}
	}
	//viewAll
//	학생들의 정보를 받아서 출력
		
		
}
