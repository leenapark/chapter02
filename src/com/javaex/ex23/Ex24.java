package com.javaex.ex23;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정상적인 경우
		Rectangle r = new Rectangle(5, 5);
		r.showInfo();
		
		//NullPointerException
		/*문제 발생 코드
		Ractangle r01;
		r01.showInfo();
		*/
		try {
			Rectangle r01 = null;
			r01.showInfo();
		}catch(NullPointerException e) {
			System.out.println("널포인트 발생 --> 처리로직");
		}
		
		
		//배열 오류 문제
		//ArrayIndexOutOfBoundsException
		try {
			int[] intArray = new int[] {3, 6, 9};
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 밖 --> 처리로직");
			System.out.println(e.toString());
		}
		
		
	}

}
