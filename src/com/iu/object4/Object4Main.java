package com.iu.object4;

import java.awt.Color;

public class Object4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume re = new Resume();//new "Resume" 생성자라 함
		System.out.println("================================");
		Car car1 = new Car();
		//생성자가 하는일 = 멤버변수의 값을 초기화...
		car1.info();//1번
//		car1.brand = "소나타";
		System.out.println("================================");
		Car car2 = new Car("핑크", "소나타");
		car2.info();
		

	}

}
