package com.javaex.ex18;

public class ColorPoint extends Point{
	
	//	필드
	protected String color;

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
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	
}
