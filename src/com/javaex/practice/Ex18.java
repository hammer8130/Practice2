package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 1글자(소문자)를 입력하세요\n알파벳: ");
		String alp = scanner.next();
		String mes;
		switch(alp) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			mes="모음입니다";
			break;
		
		default:
			mes="자음입니다";
			break;
		}
		System.out.println(mes);
		scanner.close();
	}

}
