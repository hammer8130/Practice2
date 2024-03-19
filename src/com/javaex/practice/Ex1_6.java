package com.javaex.practice;

import java.util.Scanner;

public class Ex1_6 {

	public static void main(String[] args) {
//		Ex01: 6
//		Ex02: 3 4 5 6 
//		Ex03: if(age >0 && age<18
//		Ex04: if(x==0)
//		Ex05: 2번그룹입니다. 2번그룹입니다. 2번그룹입니다. 1번그룹입니다. 1번그룹입니다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요\n나이: ");
		int age = scanner.nextInt();
		if(age>=19&&age<65) {
			System.out.println("1번그룹 입니다.");
		}else {
			System.out.println("2번그룹 입니다.");
		}
		scanner.close();
	}

}
