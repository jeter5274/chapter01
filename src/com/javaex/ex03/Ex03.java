package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		
		int point = sc.nextInt();
		/*
		if (point > 0) {
			System.out.println("양수");
		}else if(point < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		*/
		
		if(point > 0)	System.out.println("양수");
		else if(point < 0)	System.out.println("음수");
		else	System.out.println("0");
		
		sc.close();
	}

}
