package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		//Object생성
//		클래스명 변수명 = new 생성자(클래스명)();
		Monster mon = new Monster();
//		System.out.println(mon);
		//멤버변수 접근
		//변수명.멤버명
		mon.name = "오크";
		mon.hp = 100;
		mon.level = 5;
		
		System.out.println(mon.name);
		System.out.println(mon.level);
		System.out.println(mon.hp);
		
		System.out.println("============================");
		
		Monster mon2 = new Monster();
		
		mon2.name = "도영";
		mon2.hp = 500;
		mon2.level=10;
		
		System.out.println(mon2.name);
		System.out.println(mon2.level);
		System.out.println(mon2.hp);
		
//		System.out.println(mon == mon2);// mon,mon2는 배열의 주소이기 떄문에 같지 않음
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		mon.weapon = sword;
		System.out.println(mon.weapon.name);
//		System.out.println("몬스터가 들고있는 무기 이름 : " + sword.name);

		System.out.println(mon2.weapon.name);
		System.out.println("프로그램 종료");
	}

}
