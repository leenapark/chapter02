package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		
		// Goods 관리를 위한 배열
		//순서
		//(1)
		Goods[] goodsArray = new Goods[3];
		//(2)(3)(4)
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 1000000);
		Goods cup = new Goods("머그컵", 2000);
		//(5)(6)(7)
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		
		for(int i=0; i<goodsArray.length; i++) {
			/*
			System.out.println(goodsArray[i].getName());
			System.out.println(goodsArray[i].getPrice());
			*/
			//test용 출력
			System.out.println(goodsArray[i].toString());
			//최종 출력
			goodsArray[i].showInfo();
		}
		
		cup.setPrice(9000);
		goodsArray[2].getPrice();
		goodsArray[2].showInfo(); //같은 메모리를 공유하기 때문에 setPrice변경해도 같이 적용됨
		
		
	}

}
