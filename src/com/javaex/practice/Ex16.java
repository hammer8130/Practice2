package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요\n숫자: ");
		int n = scanner.nextInt();
		float r;
		if(n>0) {
			r=7*n+2;
			System.out.println("계산 결과는 "+r+"입니다.");
		}else if(n<=0) {
			r=(n*n*n)-9*n+2;
			System.out.println("계산 결과는 "+r+"입니다.");
		}
		scanner.close();
	}

}
