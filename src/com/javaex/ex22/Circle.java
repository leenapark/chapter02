package com.javaex.ex22;

public class Circle extends Shape implements Drawable{
	
	//필드
	private int radius;
	
	//생성자
	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}


	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	//메소드 일반
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 - 면색: " + fillColor + " 선색: " + lineColor + " 반지름: " + radius);
	}

	public double area() {
		return radius*radius*3.14;
	}

}
