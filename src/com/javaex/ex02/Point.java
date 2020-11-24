package com.javaex.ex02;

public class Point {
	//필드값
	//캡슐화
	private int x;
	private int y;
	
	//double 연습
	//private double z;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	//메소드 만들기
	//setter 이름 등록
	public void setx(int xset) {
		x = xset;
	}
	
	//getter 이름 읽기
	public int getx() {
		return x;
	}
	
	
	//setter
	public void sety(int yset) {
		y = yset;
	}
	//getter
	public int gety() {
		return y;
	}
	
	public void setZ(double zSet) {
		z = zSet;
	}
	
	public double getZ() {
		return z;
	}
	*/
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
