package com.javaex.ex22;

public class Rectangle extends Shape implements Drawable {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}



	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	@Override
	public void draw() {
		System.out.println("사각형 - 면색: " + fillColor + " 선색: " + lineColor + " 가로: " + width + " 세로: " + height);
	}

	@Override
	public double area() {
		return width*height;
	}

}
