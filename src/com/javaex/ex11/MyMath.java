package com.javaex.ex11;

public class MyMath {
	
	private static double pi = 3.14;
	
	//필드 - 생략
	//생성자 - 생략 디폴트 생성자 사용
	//메소드 getter/setter - 필드가 없어서 생략
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a + b;
		//int sum = a + b; --> return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	//반지름 계산식을 만들어보자(심화 학습 예제)
	public static double circle(double r) {
		return r*r*pi;
	}
	
}
