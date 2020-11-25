package com.javaex.ex06;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter/setter
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

	
	//메소드 일반 - 잘 되고 있는지 확인할 때 test용으로도 쓰인다
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//메소드 일반 : (사용자 화면 - 실무에서는 복잡한 로직으로 이뤄짐)
	public void draw() {
		System.out.println("점 [x="+x+" y="+y+"]을 그렸습니다");
	}
	
	// 메소드 오버로딩
	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("점 [x="+x+" y="+y+"]을 그렸습니다");
		}else {
			System.out.println("점 [x="+getX()+" y="+getY()+"]을 지웠습니다");
		}
	}
	
}
