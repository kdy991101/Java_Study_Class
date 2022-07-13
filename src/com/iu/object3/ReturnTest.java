package com.iu.object3;

import java.util.Random;
import java.util.Scanner;


public class ReturnTest {
	public Account makeAccount()
	//통장 이름 타이틀 호스트 통장번호 잔액 입력받아 리턴한다
	{
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		ac.title = "자유입출금";
		ac.host = "ehdud";		
		ac.nums = "1234";
		ac.balance = 500L;
		
		return ac;
	}
	
	
	
	public int[] makeRandom2(int count) {
//		호출시 숫자를 받아서 그 숫자만큼 랜덤한수를 뽑아서 리턴
		Random random = new Random();
		int[] nums = new int [count];
		for(int i = 0; i<count; i++) {
			int num = random.nextInt(50);
			nums[i] = num;
//			13.14줄 하나로  nums[i] = random.newxtInt(50);
		}
		return nums;
	}
	
	
	public int makeRandom() {
		Random random = new Random();
			int num = random.nextInt(50);
			
			//return 리턴 하려는 데이터 작성
			return num;
			
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}

}
