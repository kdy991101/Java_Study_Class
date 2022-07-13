package com.iu.object3;
//	오버로딩
//  매배변수의 갯수나 타입의 구성이 달라야함
// 리턴 타입은 달라도 상관은 없음

public class Count {
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void hap2(int num1, double num2) {
		System.out.println(num1 * num2);
	}
	
	public void hap(int num1, int num2, int num3) {
		
	}
//	public void hap(int num2, int num1) {
		
//	}

}
