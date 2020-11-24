package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
		
	//생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드 - getter / setter
	/*
	//메소드 - 일반
	//name 등록하는 기능
	//setName() 이름 등록
	public void setName(String n) {//void 아무것도 쓸 수 없을 때 비워둔다는 의미로 사용된다
		name = n; //"니콘""LG그램""머그컵" 등등등 올 수 있는 다용도 틀
		//return은 생략 가능
	}
	//name 읽어주는 기능
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
	*/
	
	//프린트 명 통일해주는 법
	public void showInfo() {
		System.out.println("상품이름: " + name + " 가격: " + price);
	}
	
}
