package com.biz.exec;

import java.util.ArrayList;
import java.util.List;

public class ListService {

	List<String> strList = null;
	
	public ListService() {
		strList = new ArrayList<String>();
	}
	public void makeList() {
		
	}
	
	public List<String> makeList(String str){
		return null;
		//return타입이 class형인 경우
		//최소한 null값이라도 return해 주어야 한다
	}
	//return type이 class인 method는
	//return하는 내용이 무엇이던지
	//그 주소를 return한다
	public List<String> makeList(String str1, String str2){
		
		strList.add(str1);
		strList.add(str2);
		
		return strList;
	}
}	
