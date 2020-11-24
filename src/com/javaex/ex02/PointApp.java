package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		//메인
		Point p1 = new Point(2, 2);
		p1.draw();
		
		Point p2 = new Point(5, 5);
		p2.draw();
		
		Point p3 = new Point(10, 23);
		p3.draw();
		
		Point p4 = new Point(33, 55);
		p4.draw();
				
		/*캡슐화
		p1.x = 2;
		p1.y = 2;
		*/
		
		/*
		p1.setx(2);
		int x = p1.getx();
		
		p1.sety(2);
		int y = p1.gety();
		
		
		Point p2 = new Point();
		
		p2.setx(5);
		int x1 = p2.getx();
		
		p2.sety(5);
		int y1 = p2.gety();
		
		p2.draw();
		
		Point p3 = new Point();
		
		p3.setx(10);
		int x2 = p3.getx();
		
		p3.sety(23);
		int y2 = p3.gety();
		
		p3.draw();
		
		Point p4 = new Point();
		
		p4.setZ(2.5);
		double z = p4.getZ();
		
		System.out.println(z);
		*/
		
	}

}
