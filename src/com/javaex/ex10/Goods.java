package com.javaex.ex10;

public class Goods {
	// 필드
	private String name;
	private int price;
	private static int totalcount;
	
	// 생성자
	public Goods() {
		totalcount = totalcount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalcount = totalcount + 1;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalcount = totalcount + 1;
	}

	
	// 메소드 getter/setter
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

	public int getTotalcount() {
		return totalcount;
	}
	
	//메소드 일반

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalcount=" + totalcount + "]";
	}
	
	
	
	public void showInfo() {
		System.out.println("상품명: "+name+" 가격: "+price);
	}

}
