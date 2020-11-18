package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			
			if(i % 2 ==0 && i % 3 ==0) {
				continue;
				//break;
				//System.out.println("break문"); 말이 안되는 문구라 오류
			}
			
			System.out.println(i);
			
		}
	}

}
