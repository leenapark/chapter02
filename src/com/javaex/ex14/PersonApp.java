package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		//메인
		/*
		Person p01 = new Person("정우성", 45);
		System.out.println(p01.toString());
		
		Student p02 = new Student("서울 고등학교");
		System.out.println(p02.toString());
		*/
		
		Person p03 = new Person("박명수", 50);
		System.out.println(p03.toString());
		
		
		Student p04 = new Student("이효리", 44, "제주 고등학교");
		System.out.println(p04.toString());
		p04.showInfo();
		
	}

}
