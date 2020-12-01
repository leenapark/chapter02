package com.javaex.ex18;

public class ColorPoint extends Point{
	
	//	필드
	private String color;

	//	생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	//	메소드 g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//	메소드 일반
	//	출력용 showInfo()
	public void showInfo() {
		System.out.println("x: " + getX() + " y: " + getY() + " color: " + color);
	}

	//	test 용 toString
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	

	
	
	
}
