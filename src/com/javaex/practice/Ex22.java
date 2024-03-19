package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 3개를 입력해주세요\n숫자1: ");
		int n1=scanner.nextInt();
		System.out.print("숫자2: ");
		int n2=scanner.nextInt();
		System.out.print("숫자3: ");
		int n3=scanner.nextInt();
		
		if(n1>n2&&n1>n3) {
			System.out.println("가장 큰 수는 "+n1+" 입니다.");
		}else if(n2>n1&&n2>n2) {
			System.out.println("가장 큰 수는 "+n2+" 입니다.");
		}else if(n3>n1&&n3>n2) {
			System.out.println("가장 큰 수는 "+n3+" 입니다.");
		}
		
		scanner.close();
	}

}
