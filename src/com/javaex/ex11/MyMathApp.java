package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		// 메모리 스토리
		// 디폴트 생성자가 사용되고 있음
		// static 영역을 사용하는 거라 따로 메모리는 잡지 않는다
		
		int sum = MyMath.plus(3, 5);
		System.out.println(sum);
		
		double sum1 = MyMath.plus(3.3, 3.4);
		System.out.println(sum1);
		
		//메소드 마이너스 테스트
		//Static이 먼저 적용이 되기 때문에 오류남
		//int sum2 = minus(100-10);
		
	}
	/*
	//메소드
		public int minus(int a, int b) {
			return a-b;
		}*/
}
