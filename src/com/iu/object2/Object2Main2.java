package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			AnimalSound as = new AnimalSound();
			
			System.out.println("1.강아지 2.고양이 3.호랑이");
			int select = sc.nextInt();
			System.out.println("횟수를 입력하세요");
			int count = sc.nextInt();
			
			for(int i = 0; i<count; i++)
			{
				if(select == 1)
				{
					as.dogSound();
				}
					else if(select == 2)
					{
					as.catSound();
					}
					else if(select == 3)
					{
					as.tigerSound();
					}
			}
	}

}
