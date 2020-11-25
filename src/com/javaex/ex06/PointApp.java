package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p01 = new Point();
		
		p01.setX(3);
		p01.setY(5);
		
		/*
		String str = p01.toString();
		System.out.println(str);
		*/
		//위 코드를 이렇게도 사용할 수 있음
		System.out.println(p01.toString());
		
		//최종은 메소드 일반 로직을 사용함
		p01.draw();
		
		Point p02 = new Point(100, 100);
		p02.draw();
		
		p02.draw(true);
		p02.draw(false);
		
	}

}
