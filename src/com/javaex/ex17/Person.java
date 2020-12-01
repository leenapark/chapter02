package com.javaex.ex17;

public class Person {
	
	// 필드값
	private String name;
	private int age;
	
	// 생성자
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	// 메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// 메소드 일반
	//최종 출력용
	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age);
	}
	
	
	//test 용 toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

	
	

}
