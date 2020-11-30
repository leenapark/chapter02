package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		//메인 스토리
		Point p1 = new Point(4, 4);
		//System.out.println(p1.toString());
		
		ColorPoint cp1 = new ColorPoint("red");
		//System.out.println(cp1.toString());
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		//System.out.println(cp2.toString());
		
		p1.showInfo();
		cp1.showInfo();
		cp2.showInfo();
		
	}

}
