package com.javaex.ex04;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {//다른 생성자가 있으면 (명령이 없더라도) 생략할 수 없다
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		this.name = name;
	}
	
	//메소드 getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품이름: " + name + " 가격: " + price);
	}
}
