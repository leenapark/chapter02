package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		//메인스토리
		
		//배열식으로 짜보기 Person
		Person p01 = new Person("둘리", 1203);
		//System.out.println(p01.toString()); //100명 관리중
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		Person[] pArray = new Person[3];
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		//프린트 관리
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		//배열식으로 짜보기 Person(부모) - Student(자식)
		Student[] sArray = new Student[2];
		
		
		//상속된 자식 필드를 써줘야 부모까지 실행됨
		Student s01 = new Student("유재석", 44, "서울고등학교");
		//System.out.println(s01.toString());
		Student s02 = new Student("강호동", 47, "경기고등학교");
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].showInfo();
		}
		
		
		/*
		//s01.showInfo2();	//Student 가 원하는 showInfo() 기능
		//s01.showInfo();	//부모쪽 showInfo()가 호출됨 --> 학교 정보 x
		
		s01.showInfo(); 를 사용할 수도 있게 된다 X
		*/
		
		
		//Stydent.showInfo2() --> Student.showInfo() 부모와 자식의 쇼인포를 같게 만들어줌
		//s01.showInfo();	//부모쪽의 showInfo()를 사용할 수 없게됨
		
		
	}

}
