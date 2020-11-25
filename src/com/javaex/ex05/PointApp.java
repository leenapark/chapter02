package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		// 생성자 Point
		// setter 사용
		// draw(); 확인
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(2);
		p1.draw();
		
		// 생성자 Point
		// setter 사용 X
		// draw();확인
		Point p2 = new Point(5, 5);
		p2.draw();
		
		// 생성자 Point(int x)
		// setter setY 사용
		// draw(); 확인
		Point p3 = new Point(10);
		p3.setY(23);
		p3.draw();
		
		// 생성자 Point(int y)
		// setY() 사용
		// draw(); 확인
		
	}

}
