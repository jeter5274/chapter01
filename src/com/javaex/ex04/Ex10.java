package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int num;
		//boolean action=true; 논리형 변수를 이용해서 브레이크로 사용하는 법
		Scanner sc = new Scanner(System.in);
		
		while(true /*action*/) {
			
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				//action = false;
				break;
			}else if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");	
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		sc.close();

	}

}
