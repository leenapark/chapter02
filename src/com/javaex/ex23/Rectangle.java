package com.javaex.ex23;

public class Rectangle {
	
	//필드
	private int width;
	private int height;

	
	//생성자
	public Rectangle() {
	}
	
	public Rectangle(int width, int height) {
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

	public int getHetght() {
		return height;
	}

	public void setHetght(int hetght) {
		this.height = hetght;
	}

	
	//메소드 일반
	public void showInfo() {
		System.out.println("가로:" + width + " 세로:" + height);
	}
	
	
	//test
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}

	
	

}
