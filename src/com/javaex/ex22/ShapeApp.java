package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Point test		
		Drawable p = new Point(3, 4);
		p.draw();
		//getter 를 사용할 수 없음
		
		
		//다른 방식
		Point pp = new Point (6,6);
		pp.draw();
		System.out.println(pp.getX());
		
		System.out.println("======================================================");
		
		//점 + 도형 함께 관리
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("하양", "검정", 3, 2);
		Drawable c01 = new Circle("분홍", "노랑", 10);
		Drawable t01 = new Triangle("분홍", "청록", 12, 2);
		Drawable p01 = new Point(8, 3);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//draw(); 전체 그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		System.out.println("전체 면적 구하기=================================================");
		
		//전체 면적 구하기 (Point 제외)
		//area test
		((Shape)c01).area();
		
		//순차적으로 area() 조건 - 부모가 Shape이면 면적을 구한다
		for(int i=0; i<dArray.length; i++) {
			//Point 때문에 출력 값이 오류가 난다 왜냐면 포인트는 Shape의 상속자가 아니기 때문이다
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());	
			}
			
		}
	}

}
