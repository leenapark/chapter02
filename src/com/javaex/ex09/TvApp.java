package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		// 메인 스토리
		
		Tv tv = new Tv(7, 20, false);
		
		System.out.println(tv.toString());
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
