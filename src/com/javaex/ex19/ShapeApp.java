package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		//	메인
		//	배열로 관리하기
		Rectangle[] rArray = new Rectangle[3];
		
		
		//	사각형 테스트
		Rectangle r01 = new Rectangle("빨강", "노랑", 5,10);
		Rectangle r02 = new Rectangle("검정", "하양", 11, 8);
		Rectangle r03 = new Rectangle("분홍", "노랑", 11, 9);

		//	배열에 주소값 대입
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//	사각형 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		/*
		//System.out.println(r01.toString()); //test
		r01.draw();
		r02.draw();
		r03.draw();	
		*/
		
		//원 테스트
		Circle c01 = new Circle("파랑", "파랑", 5);
		System.out.println(c01.toString());
		c01.draw();
		
	}

}
