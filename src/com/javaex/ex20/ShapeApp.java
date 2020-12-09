package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		//메인
		//배열로 관리하기
		//Shape 배열 만들기
		Shape[] sArray = new Shape[2];
		
		//사각형 만들기
		//Ractangle r = new Ractangle("검정", "하양", 11, 8); --> dksehla
		Shape r01 = new Rectangle("검정", "하양", 11, 8);
				
		
		//원 만들기
		//Circle c = new Circle("분홍", "노랑", 20); --> 안됨
		Shape c01 = new Circle("분홍", "노랑", 20);
		
		//배열에 주소 넣기
		sArray[0] = r01;
		sArray[1] = c01;
		
		for(int i=0; i<sArray.length; i++) {
			//System.out.println(sArray[i].toString());
			sArray[i].draw();
		}
		
		//문제 발생 --> 추상 클래스(abstract)
		//Shape s = new Shape("빨강", "검정");
		//s.draw();
		
		//abstract area 확인해보기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		/*
		//테스트
		Shape s = new Shape("빨강", "빨강");
		System.out.println(s.toString());

		Ractangle r = new Ractangle("검정", "하양", 11, 8);
		System.out.println(r.toString());
		
		Circle c = new Circle("분홍", "노랑", 20);
		System.out.println(c.toString());
		*/
	}

}
