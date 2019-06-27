package com.biz.exec;

public class Exec_01 {

	public static void main(String[] args) {

		JavaService js = new JavaService();
		
		int ret ;
		//ret = js.add();
		ret = js.add(100);
		System.out.println(ret);
		ret = js.add(200,500);
		System.out.println(ret);
		
	}

}
