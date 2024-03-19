package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수익을 입력해 주세요\n금익: ");
		int m = scanner.nextInt();
		double r;
		if(m>=8000) {
			r= (float)(1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(m-8000);
			System.out.println("소득세는 "+r+" 입니다.");
		}else if(m>4000) {
			r= (float)(1000*0.09)+(3000*0.18)+0.27*(m-4000);
			System.out.println("소득세는 "+r+" 입니다.");
		}else if(m>1000) {
			r= (float)(1000*0.09)+0.18*(m-1000);
			System.out.println("소득세는 "+r+" 입니다.");
		}else if(m>=0){
			r= 0.09*m;
			System.out.println("소득세는 "+r+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		scanner.close();
	}

}
