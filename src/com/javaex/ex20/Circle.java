package com.javaex.ex20;

public class Circle extends Shape {

	//필드
	private int radius;

	
	//생성자 2개
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
	//draw
	public void draw() {
		System.out.println("원 - 면색: " + fillColor + " 선색: " + lineColor + " 반지름: " + radius);
	}

	public double area() {
		return radius*radius*3.14;
	}
	
	
	//test
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
}
