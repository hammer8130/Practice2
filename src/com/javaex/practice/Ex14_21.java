package com.javaex.practice;

import java.util.Scanner;
// 21번 문제로 풀었습니다.
public class Ex14_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("사번(정수)를 입력해주세요.\n사번: ");
		int num = scanner.nextInt();

		if(num%3==0&&num>0) {
			System.out.println("A팀입니다");
		}else if(num%3==1) {
			System.out.println("B팀입니다");
		}else if(num%3==2) {
			System.out.println("C팀입니다");
		}else if(num*0==0) {
			System.out.println("잘못된 사번입니다");
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		scanner.close();
	}

}
