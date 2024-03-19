package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해 주십시오\n키: ");
		int m = scanner.nextInt();
		System.out.print("몸무게: ");
		int k = scanner.nextInt();
		
		int bmi = k/m*m;
		
		if(bmi<18.5) {
			System.out.println("저체중입니다.");
		}else if(bmi>24.9) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("정상체중입니다.");
		}
		
		scanner.close();

	}

}
