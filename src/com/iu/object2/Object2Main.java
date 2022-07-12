package com.iu.object2;

public class Object2Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		Method1 mt1 = new Method1();
		
//		멤버 변수 사용
//		참조변수명, 변수명

//		멤버메서드 사용(메서드를 호출)
//		첨조변수명.메서드명()
		mt1.test();
		
		Method2 mt2 = new Method2();
		mt2.info();
		
		
		System.out.println("종료");

	}

}
