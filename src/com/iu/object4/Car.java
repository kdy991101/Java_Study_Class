package com.iu.object4;

import java.awt.Color;

//1.맴버변수 선언과 동시에 초기화
//2.객체 생성 후 맴버변수에 값을 대입
//3.생성자에서 초기화
//4.인스턴스 블럭
//5.Getter / Setter 메서드

public class Car {//멤버변수 선언과 동시에 초기화
		String maker = "현대";// 변수 선언과 동시에 초기화 하지만 잘 사용하지는 않음
		String brand;//브랜드
		String color;//색상
		boolean gear;//true기어, false수동
		
		//Getter / Setter 메서드 제일 많이 사용함
		
		//instance 초기화 블럭 {}
		{
			this.maker = "기아";
			this.brand = "카니발";
			this.color = "블랙";
			this.gear = true;
		}
		public  Car() {//생성자에서 초기화
			
			
//			this.maker = "현대";
//			this.brand = "아반떼";
//			this.color = "화이트";
//			this.gear = true;
			
		}
		public  Car(String color) {//생성자에서 초기화
//			this.maker = "현대";
//			this.brand = "화이트";
//			this.color = color;
//			this.gear = true;
			this("아반뗴", color);
//			this() 위에 무언가를 추가하면 에러가 뜸 그래서 this()를 보통 맨 첫줄에 작성하고 시작한다.
//			this() 아래에는 상관 없음
			
		}
		
		public  Car(String color, String brand) {//생성자에서 초기화
			this.maker = "현대";
			this.brand = brand;
			this.color = color;
			this.gear = true;
			
		}
		
		
		
		public void info() {
			System.out.println("maker : " + this.maker);
			System.out.println("brand: " + this.brand);
			System.out.println("color : " + this.color);
			System.out.println("gear : " + this.gear);
			
		}
}
