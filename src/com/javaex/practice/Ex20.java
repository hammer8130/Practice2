package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
//		if-else문
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 1글자(소문자)를 입력하세요\n알파벳: ");
		String alp = scanner.next();
		
		if(alp=="a") {
			System.out.println("모음입니다");
		}else if(alp=="e") {
			System.out.println("모음입니다");
		}else if(alp=="i") {
			System.out.println("모음입니다");
		}else if(alp=="o") {
			System.out.println("모음입니다");
		}else if(alp=="u") {
			System.out.println("모음입니다");
		}else {
			System.out.println("자음입니다");
		}
		
		scanner.close();
	}

}
