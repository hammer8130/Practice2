package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n1 = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = scanner.nextInt();
		
		int s,m=0;
		if(n1>n2) {
			s=n1/n2;
			m=n1%n2;
			System.out.println("몫: "+s+"\n나머지: "+m);
		}else if(n1<n2) {
			s=n2/n1;
			m=n2%n1;
			System.out.println("몫: "+s+"\n나머지: "+m);
		}
	scanner.close();
	}
}
