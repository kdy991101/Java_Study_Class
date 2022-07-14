package com.iu.object1.ex1;

public class Student {
		String names;
		int number;
		int k;
		int e;
		int m;
		int avg;
		int aver;
//		class명은 student
//		class는 사용자가 정의한 데이터 타입이다.
		
//		총점을 계산하는 메서드
		public void setTotal() {
			 this.avg = this.k + this.e + this.m;
			this.setAver();
			//k.e.m모두 앞에 this가 붙어있는거임
//			파랑색은 멤버변수
//			갈색 느낌 지역변수
//			영역이 다르면 이름이 같아도 다른 변수로 인식을 함
			
		}
		public void setAver() {
			this.aver = this.avg/3;
			
		}
		
}
