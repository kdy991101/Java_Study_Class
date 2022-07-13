package com.iu.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();
		System.out.println();
		int [] nums = rt.makeRandom2(3);
		
		for(int i = 0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
		Account ac = rt.makeAccount();
		System.out.println(ac.title);
		System.out.println(ac.host);
		System.out.println(ac.nums);
		System.out.println(ac.balance);
	}

}
