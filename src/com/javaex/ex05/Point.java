package com.javaex.ex05;

public class Point {
	
	//필드값
	private int x;
	private int y;
	
	//생성자
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	/* 자료형까지 같으면 같은 걸로 인식이 되어 오류가 난다
	 * 생성자는 자료형까지 인식 자료형까지 구분한다
	public Point (int y) {
		this.y = y;
	}
	*/
	
	//메소드 getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 일반 : (사용자 화면 - 실무에서는 복잡한 로직으로 이뤄짐)
	public void draw() {
		System.out.println("점 [x="+x+" y="+y+"]을 그렸습니다");
	}
	

}
