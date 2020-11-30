package com.javaex.ex14;

public class Student extends Person {
	
	
	//필드
	private String schoolName;
	
	//생성자
	
	public Student() {
		System.out.println("Student()");
	}
	
	
	public Student(String schoolName) {
		//person(); 부모쪽 디폴트 생성자 실행
		//super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	
	public Student(String name, int age, String schoolName) {
		//1. 자신의 생성자 시작 --> 완료 X
		//2. 부모의 생성자 호출
		//   -부모의 생성자를 선택할 수 있다
		//   -선택(코드로 쓰기)하지 않으면 디폴터 생성자가 실행된다
		//3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다
		
		
		//메모리 올리는 작업
		//따로 부른 생성자가 없을 경우 Person(); 부모쪽 디폴트 생성자 실행
		//선택을 하면 선택된 생성자 호출
		//super(파라미터) <--이런식으로 호출함
		super(name, age);
		this.schoolName = schoolName;
			
		System.out.println("Stutent(3)");
		
		/*
		super.setName(schoolName);
		super.setAge(age);
		*/
	}
	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	
	public void showInfo() {
		/*
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(schoolName);
		*/
		System.out.println("이름:" + getName() + " 나이:" + getAge() + " 학교:" + schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	
}
