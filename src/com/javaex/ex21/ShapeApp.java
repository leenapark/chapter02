package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sArray = new Shape[3];
		
		Shape c01 = new Circle("하양", "검정", 8);
		Shape r01 = new Ractangle("분홍", "노랑", 11, 10);
		Shape T01 = new Triangle("분홍", "청록", 10, 10);
		
		sArray[0] = c01;
		sArray[1] = r01;
		sArray[2] = T01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
