package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개를 입력해주세요\n숫자1: ");
		int n1 = scanner.nextInt();
		System.out.print("숫자2 :");
		int n2 = scanner.nextInt();
		
		if(n1>n2) {
			System.out.println("큰수: "+n1+"\t"+"작은수: "+n2+"입니다.");
		}else if(n1<n2) {
			System.out.println("큰수: "+n2+"\t"+"작은수: "+n1+"입니다.");
		}
		scanner.close();
	}

}
