package com.biz.exec;

public class JavaService {

	private int sum;
	
	public JavaService() {
		sum = 0;
	}
	
	public void add() {
	//void형이기 때문에 return이 필요 없다	
	}
	
	public int add(int num) {
	//정수값(int)값을 return 해야하는 method
		return 0;
	}
	
	public int add(int num1,int num2) {
	//정수값(int)값을 return 해야하는 method
		/*
		 * 매개변수로 받은 2개의 값을 덧셈해서
		 * sum이라는 변수에 저장
		 * sum 변수를 return
		 */
		
		sum = num1 + num2;
	/*
	 * return이 하는 일
	 * sum 변수가 int 형으로 선언되어 있기 떄문에
	 * sum에 담겨있는 num1 + num2의 계산값을 return	
	 */
		return sum;
	}
	
	
}
