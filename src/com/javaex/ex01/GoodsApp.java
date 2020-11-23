package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		//캡슐화로 사용 불가
		/*
		camera.name = "니콘";
		camera.price = 400000;
		//틀에 직접 값이 적용되는 게 아니라 틀이 만들어 둔 메모리에 값을 넣은 것
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		//위의 값을 변경하는 게 아니라 새로 값을 매겨준다
		camera.price = 450000;
		
		System.out.println(camera.price);
		*/
		
		
		//
		camera.setName("니콘");
		String name = camera.getName();
	
		System.out.println(name);
		
		//price
		camera.setPrice(400000);
		int price = camera.getPrice();
		System.out.println(price);
		
	}

}
