package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("태어난 년도를 입력해 주세요\n년도: ");
		int year = scanner.nextInt();
		final int year2=2023;
		int age=year2-year;
		
		System.out.print("올해:"+year2+"\n");
		System.out.print("태어난해:"+year+"\n");
		System.out.print("나이:"+age+"\n");
		System.out.println("================");
		if(year%2==0) {
			System.out.println("건강검진해");
		}else {
			System.out.println("건강검진해 아님");
		}
		
		if(age<20) {
			System.out.println("20살미만 건강검진대상이 아님");
		}else if(age>=40) {
			System.out.println("건강검진 무료 검사 가능");
		}else if(age>=40) {
			System.out.println("암 검사 무료 가능");
		}
		
	}

}
