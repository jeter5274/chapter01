package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int i, result=0;
		
		for (i=1; i<=10; i++) {
			result += i;
			System.out.println(i+ "까지의 합은 " +result);
		}
		System.out.println("1부터 " +(i-1)+ "까지 정수의 합은 " +result+ " 입니다.");

	}

}
