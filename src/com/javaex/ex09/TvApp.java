package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		// 메인 스토리
		
		Tv tv = new Tv(7, 20, false);
		
		System.out.println(tv.toString());
		
		tv.power(true);
		
		

	}

}
