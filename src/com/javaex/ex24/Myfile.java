package com.javaex.ex24;

import java.io.IOException;

public class Myfile {
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	
	//상황1
	//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
	public String fileRead(String path) {
		//복잡한 로직
		//경로에 파일이 있는지 확인하는 로직
		return "학교종이 땡땡땡 어서 모이자";
	}
	
	
	
	//상황2 (프로그램을 만드는 입장 - 오류 IOException()까지 처리를 해준다)
	//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
	public String fileRead2(String path){
		//복잡한 로직
			//파일이 없을 경우
		try {
			throw new IOException(); // 파일을 못찾은 경우
		}catch(IOException e) {
			System.out.println("파일이 없습니다");
		}
		return "학교종이 땡땡땡";
		// 개발자가 예외 상황 발생은 인지
		// 처리 방법은 결정할 수 없음 사용하는 쪽에서 결정해야함
		//System.out.println("파일 오류"); <--예외 발생으로 실행 불가

	}
	
	//상황3 만드는 입장에서 IOException() 처리까지 완료
	//	고객들은 불만...사용하는 쪽에서 처리하게 둠
	//				예외 처리 방식이 다양해짐
	public String fileRead3(String path) throws IOException{
		//복잡한 로직
			//파일이 없을 경우
			throw new IOException(); // 파일을 못찾은 경우

		// 개발자가 예외 상황 발생은 인지
		// 처리 방법은 결정할 수 없음 사용하는 쪽에서 결정해야함
		// 에러만 알려줌

	}
	
	
}
