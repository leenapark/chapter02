package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		//메인 스토리
		Point[] tp = new Point[4];
		
		Point p1 = new Point(8, 3);
		Point p2 = new Point(2, 15);
		Point cp1 = new ColorPoint(18, 63, "black");
		Point cp2 = new ColorPoint(51, 49, "white");
		
		tp[0] = p1;
		tp[1] = p2;
		tp[2] = cp1;
		tp[3] = cp2;
		
		for(int i=0; i<tp.length; i++) {
			//System.out.println(tp[i].toString());
			tp[i].showInfo();
		}
	}

}
