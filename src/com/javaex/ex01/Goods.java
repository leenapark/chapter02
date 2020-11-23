package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
		
	//생성자	
	//메소드 - getter / setter
	
	//메소드 - 일반
	//name 등록하는 기능
	//setName() 이름 등록
	public void setName(String n) {
		name = n; //"니콘""LG그램""머그컵" 등등등
		//return은 생략 가능
	}
	//getName() 이름 읽기
	public String getName() {
		return name;
	}
	//setPrice() 가격 등록
	public void setPrice(int p) {
		price = p;
	}

	//setPrice() 가격 읽기
	public int getPrice() {
		return price;
	}
}
