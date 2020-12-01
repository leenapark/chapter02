package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		//	메인스토리
		
		/*
		// 	메소드 오버라이딩 test
		//	Person, Student 를 한 그룹으로 관리하는 법
		//	꼭 부모 자식 간에만 성립이 됨
		
		//	test
		//	자료형을 통일하고, 자식 틀은 유지하고 싶음
		//	섞어쓰기
		Person s01 = new Student("유재석", 44, "서울고등학교");
		
		//	자식쪽 Student의 코드를 사용할 수 없다
		//	s01.getSchoolName(); 사용 불가
		
		
		//부모쪽의 showInfo를 사용 예상 --> X
		//자식 코드 중 이름이 부모와 같으면 자식께 덮어씌워져서 적용됨
		s01.showInfo(); //--> 자식 코드가 사용되었음 *오버라이딩
		*/
		
		//배열로 만들어 담기
		Person[] psArray = new Person[5];
		
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		//메소드 오버로딩 섞어쓰기
		Person s01 = new Student("유재석", 44, "서울 고등학교");
		Person s02 = new Student("강호동", 47, "경기 고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		//다운 캐스팅
		System.out.println("======================");
		((Student)psArray[4]).setSchoolName("마산 고등학교");
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		//케스팅 테스트
		Person t01 = psArray[4];
		//Student t02 = psArray[4];	//자료형이 달라 오류남
		Student t03 = (Student)psArray[4];
		Person t04 = (Student)psArray[4]; //자동으로 업캐스팅 됨
	}

}
