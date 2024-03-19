package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n1 = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = scanner.nextInt();
		
		if(n2>n1&&n2%n1==0) {
			System.out.println(n1+"는(은) "+n2+" 의 약수입니다.");
		}
		else if(n1>n2&&n1%n2==0) {
			System.out.println(n2+"는(은) "+n1+" 의 약수입니다.");
		}else if(n1>n2&&n1%n2!=0) {
			System.out.println(n2+"는(은) "+n1+" 의 약수가 아닙니다.");
		}else if(n2>n1&&n2%n1!=0) {
			System.out.println(n1+"는(은) "+n2+" 의 약수가 아닙니다.");
		}
		
		scanner.close();
	}
}
