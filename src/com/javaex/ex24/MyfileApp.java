package com.javaex.ex24;

import java.io.IOException;

public class MyfileApp {

	public static void main(String[] args) {
		// 메인
		//상황1 - 정상적인 경우 : 일반(사용하는 입장)
		Myfile mf = new Myfile();
		String str = mf.fileRead("C:/javaStude/test.txt");
		System.out.println(str);
		
		
		
		//상황2 - 예외가 발생하는 경우(사용하는 입장) - 예외처리된 메소드 사용
		Myfile mf2 = new Myfile();
		String str2 = mf2.fileRead2("C:/javaStude/test.txt");
		
		
		//상황3 - 상황2에서 예외 처리를 사용하는 입장에서 해야하는 경우
		//		만든쪽에서 어떤 예외 상황이 발생하는지 알려주고 반드시 처리한다
		Myfile mf3 = new Myfile();
		try {
			String str3 = mf.fileRead3("C:/javaStude/test.txt");
		}catch(IOException e) {
			System.out.println("파일을 강제로 만들어서 오류없이 처리");
		}
		
		
		//상황 2는 프로그램 만드는 입장에서 예외처리를 한 경우
		//상황 3는 사용하는 입장에서 예외처리를 한 경우
	}

}
