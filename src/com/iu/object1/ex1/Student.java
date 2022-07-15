package com.iu.object1.ex1;

public class Student {
	private	String names;
	private int number;
	private int k;
	private int e;
	private int m;
	private int avg;
	private int aver;
	

	
//		class명은 student
//		class는 사용자가 정의한 데이터 타입이다.
		
public String getNames() 
{
		return names;
	}
	public void setNames(String names) 
	{
		this.names = names;
	}
	
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	public int getK() 
	{
		return k;
	}
	public void setK(int k) 
	{
		this.k = this.checkPoint(k);
	}
	
	public int getE() {
		return e;
	}
	public void setE(int e) 
	{
		this.e = this.checkPoint(e);
	}
	
	public int getM() {
		return m;
	}
	public void setM(int m) 
	{
		this.m = this.checkPoint(m);
	}
	
	public int getAvg() 
	{
		return avg;
	}
	
	public int getAver() 
	{
		return aver;
	}
	
private int checkPoint(int point) 
{
	if(point < 0 && point > 100)
	{
	return 0;
	}
	return point;
}
		//		총점을 계산하는 메서드
		public void setTotal() {
			 this.avg = this.k + this.e + this.m;
			this.setAver();
			//k.e.m모두 앞에 this가 붙어있는거임
//			파랑색은 멤버변수
//			갈색 느낌 지역변수
//			영역이 다르면 이름이 같아도 다른 변수로 인식을 함	
		}
		
			private void setAver() {
			this.aver = this.avg/3;
			
		}

}
