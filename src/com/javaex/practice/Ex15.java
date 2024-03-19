package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력되는 내용을 입력하세요\n기호: ");
		String c = scanner.next();
		System.out.print("숫자1: ");
		int n1= scanner.nextInt();
		System.out.print("숫자2: ");
		int n2= scanner.nextInt();
		
		if(c=="+") {
			System.out.println(n1+n2);
		}else if(c=="-") {
			System.out.println(n1-n2);
		}else if(c=="*") {
			System.out.println(n1*n2);
		}else if(c=="/") {
			System.out.println(n1/n2);
		}else if(n2==0) {
			System.out.println("계산할 수 없습니다.");
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		scanner.close();
	}

}
