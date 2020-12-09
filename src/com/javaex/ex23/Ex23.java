package com.javaex.ex23;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// 100을 입력한 숫자로 나누는 프로그램

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		double sum = 100 / num;

		System.out.println(sum);

		sc.close();
	}

}
