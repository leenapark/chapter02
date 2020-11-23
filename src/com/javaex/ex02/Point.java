package com.javaex.ex02;

public class Point {
	//필드값
	//캡슐화
	private int x;
	private int y;

	//메소드 만들기
	//setter 이름 등록
	int setx(int xset) {
		x = xset;
		return x;
	}
	
	//getter 이름 읽기
	public int getx() {
		return x;
	}
	
	
	//setter
	public int sety(int yset) {
		y = yset;
		return y;
	}
	//getter
	public int gety(int yget) {
		return y;
	}
	
	
	//p1 p2 p3 p4

}
